package net.petrus.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.petrus.mccourse.MCCourseMod;
import net.petrus.mccourse.block.ModBlocks;
import net.petrus.mccourse.item.custom.MetalDetectorItem;
import net.petrus.mccourse.item.custom.ModArmorItem;
import net.petrus.mccourse.item.custom.ModDeathPlungeBladeItem;
import net.petrus.mccourse.item.custom.PaxelItem;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet",
            new Item(new FabricItemSettings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",
            new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(256)));

    public static final Item CAULIFLOWER = registerItem("cauliflower",
            new Item(new FabricItemSettings().food(ModFoodComponents.CAULIFLOWER)));
    public static final Item PEAT_BRICK = registerItem("peat_brick",
            new Item(new FabricItemSettings()));

    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",                              // base attack damage=6 en base attack speed=4
            new ModDeathPlungeBladeItem(ModToolMaterial.PINK_GARNET, 0, -2.4f, new FabricItemSettings()));
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterial.PINK_GARNET, 1, 1f, new FabricItemSettings()));
    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterial.PINK_GARNET, 0, 0f, new FabricItemSettings()));
    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterial.PINK_GARNET, 6, -2f, new FabricItemSettings()));
    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterial.PINK_GARNET, 0, 0f, new FabricItemSettings()));

    public static final Item PINK_GARNET_PAXEL = registerItem("pink_garnet_paxel",
            new PaxelItem(ModToolMaterial.PINK_GARNET, 0, 0f, new FabricItemSettings()));

    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item PINK_GARNET_HORSE_ARMOR = registerItem("pink_garnet_horse_armor",
            new HorseArmorItem(14, "pink_garnet", new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(PINK_GARNET);
        entries.add(RAW_PINK_GARNET);

        entries.add(ModBlocks.PINK_GARNET_BLOCK);
        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
        entries.add(ModBlocks.END_STONE_PINK_GARNET_ORE);
        entries.add(ModBlocks.NETHER_PINK_GARNET_ORE);
        entries.add(ModBlocks.PINK_GARNET_ORE);
    }

    public static void registerModItems() {
        MCCourseMod.LOGGER.info("Registering Mod Items for " + MCCourseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
