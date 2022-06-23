package com.epherical.foodoverhaul.datagen;

import com.epherical.foodoverhaul.FoodOverhaulFabric;
import com.epherical.foodoverhaul.object.FoodType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

import static com.epherical.foodoverhaul.FoodOverhaulFabric.*;

public class FoodGeneratorEntry implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(FoodGenerator::new);

    }

    public static class FoodGenerator implements DataProvider {
        private final DataGenerator dataGenerator;
        private final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

        public FoodGenerator(FabricDataGenerator dataGenerator) {
            this.dataGenerator = dataGenerator;
        }

        @Override
        public void run(HashCache cache) throws IOException {
            Path path = this.dataGenerator.getOutputFolder();

            String namespace = "minecraft";
            generate(1, 0.2f, RAW, id(namespace, "apple"), path, cache);
            generate(3, 0.6f, LIGHT_MEAL, id(namespace, "baked_potato"), path, cache);
            generate(1, 0.2f, RAW, id(namespace, "beef"), path, cache);
            generate(1, 0.2f, RAW, id(namespace, "beetroot"), path, cache);
            generate(5, 0.6f, SMALL_MEAL, id(namespace, "beetroot_soup"), path, cache);
            generate(3, 0.4f, SNACK, id(namespace, "bread"), path, cache);
            generate(1, 0.2f, RAW, id(namespace, "carrot"), path, cache);
            generate(1, 0.2f, RAW, id(namespace, "chicken"), path, cache);
            generate(1, 0.2f, RAW, id(namespace, "chorus_fruit"), path, cache);
            generate(1, 0.1f, RAW, id(namespace, "cod"), path, cache);
            generate(3, 0.6f, LIGHT_MEAL, id(namespace, "cooked_beef"), path, cache);
            generate(3, 0.6F, LIGHT_MEAL, id(namespace, "cooked_chicken"), path, cache);
            generate(3, 0.6f, LIGHT_MEAL, id(namespace, "cooked_cod"), path, cache);
            generate(3, 0.6F, LIGHT_MEAL, id(namespace, "cooked_mutton"), path, cache);
            generate(3, 0.6F, LIGHT_MEAL, id(namespace, "cooked_porkchop"), path, cache);
            generate(3, 0.6F, LIGHT_MEAL, id(namespace, "cooked_rabbit"), path, cache);
            generate(3, 0.6F, LIGHT_MEAL, id(namespace, "cooked_salmon"), path, cache);
            generate(2, 0.1F, CANDY, id(namespace, "cookie"), path, cache);
            generate(1, 0.1F, SNACK, id(namespace, "dried_kelp"), path, cache);
            generate(4, 1.2F, SNACK, id(namespace, "enchanted_golden_apple"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "glow_berries"), path, cache);
            generate(4, 1.2F, SNACK, id(namespace, "golden_apple"), path, cache);
            generate(4, 1.2F, SNACK, id(namespace, "golden_carrot"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "honey_bottle"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "melon_slice"), path, cache);
            generate(6, 0.6F, SMALL_MEAL, id(namespace, "mushroom_stew"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "mutton"), path, cache);
            generate(2, 0.3F, RAW, id(namespace, "poisonous_potato"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "porkchop"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "potato"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "pufferfish"), path, cache);
            generate(8, 0.6F, SMALL_MEAL, id(namespace, "pumpkin_pie"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "rabbit"), path, cache);
            generate(8, 0.6F, SMALL_MEAL, id(namespace, "rabbit_stew"), path, cache);
            generate(1, 0.1F, SNACK, id(namespace, "rotten_flesh"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "salmon"), path, cache);
            generate(2, 0.3F, SNACK, id(namespace, "spider_eye"), path, cache);
            generate(6, 0.6F, SMALL_MEAL, id(namespace, "suspicious_stew"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "sweet_berries"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "tropical_fish"), path, cache);
        }

        @Override
        public String getName() {
            return "Food Balance";
        }

        private void generate(int foodLevel, float sat, FoodType type, ResourceLocation key, Path path, HashCache cache) throws IOException {
            Generator generator = new Generator(foodLevel, sat, type);
            DataProvider.save(GSON, cache, generator.generate(), path.resolve("data/" + key.getNamespace() + "/food_balance/" + key.getPath() + ".json"));
        }

        private static ResourceLocation id(String namespace, String path) {
            return new ResourceLocation(namespace, path);
        }
    }


    public static class Generator {

        private final int food;
        private final float sat;
        private final FoodType type;

        public Generator(int food, float sat, FoodType type) {
            this.food = food;
            this.sat = sat;
            this.type = type;
        }

        public JsonElement generate() {
            JsonObject object = new JsonObject();
            object.addProperty("hunger", food);
            object.addProperty("saturation", sat);
            object.addProperty("foodType", FOOD_TYPES.getKey(type).toString());
            return object;
        }

    }
}
