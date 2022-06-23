package com.epherical.foodoverhaul.datapack;

import com.epherical.foodoverhaul.mixin.FoodPropertiesAccessor;
import com.epherical.foodoverhaul.mixin.ItemAccessor;
import com.epherical.foodoverhaul.object.ModifiedFood;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

public class FoodDatapack extends SimpleJsonResourceReloadListener implements IdentifiableResourceReloadListener {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private final Map<Item, ModifiedFood> MODIFIED_FOODS = new HashMap<>();

    public FoodDatapack() {
        super(GSON, "food_balance");
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> object, ResourceManager resourceManager, ProfilerFiller profiler) {
        MODIFIED_FOODS.clear();

        object.forEach((location, jsonElement) -> {
            Registry.ITEM.getOptional(location).ifPresent(item -> {
                FoodProperties foodProperties = item.getFoodProperties();
                if (foodProperties != null) {
                    ModifiedFood food = ModifiedFood.deserialize(item, jsonElement);
                    MODIFIED_FOODS.put(item, food);

                    ItemAccessor accessor = (ItemAccessor) item;
                    accessor.setMaxStackSize(food.getType().getNewStackSize());

                    FoodPropertiesAccessor foodAccessor = (FoodPropertiesAccessor) foodProperties;
                    foodAccessor.setNutrition(food.getFoodLevel());
                    foodAccessor.setSaturationModifier(food.getSaturation());
                }
            });
        });

    }

    @Override
    public ResourceLocation getFabricId() {
        return new ResourceLocation("food_overhaul", "food_balance");
    }

    public Map<Item, ModifiedFood> getModifiedFoods() {
        return MODIFIED_FOODS;
    }

    public ModifiedFood getModifiedFood(Item item) {
        return MODIFIED_FOODS.get(item);
    }
}
