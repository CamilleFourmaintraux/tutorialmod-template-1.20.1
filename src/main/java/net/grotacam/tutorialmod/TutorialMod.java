package net.grotacam.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.grotacam.tutorialmod.block.ModBlocks;
import net.grotacam.tutorialmod.item.ModItemGroups;
import net.grotacam.tutorialmod.item.ModItems;
import net.grotacam.tutorialmod.utils.ModCustomTrades;
import net.grotacam.tutorialmod.utils.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Initializing tutorialmod!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModCustomTrades.registerCustomTrades();

		ModLootTableModifiers.modifyLootTables();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
	}
}