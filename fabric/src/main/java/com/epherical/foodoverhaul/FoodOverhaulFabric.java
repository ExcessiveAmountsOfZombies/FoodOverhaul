package com.epherical.foodoverhaul;

import com.epherical.foodoverhaul.datapack.FoodDatapack;
import com.epherical.foodoverhaul.object.FoodType;
import com.mojang.serialization.Lifecycle;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.ChatFormatting;
import net.minecraft.core.MappedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;

public class FoodOverhaulFabric implements ModInitializer {

    public static final String MOD_ID = "food_overhaul";

    public static final ResourceKey<Registry<FoodType>> FOOD_TYPE_KEY = ResourceKey.createRegistryKey(modID("food_types"));

    public static final Registry<FoodType> FOOD_TYPES = FabricRegistryBuilder.from(new MappedRegistry<>(FOOD_TYPE_KEY, Lifecycle.experimental(), null)).buildAndRegister();

    public static FoodType RAW;
    public static FoodType SNACK;
    public static FoodType LIGHT_MEAL;
    public static FoodType CANDY;
    public static FoodType DESSERT;
    public static FoodType SMALL_MEAL;
    public static FoodType LARGE_MEAL;
    public static FoodType HEARTY_MEAL;
    public static FoodType FEAST;

    public static final FoodDatapack datapack = new FoodDatapack();


    @Override
    public void onInitialize() {
        RAW = Registry.register(FOOD_TYPES, modID("raw_ingredient"), new FoodType(10, 64, new TextComponent("Raw").setStyle(style(ChatFormatting.GRAY))));
        SNACK = Registry.register(FOOD_TYPES, modID("snack"), new FoodType(16, 64, new TextComponent("Snack").setStyle(style(ChatFormatting.GRAY))));
        LIGHT_MEAL = Registry.register(FOOD_TYPES, modID("light_meal"), new FoodType(32, 64, new TextComponent("Light Meal").setStyle(style(ChatFormatting.DARK_GREEN))));
        CANDY = Registry.register(FOOD_TYPES, modID("candy"), new FoodType(32, 64, new TextComponent("Candy").setStyle(style(ChatFormatting.LIGHT_PURPLE))));
        DESSERT = Registry.register(FOOD_TYPES, modID("dessert"), new FoodType(48, 32, new TextComponent("Dessert").setStyle(style(ChatFormatting.LIGHT_PURPLE))));
        SMALL_MEAL = Registry.register(FOOD_TYPES, modID("small_meal"), new FoodType(64, 32, new TextComponent("Small Meal").setStyle(style(ChatFormatting.DARK_GREEN))));
        LARGE_MEAL = Registry.register(FOOD_TYPES, modID("large_meal"), new FoodType(70, 16, new TextComponent("Large Meal").setStyle(style(ChatFormatting.YELLOW))));
        HEARTY_MEAL = Registry.register(FOOD_TYPES, modID("hearty_meal"), new FoodType(80, 8, new TextComponent("Hearty Meal").setStyle(style(ChatFormatting.YELLOW))));
        FEAST = Registry.register(FOOD_TYPES, modID("feast"), new FoodType(100, 4, new TextComponent("Feast").setStyle(style(ChatFormatting.GOLD))));

        ResourceManagerHelper.get(PackType.SERVER_DATA).registerReloadListener(datapack);

    }

    public static ResourceLocation modID(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public Style style(ChatFormatting color) {
        return Style.EMPTY.withColor(color);
    }
}
