package com.epherical.foodoverhaul.datagen;

import com.epherical.foodoverhaul.object.FoodType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.resources.ResourceLocation;

import java.io.IOException;
import java.nio.file.Path;

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
            generate(1, 0.6f, RAW, id(namespace, "apple"), path, cache);
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
            generate(1, 0.6F, RAW, id(namespace, "honey_bottle"), path, cache);
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
            namespace = "croptopia";
            generate(1, 0.3F, RAW, id(namespace, "artichoke"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "asparagus"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "barley"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "basil"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "bellpepper"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "blackbean"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "blackberry"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "blueberry"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "cabbage"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "cantaloupe"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "cauliflower"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "celery"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "chile_pepper"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "coffee_beans"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "corn"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "cranberry"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "cucumber"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "currant"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "eggplant"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "elderberry"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "garlic"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "grape"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "greenbean"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "greenonion"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "honeydew"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "kale"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "kiwi"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "leek"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "lettuce"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "oat"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "olive"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "onion"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "peanut"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "pineapple"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "radish"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "raspberry"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "rhubarb"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "rice"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "rutabaga"), path, cache);
            generate(1, 0.5F, RAW, id(namespace, "saguaro"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "soybean"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "spinach"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "squash"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "strawberry"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "sweetpotato"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "tomatillo"), path, cache);
            generate(1, 0.3F, RAW, id(namespace, "tomato"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "turnip"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "yam"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "zucchini"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "almond"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "apricot"), path, cache);
            generate(1, 0.5F, RAW, id(namespace, "avocado"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "banana"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "cashew"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "cherry"), path, cache);
            generate(1, 0.45F, RAW, id(namespace, "coconut"), path, cache);
            generate(1, 0.5F, RAW, id(namespace, "date"), path, cache);
            generate(1, 0.5F, RAW, id(namespace, "dragonfruit"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "fig"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "grapefruit"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "kumquat"), path, cache);
            generate(1, 0.35F, RAW, id(namespace, "lemon"), path, cache);
            generate(1, 0.35F, RAW, id(namespace, "lime"), path, cache);
            generate(1, 0.35F, RAW, id(namespace, "mango"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "nectarine"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "nutmeg"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "orange"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "peach"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "pear"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "pecan"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "persimmon"), path, cache);
            generate(1, 0.6F, RAW, id(namespace, "plum"), path, cache);
            generate(1, 0.45F, RAW, id(namespace, "starfruit"), path, cache);
            generate(1, 0.2F, RAW, id(namespace, "walnut"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "clam"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "glowing_calamari"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "oyster"), path, cache);
            generate(1, 0.1F, RAW, id(namespace, "tuna"), path, cache);

            generate(3, 0.8F, SNACK, id(namespace, "baked_beans"), path, cache);
            generate(3, 0.8F, LIGHT_MEAL, id(namespace, "baked_sweet_potato"), path, cache);
            generate(3, 0.8F, LIGHT_MEAL, id(namespace, "baked_yam"), path, cache);
            generate(3, 0.8F, LIGHT_MEAL, id(namespace, "cooked_anchovy"), path, cache);
            generate(2, 0.5F, SNACK, id(namespace, "cooked_bacon"), path, cache);
            generate(3, 0.8F, LIGHT_MEAL, id(namespace, "cooked_calamari"), path, cache);
            generate(3, 0.8F, LIGHT_MEAL, id(namespace, "cooked_shrimp"), path, cache);
            generate(3, 0.8F, LIGHT_MEAL, id(namespace, "cooked_tuna"), path, cache);
            generate(2, 0.6F, SNACK, id(namespace, "popcorn"), path, cache);
            generate(2, 0.6F, SNACK, id(namespace, "raisins"), path, cache);
            generate(2, 0.6F, SNACK, id(namespace, "raisins"), path, cache);
            generate(5, 0.6F, SNACK, id(namespace, "toast"), path, cache);

            generate(4, 0.6F, SNACK, id(namespace, "apple_juice"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "cranberry_juice"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "grape_juice"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "melon_juice"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "orange_juice"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "pineapple_juice"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "saguaro_juice"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "tomato_juice"), path, cache);

            generate(4, 0.6F, SNACK, id(namespace, "apricot_jam"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "blackberry_jam"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "blueberry_jam"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "cherry_jam"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "elderberry_jam"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "grape_jam"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "peach_jam"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "raspberry_jam"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "strawberry_jam"), path, cache);

            generate(5, 0.8F, CANDY, id(namespace, "banana_smoothie"), path, cache);
            generate(5, 0.8F, CANDY, id(namespace, "strawberry_smoothie"), path, cache);

            generate(8, 1.0F, DESSERT, id(namespace, "mango_ice_cream"), path, cache);
            generate(8, 1.0F, DESSERT, id(namespace, "pecan_ice_cream"), path, cache);
            generate(8, 1.0F, DESSERT, id(namespace, "strawberry_ice_cream"), path, cache);
            generate(8, 1.0F, DESSERT, id(namespace, "vanilla_ice_cream"), path, cache);

            generate(10, 1.4F, DESSERT, id(namespace, "apple_pie"), path, cache);
            generate(10, 1.4F, DESSERT, id(namespace, "cherry_pie"), path, cache);
            generate(10, 1.4F, DESSERT, id(namespace, "pecan_pie"), path, cache);
            generate(10, 1.4F, DESSERT, id(namespace, "rhubarb_pie"), path, cache);

            generate(4, 0.6F, SNACK, id(namespace, "cheese"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "butter"), path, cache);
            generate(3, 0.35F, SNACK, id(namespace, "tofu"), path, cache);
            generate(6, 0.7F, CANDY, id(namespace, "chocolate"), path, cache);
            generate(6, 0.6F, SNACK, id(namespace, "tortilla"), path, cache);
            generate(5, 0.6F, SNACK, id(namespace, "salsa"), path, cache);
            generate(5, 0.7F, SNACK, id(namespace, "artichoke_dip"), path, cache);
            generate(4, 0.5F, SNACK, id(namespace, "pepperoni"), path, cache);

            generate(3, 0.65F, SNACK, id(namespace, "coffee"), path, cache);
            generate(3, 0.65F, SNACK, id(namespace, "lemonade"), path, cache);
            generate(4, 0.65F, SNACK, id(namespace, "limeade"), path, cache);
            generate(3, 0.65F, SNACK, id(namespace, "soy_milk"), path, cache);

            generate(10, 0.85F, DESSERT, id(namespace, "kale_smoothie"), path, cache);
            generate(6, 0.85F, DESSERT, id(namespace, "fruit_smoothie"), path, cache);
            generate(14, 1.2F, HEARTY_MEAL, id(namespace, "chocolate_milkshake"), path, cache);

            generate(4, 0.6F, SNACK, id(namespace, "beer"), path, cache);
            generate(5, 0.6F, SNACK, id(namespace, "wine"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "mead"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "rum"), path, cache);
            generate(8, 0.85F, DESSERT, id(namespace, "pumpkin_spice_latte"), path, cache);

            generate(5, 0.6F, LIGHT_MEAL, id(namespace, "beef_jerky"), path, cache);
            generate(5, 0.6F, LIGHT_MEAL, id(namespace, "pork_jerky"), path, cache);
            generate(5, 0.6F, SNACK, id(namespace, "kale_chips"), path, cache);
            generate(5, 0.6F, SNACK, id(namespace, "potato_chips"), path, cache);
            generate(4, 0.6F, SNACK, id(namespace, "steamed_rice"), path, cache);
            generate(5, 0.6F, SNACK, id(namespace, "french_fries"), path, cache);
            generate(5, 0.6F, SNACK, id(namespace, "sweet_potato_fries"), path, cache);
            generate(6, 0.65F, SNACK, id(namespace, "onion_rings"), path, cache);
            generate(5, 0.5F, CANDY, id(namespace, "doughnut"), path, cache);
            generate(5, 0.85F, SMALL_MEAL, id(namespace, "cucumber_salad"), path, cache);
            generate(8, 0.75F, SMALL_MEAL, id(namespace, "caesar_salad"), path, cache);
            generate(5, 0.75F, SMALL_MEAL, id(namespace, "leafy_salad"), path, cache);
            generate(6, 0.75F, SMALL_MEAL, id(namespace, "fruit_salad"), path, cache);
            generate(6, 0.75F, SMALL_MEAL, id(namespace, "veggie_salad"), path, cache);
            generate(4, 0.75F, SNACK, id(namespace, "pork_and_beans"), path, cache);
            generate(4, 0.75F, SNACK, id(namespace, "oatmeal"), path, cache);
            generate(6, 0.75F, SMALL_MEAL, id(namespace, "leek_soup"), path, cache);
            generate(4, 0.5F, SNACK, id(namespace, "yoghurt"), path, cache);
            generate(10, 0.5F, SMALL_MEAL, id(namespace, "saucy_chips"), path, cache);
            generate(3, 0.5F, SNACK, id(namespace, "roasted_nuts"), path, cache);
            generate(5, 0.5F, SNACK, id(namespace, "trail_mix"), path, cache);
            generate(5, 0.5F, SNACK, id(namespace, "protein_bar"), path, cache);
            generate(4, 0.5F, SNACK, id(namespace, "nougat"), path, cache);



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
