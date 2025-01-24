package aaronhowser.mods.lofirecordstomineto

import aaronhowser.mods.lofirecordstomineto.registry.ModItems
import aaronhowser.mods.lofirecordstomineto.registry.ModSounds
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.CreativeModeTabs
import net.neoforged.fml.common.Mod
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

@Mod(LoFiRecordsToMineTo.ID)
object LoFiRecordsToMineTo {
    const val ID = "lofirecordstomineto"

    fun getRl(string: String): ResourceLocation = ResourceLocation.fromNamespaceAndPath(ID, string)

    init {
        ModItems.ITEM_REGISTRY.register(MOD_BUS)
        ModSounds.SOUND_EVENT_REGISTRY.register(MOD_BUS)

        MOD_BUS.addListener(::addToCreativeTab)
    }

    private fun addToCreativeTab(event: BuildCreativeModeTabContentsEvent) {
        if (event.tabKey != CreativeModeTabs.TOOLS_AND_UTILITIES) return

        val items = ModItems.ITEM_REGISTRY.entries.map { it.get().defaultInstance }
        event.acceptAll(items)
    }

}