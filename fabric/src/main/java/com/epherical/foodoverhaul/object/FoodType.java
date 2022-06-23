package com.epherical.foodoverhaul.object;

import net.minecraft.network.chat.Component;

public class FoodType {

    private final Component name;
    private final int consumptionTimeInTicks;
    private final int newStackSize;

    public FoodType(int consumptionTimeInTicks, int newStackSize, Component name) {
        this.name = name;
        this.consumptionTimeInTicks = consumptionTimeInTicks;
        this.newStackSize = newStackSize;
    }

    public Component getName() {
        return name;
    }

    public int getConsumptionTimeInTicks() {
        return consumptionTimeInTicks;
    }

    public int getNewStackSize() {
        return newStackSize;
    }
}
