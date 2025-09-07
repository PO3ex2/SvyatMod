package net.p3x.svyat_mod;

import net.fabricmc.api.ModInitializer;

import net.p3x.svyat_mod.block.ModBlocks;
import net.p3x.svyat_mod.item.ModItemGroups;
import net.p3x.svyat_mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SvyatMod implements ModInitializer {
	public static final String MOD_ID = "svyatmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//ya dolboyeb
	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}