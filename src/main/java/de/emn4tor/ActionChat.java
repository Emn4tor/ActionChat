package de.emn4tor;

import de.emn4tor.event.KeyInputHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActionChat implements ClientModInitializer {
	public static final String MOD_ID = "actionchat";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Lanching ActionChat...");
		KeyInputHandler.registerKeys();
		LOGGER.info("ActionChat launched!");
	}


}