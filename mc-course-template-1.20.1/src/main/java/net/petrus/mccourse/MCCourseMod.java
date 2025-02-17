package net.petrus.mccourse;

import net.fabricmc.api.ModInitializer;

import net.petrus.mccourse.block.ModBlocks;
import net.petrus.mccourse.enchantment.ModEnchantments;
import net.petrus.mccourse.item.ModItemGroup;
import net.petrus.mccourse.item.ModItems;
import net.petrus.mccourse.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
		ModEnchantments.registerModEnchantments();

	}
}