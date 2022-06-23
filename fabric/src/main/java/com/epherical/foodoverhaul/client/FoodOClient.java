package com.epherical.foodoverhaul.client;

import com.epherical.foodoverhaul.FoodOverhaulFabric;
import com.epherical.foodoverhaul.object.ModifiedFood;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.world.item.Item;

public class FoodOClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {

        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
            Item item = stack.getItem();
            ModifiedFood food = FoodOverhaulFabric.datapack.getModifiedFood(item);
            if (food != null) {
                lines.add(food.getType().getName());
            }
        });
    }
}
