package net.eeebsie.offensivealcohol;

import net.eeebsie.offensivealcohol.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OffensiveAlcohol implements ModInitializer {
	public static final String MOD_ID = "offensive-alcohol";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.RegisterModItems();
	}
}