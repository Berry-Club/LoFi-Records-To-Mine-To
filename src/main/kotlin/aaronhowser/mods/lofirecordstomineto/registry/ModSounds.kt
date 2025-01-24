package aaronhowser.mods.lofirecordstomineto.registry

import aaronhowser.mods.lofirecordstomineto.LoFiRecordsToMineTo
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.sounds.SoundEvent
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

object ModSounds {

    val SOUND_EVENT_REGISTRY: DeferredRegister<SoundEvent> =
        DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, LoFiRecordsToMineTo.ID)

    val A_LITTLE_SOMETHING: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("a_little_something")
    val A_MIX_OF_SOUND_AND_SPACE: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("a_mix_of_sound_and_space")
    val ALONE: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("alone")
    val FACE_IT: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("face_it")
    val FALLING_LEAVES: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("falling_leaves")
    val FINGER_PUPPETS: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("finger_puppets")
    val FALLS_FIRST_SUNDAY: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("falls_first_sunday")
    val HAPPY_BIRTHDAY: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("happy_birthday")
    val IN_SEARCH_OF_LIFE: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("in_search_of_life")
    val INTERDIMENSIONAL: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("interdimensional")
    val ITS_INSIDE: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("its_inside")
    val LOOK_AT_THE_CAMERA: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("look_at_the_camera")
    val MAKING_WAYS: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("making_ways")
    val MEMORY_LOSS: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("memory_loss")
    val NORMAL: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("normal")
    val OVERHEAD: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("overhead")
    val PLUCKED: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("plucked")
    val REMEMBER: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("remember")
    val RENDER: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("render")
    val RUNNING_FROM_GIANTS: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("running_from_giants")
    val SHADOW_PEOPLE: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("shadow_people")
    val SPACE_WHALES: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("space_whales")
    val SURVIVED_BY: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("survived_by")
    val THERE_THERE: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("there_there")
    val THICKER: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("thicker")
    val TIME_RIDER: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("time_rider")
    val TURNING_OVER_ROCKS: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("turning_over_rocks")
    val UNCANNY: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("uncanny")
    val WAR: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("war")
    val WHEN_IT_RAINS: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("when_it_rains")
    val WIND: DeferredHolder<SoundEvent, SoundEvent> = createSoundEvent("wind")

    private fun createSoundEvent(name: String, location: String): DeferredHolder<SoundEvent, SoundEvent> {
        return SOUND_EVENT_REGISTRY.register(name, Supplier {
            SoundEvent.createVariableRangeEvent(LoFiRecordsToMineTo.getRl(location))
        })
    }

    private fun createSoundEvent(name: String) = createSoundEvent(name, name)

}