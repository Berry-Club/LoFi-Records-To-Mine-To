package com.aaronhowser1.lofirecordstomineto;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LoFiRecordsToMineTo.MOD_ID)
public class LoFiRecordsToMineTo {
    public static final String MOD_ID = "lofirecordstomineto";

    public LoFiRecordsToMineTo() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS_REGISTRY.register(eventBus);
        ModSounds.SOUND_EVENT_REGISTRY.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
