package aaronhowser.mods.lofirecordstomineto

import net.minecraft.world.item.CreativeModeTabs
import net.neoforged.fml.common.Mod
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

@Mod(LoFiRecordsToMineTo.ID)
object LoFiRecordsToMineTo {
    const val ID = "lofirecordstomineto"

    init {
        ModItems.ITEM_REGISTRY.register(MOD_BUS)
        ModSounds.SOUND_EVENTS.register(MOD_BUS)

        MOD_BUS.addListener(::addToCreativeTab)
    }

    private fun addToCreativeTab(event: BuildCreativeModeTabContentsEvent) {
        if (event.tabKey != CreativeModeTabs.TOOLS_AND_UTILITIES) return

        val items = ModItems.ITEM_REGISTRY.entries.map { it.get().defaultInstance }
        event.acceptAll(items)
    }

}