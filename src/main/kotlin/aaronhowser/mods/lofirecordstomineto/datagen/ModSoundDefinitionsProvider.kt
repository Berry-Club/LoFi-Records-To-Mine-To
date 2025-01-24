package aaronhowser.mods.lofirecordstomineto.datagen

import aaronhowser.mods.lofirecordstomineto.LoFiRecordsToMineTo
import aaronhowser.mods.lofirecordstomineto.registry.ModSounds
import net.minecraft.data.PackOutput
import net.neoforged.neoforge.common.data.ExistingFileHelper
import net.neoforged.neoforge.common.data.SoundDefinition
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider

class ModSoundDefinitionsProvider(
    output: PackOutput,
    helper: ExistingFileHelper
) : SoundDefinitionsProvider(output, LoFiRecordsToMineTo.ID, helper) {

    private fun s(name: String) = SoundDefinition.definition()
        .with(sound(LoFiRecordsToMineTo.getRl(name)))

    override fun registerSounds() {

        add(
            ModSounds.A_MIX_OF_SOUND_AND_SPACE,
            s("a_mix_of_sound_and_space")
        )

    }
}