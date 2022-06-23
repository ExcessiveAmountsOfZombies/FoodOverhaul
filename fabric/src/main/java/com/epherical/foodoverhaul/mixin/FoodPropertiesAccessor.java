package com.epherical.foodoverhaul.mixin;

import net.minecraft.world.food.FoodProperties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(FoodProperties.class)
public interface FoodPropertiesAccessor {

    @Accessor("nutrition") @Mutable
    void setNutrition(int nutrition);

    @Accessor("saturationModifier") @Mutable
    void setSaturationModifier(float saturationModifier);
}
