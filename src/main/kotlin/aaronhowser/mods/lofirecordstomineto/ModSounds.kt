package aaronhowser.mods.lofirecordstomineto

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.sounds.SoundEvent
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

object ModSounds {

    val SOUND_EVENTS: DeferredRegister<SoundEvent> =
        DeferredRegister.create(Registries.SOUND_EVENT, LoFiRecordsToMineTo.ID)

    val A_LITTLE_SOMETHING = registerSoundEvent("a_little_something")
    val A_MIX_OF_SOUND_AND_SPACE = registerSoundEvent("a_mix_of_sound_and_space")
    val ALONE = registerSoundEvent("alone")
    val FACE_IT = registerSoundEvent("face_it")
    val FALLING_LEAVES = registerSoundEvent("falling_leaves")
    val FINGER_PUPPETS = registerSoundEvent("finger_puppets")
    val FALLS_FIRST_SUNDAY = registerSoundEvent("falls_first_sunday")
    val HAPPY_BIRTHDAY = registerSoundEvent("happy_birthday")
    val IN_SEARCH_OF_LIFE = registerSoundEvent("in_search_of_life")
    val INTERDIMENSIONAL = registerSoundEvent("interdimensional")
    val ITS_INSIDE = registerSoundEvent("its_inside")
    val LOOK_AT_THE_CAMERA = registerSoundEvent("look_at_the_camera")
    val MAKING_WAYS = registerSoundEvent("making_ways")
    val MEMORY_LOSS = registerSoundEvent("memory_loss")
    val NORMAL = registerSoundEvent("normal")
    val OVERHEAD = registerSoundEvent("overhead")
    val PLUCKED = registerSoundEvent("plucked")
    val REMEMBER = registerSoundEvent("remember")
    val RENDER = registerSoundEvent("render")
    val RUNNING_FROM_GIANTS = registerSoundEvent("running_from_giants")
    val SHADOW_PEOPLE = registerSoundEvent("shadow_people")
    val SPACE_WHALES = registerSoundEvent("space_whales")
    val SURVIVED_BY = registerSoundEvent("survived_by")
    val THERE_THERE = registerSoundEvent("there_there")
    val THICKER = registerSoundEvent("thicker")
    val TIME_RIDER = registerSoundEvent("time_rider")
    val TURNING_OVER_ROCKS = registerSoundEvent("turning_over_rocks")
    val UNCANNY = registerSoundEvent("uncanny")
    val WAR = registerSoundEvent("war")
    val WHEN_IT_RAINS = registerSoundEvent("when_it_rains")
    val WIND = registerSoundEvent("wind")

    fun registerSoundEvent(name: String): DeferredHolder<SoundEvent, SoundEvent> {
        return SOUND_EVENTS.register(name, Supplier {
            SoundEvent.createVariableRangeEvent(
                ResourceLocation.fromNamespaceAndPath(LoFiRecordsToMineTo.ID, name)
            )
        })
    }

}