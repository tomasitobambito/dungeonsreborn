package net.okense.dungeonsreborn;

import net.fabricmc.api.ModInitializer;

import net.okense.dungeonsreborn.block.ModBlocks;
import net.okense.dungeonsreborn.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DungeonsReborn implements ModInitializer {
	public static final String MOD_ID = "dungeonsreborn";
    public static final Logger LOGGER = LoggerFactory.getLogger("dungeonsreborn");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}