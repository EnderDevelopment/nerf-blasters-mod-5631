package com.pokemongo2016coc.nerfblastersmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NerfBlastersMod implements ModInitializer {
    public static final String MOD_ID = "nerfblastersmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("NerfBlastersMod has been initialized!");
    }
}