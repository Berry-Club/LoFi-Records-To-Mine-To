package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LoFiRecordsToMineTo.MOD_ID)
public class LoFiRecordsToMineTo {
    public static final String MOD_ID = "lofirecordstomineto";

    public LoFiRecordsToMineTo() {
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModSoundEvents.SOUND_EVENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final ItemGroup LO_FI_GROUP = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.INTERDIMENSIONAL.get());
        }
    };
}
