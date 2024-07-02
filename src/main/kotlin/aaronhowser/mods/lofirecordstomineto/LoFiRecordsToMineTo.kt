package aaronhowser.mods.lofirecordstomineto

import net.minecraft.core.RegistrySetBuilder
import net.minecraft.core.registries.Registries
import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

@Mod(LoFiRecordsToMineTo.ID)
object LoFiRecordsToMineTo {
    const val ID = "lofirecordstomineto"

    // the logger for our mod
    val LOGGER: Logger = LogManager.getLogger(ID)

    init {
        LOGGER.info("I loaded!!!!")

        ModItems.ITEM_REGISTRY.register(MOD_BUS)
        ModSounds.SOUND_EVENTS.register(MOD_BUS)

    }

}