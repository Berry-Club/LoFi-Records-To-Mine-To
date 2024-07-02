package aaronhowser.mods.lofirecordstomineto

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.JukeboxSong
import net.minecraft.world.item.JukeboxSongs

object ModJukeboxSongs : JukeboxSongs {

    val A_LITTLE_SOMETHING = registerJukeboxSong("a_little_something")
    val A_MIX_OF_SOUND_AND_SPACE = registerJukeboxSong("a_mix_of_sound_and_space")
    val ALONE = registerJukeboxSong("alone")
    val FACE_IT = registerJukeboxSong("face_it")
    val FALLING_LEAVES = registerJukeboxSong("falling_leaves")
    val FINGER_PUPPETS = registerJukeboxSong("finger_puppets")
    val FALLS_FIRST_SUNDAY = registerJukeboxSong("falls_first_sunday")
    val HAPPY_BIRTHDAY = registerJukeboxSong("happy_birthday")
    val IN_SEARCH_OF_LIFE = registerJukeboxSong("in_search_of_life")
    val INTERDIMENSIONAL = registerJukeboxSong("interdimensional")
    val ITS_INSIDE = registerJukeboxSong("its_inside")
    val LOOK_AT_THE_CAMERA = registerJukeboxSong("look_at_the_camera")
    val MAKING_WAYS = registerJukeboxSong("making_ways")
    val MEMORY_LOSS = registerJukeboxSong("memory_loss")
    val NORMAL = registerJukeboxSong("normal")
    val OVERHEAD = registerJukeboxSong("overhead")
    val PLUCKED = registerJukeboxSong("plucked")
    val REMEMBER = registerJukeboxSong("remember")
    val RENDER = registerJukeboxSong("render")
    val RUNNING_FROM_GIANTS = registerJukeboxSong("running_from_giants")
    val SHADOW_PEOPLE = registerJukeboxSong("shadow_people")
    val SPACE_WHALES = registerJukeboxSong("space_whales")
    val SURVIVED_BY = registerJukeboxSong("survived_by")
    val THERE_THERE = registerJukeboxSong("there_there")
    val THICKER = registerJukeboxSong("thicker")
    val TIME_RIDER = registerJukeboxSong("time_rider")
    val TURNING_OVER_ROCKS = registerJukeboxSong("turning_over_rocks")
    val UNCANNY = registerJukeboxSong("uncanny")
    val WAR = registerJukeboxSong("war")
    val WHEN_IT_RAINS = registerJukeboxSong("when_it_rains")
    val WIND = registerJukeboxSong("wind")

    private fun registerJukeboxSong(name: String): ResourceKey<JukeboxSong> {
        return ResourceKey.create(
            Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(LoFiRecordsToMineTo.ID, name)
        )
    }

}