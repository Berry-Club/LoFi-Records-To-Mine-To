package aaronhowser.mods.lofirecordstomineto.datagen

import aaronhowser.mods.lofirecordstomineto.LoFiRecordsToMineTo
import aaronhowser.mods.lofirecordstomineto.ModItems
import net.minecraft.data.PackOutput
import net.neoforged.neoforge.common.data.LanguageProvider

class ModLanguageProvider(
    output: PackOutput
) : LanguageProvider(output, LoFiRecordsToMineTo.ID, "en_us") {

    companion object;

    override fun addTranslations() {
        addItems()
    }

    private fun addItems() {

        addItem(ModItems.A_LITTLE_SOMETHING, "A Little Something")

    }

}