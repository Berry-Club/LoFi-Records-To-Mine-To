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

   val MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE = registerSoundEvent("a_mix_of_sound_and_space")
   val MUSIC_DISC_ALONE = registerSoundEvent("alone")
   val MUSIC_DISC_FACE_IT = registerSoundEvent("face_it")
   val MUSIC_DISC_FALLING_LEAVES = registerSoundEvent("falling_leaves")
   val MUSIC_DISC_FINGER_PUPPETS = registerSoundEvent("finger_puppets")
   val MUSIC_DISC_FALLS_FIRST_SUNDAY = registerSoundEvent("falls_first_sunday")
   val MUSIC_DISC_HAPPY_BIRTHDAY = registerSoundEvent("happy_birthday")
   val MUSIC_DISC_IN_SEARCH_OF_LIFE = registerSoundEvent("in_search_of_life")
   val MUSIC_DISC_INTERDIMENSIONAL = registerSoundEvent("interdimensional")
   val MUSIC_DISC_ITS_INSIDE = registerSoundEvent("its_inside")
   val MUSIC_DISC_LOOK_AT_THE_CAMERA = registerSoundEvent("look_at_the_camera")
   val MUSIC_DISC_MAKING_WAYS = registerSoundEvent("making_ways")
   val MUSIC_DISC_MEMORY_LOSS = registerSoundEvent("memory_loss")
   val MUSIC_DISC_NORMAL = registerSoundEvent("normal")
   val MUSIC_DISC_OVERHEAD = registerSoundEvent("overhead")
   val MUSIC_DISC_PLUCKED = registerSoundEvent("plucked")
   val MUSIC_DISC_REMEMBER = registerSoundEvent("remember")
   val MUSIC_DISC_RENDER = registerSoundEvent("render")
   val MUSIC_DISC_RUNNING_FROM_GIANTS = registerSoundEvent("running_from_giants")
   val MUSIC_DISC_SHADOW_PEOPLE = registerSoundEvent("shadow_people")
   val MUSIC_DISC_SPACE_WHALES = registerSoundEvent("space_whales")
   val MUSIC_DISC_SURVIVED_BY = registerSoundEvent("survived_by")
   val MUSIC_DISC_THERE_THERE = registerSoundEvent("there_there")
   val MUSIC_DISC_THICKER = registerSoundEvent("thicker")
   val MUSIC_DISC_TIME_RIDER = registerSoundEvent("time_rider")
   val MUSIC_DISC_TURNING_OVER_ROCKS = registerSoundEvent("turning_over_rocks")
   val MUSIC_DISC_UNCANNY = registerSoundEvent("uncanny")
   val MUSIC_DISC_WAR = registerSoundEvent("war")
   val MUSIC_DISC_WHEN_IT_RAINS = registerSoundEvent("when_it_rains")
   val MUSIC_DISC_WIND = registerSoundEvent("wind")

    fun registerSoundEvent(name: String): DeferredHolder<SoundEvent, SoundEvent> {
        return SOUND_EVENTS.register(name, Supplier {
            SoundEvent.createVariableRangeEvent(
                ResourceLocation.fromNamespaceAndPath(LoFiRecordsToMineTo.ID, name)
            )
        })
    }

}