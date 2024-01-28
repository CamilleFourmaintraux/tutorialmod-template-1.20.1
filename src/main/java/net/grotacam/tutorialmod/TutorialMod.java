package net.grotacam.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.grotacam.tutorialmod.block.ModBlocks;
import net.grotacam.tutorialmod.item.ModItemGroups;
import net.grotacam.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Initializing my mod!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}