package org.jdanieldavis.ridlocker;

import net.fabricmc.api.ModInitializer;

public class Ridlocker implements ModInitializer
{

    @Override
    public void onInitialize()
    {
        LockerBlocks.registerBlocks();
        LockerBlockEntities.registerBlockEntities();
        LockerScreenHandlers.registerScreenHandlers();
    }
}
