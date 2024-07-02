package aaronhowser.mods.lofirecordstomineto

import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Mod(LoFiRecordsToMineTo.ID)
object LoFiRecordsToMineTo {
    const val ID = "lofirecordstomineto"

    // the logger for our mod
    val LOGGER: Logger = LogManager.getLogger(ID)

    init {
        LOGGER.info("I loaded!!!!")
    }

}