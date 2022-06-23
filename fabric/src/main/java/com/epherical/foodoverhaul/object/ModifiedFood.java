package com.epherical.foodoverhaul.object;

import com.epherical.foodoverhaul.FoodOverhaulFabric;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;

public class ModifiedFood {


    private final Item itemID;
    private final int foodLevel;
    private final float saturation;
    private final FoodType type;

    public ModifiedFood(Item item, int foodLevel, float saturation, FoodType type) {
        this.itemID = item;
        this.foodLevel = foodLevel;
        this.saturation = saturation;
        this.type = type;
    }

    public float getSaturation() {
        return saturation;
    }

    public FoodType getType() {
        return type;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public Item getItemID() {
        return itemID;
    }

    public static ModifiedFood deserialize(Item item, JsonElement element) {
        JsonObject object = element.getAsJsonObject();
        int food = GsonHelper.getAsInt(object, "hunger");
        float sat = GsonHelper.getAsFloat(object, "saturation");
        FoodType type = FoodOverhaulFabric.FOOD_TYPES.get(ResourceLocation.tryParse(GsonHelper.getAsString(object, "foodType")));
        return new ModifiedFood(item, food, sat, type);
    }
}
