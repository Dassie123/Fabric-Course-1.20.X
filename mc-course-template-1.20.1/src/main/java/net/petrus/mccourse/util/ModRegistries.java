package net.petrus.mccourse.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.petrus.mccourse.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs () {
        registerFuels();
    }

    private static void registerFuels () {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.PEAT_BRICK, 200);
    }

}
