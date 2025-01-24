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
                    sound(LoFiRecordsToMineTo.getRl(name)).stream()
                )
        )
    }

    override fun registerSounds() {
        singleSound(ModSounds.A_MIX_OF_SOUND_AND_SPACE)
        singleSound(ModSounds.ALONE)
        singleSound(ModSounds.FACE_IT)
        singleSound(ModSounds.FALLING_LEAVES)
        singleSound(ModSounds.FINGER_PUPPETS)
        singleSound(ModSounds.FALLS_FIRST_SUNDAY)
        singleSound(ModSounds.HAPPY_BIRTHDAY)
        singleSound(ModSounds.IN_SEARCH_OF_LIFE)
        singleSound(ModSounds.INTERDIMENSIONAL)
        singleSound(ModSounds.ITS_INSIDE)
        singleSound(ModSounds.LOOK_AT_THE_CAMERA)
        singleSound(ModSounds.MAKING_WAYS)
        singleSound(ModSounds.MEMORY_LOSS)
        singleSound(ModSounds.NORMAL)
        singleSound(ModSounds.OVERHEAD)
        singleSound(ModSounds.PLUCKED)
        singleSound(ModSounds.REMEMBER)
        singleSound(ModSounds.RENDER)
        singleSound(ModSounds.RUNNING_FROM_GIANTS)
        singleSound(ModSounds.SHADOW_PEOPLE)
        singleSound(ModSounds.SPACE_WHALES)
        singleSound(ModSounds.SURVIVED_BY)
        singleSound(ModSounds.THERE_THERE)
        singleSound(ModSounds.THICKER)
        singleSound(ModSounds.TIME_RIDER)
        singleSound(ModSounds.TURNING_OVER_ROCKS)
        singleSound(ModSounds.UNCANNY)
        singleSound(ModSounds.WAR)
        singleSound(ModSounds.WHEN_IT_RAINS)
        singleSound(ModSounds.WIND)
    }
}