package com.epherical.foodoverhaul.mixin;

import com.epherical.foodoverhaul.FoodOverhaulFabric;
import com.epherical.foodoverhaul.object.ModifiedFood;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class ItemMixin {



    @Inject(method = "getUseDuration", cancellable = true, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/Item;getFoodProperties()Lnet/minecraft/world/food/FoodProperties;"))
    public void foodOverhaul$modifyUseDuration(ItemStack stack, CallbackInfoReturnable<Integer> cir) {
        ModifiedFood food = FoodOverhaulFabric.datapack.getModifiedFood((Item) (Object) this);
        if (food != null) {
            cir.setReturnValue(food.getType().getConsumptionTimeInTicks());
        }
    }
}
