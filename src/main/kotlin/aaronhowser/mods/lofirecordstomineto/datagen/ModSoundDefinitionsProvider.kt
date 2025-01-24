package aaronhowser.mods.lofirecordstomineto.datagen

import aaronhowser.mods.lofirecordstomineto.LoFiRecordsToMineTo
import aaronhowser.mods.lofirecordstomineto.registry.ModSounds
import net.minecraft.data.PackOutput
import net.minecraft.sounds.SoundEvent
import net.neoforged.neoforge.common.data.ExistingFileHelper
import net.neoforged.neoforge.common.data.SoundDefinition
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider
import net.neoforged.neoforge.registries.DeferredHolder

class ModSoundDefinitionsProvider(
    output: PackOutput,
    helper: ExistingFileHelper
) : SoundDefinitionsProvider(output, LoFiRecordsToMineTo.ID, helper) {

    private fun singleSound(soundEvent: DeferredHolder<SoundEvent, SoundEvent>) {
        val name = soundEvent.key!!.location().path

        this.add(
            soundEvent,
            SoundDefinition.definition()
                .with(
                    sound(LoFiRecordsToMineTo.getRl(name))
                )
        )
    }

    override fun registerSounds() {

        singleSound(ModSounds.A_MIX_OF_SOUND_AND_SPACE)

    }
}