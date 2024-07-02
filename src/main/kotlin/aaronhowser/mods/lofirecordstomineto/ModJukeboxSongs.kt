package aaronhowser.mods.lofirecordstomineto

import net.minecraft.Util
import net.minecraft.core.Holder
import net.minecraft.core.registries.Registries
import net.minecraft.data.worldgen.BootstrapContext
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.sounds.SoundEvent
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

    private fun register(
        bootstrapContext: BootstrapContext<JukeboxSong>,
        songResourceKey: ResourceKey<JukeboxSong>,
        soundEventHolder: Holder.Reference<SoundEvent>,
        lengthInSeconds: Int,
        comparatorOutput: Int = 1
    ) {
        bootstrapContext.register(
            songResourceKey,
            JukeboxSong(
                soundEventHolder,
                Component.translatable(Util.makeDescriptionId("jukebox_song", songResourceKey.location())),
                lengthInSeconds.toFloat(),
                comparatorOutput
            )
        )
    }


    fun bootstrap(context: BootstrapContext<JukeboxSong>) {

        register(context, A_LITTLE_SOMETHING, ModSounds.A_LITTLE_SOMETHING, 4 * 60 + 39, 1)
        register(context, A_MIX_OF_SOUND_AND_SPACE, ModSounds.A_MIX_OF_SOUND_AND_SPACE, 2 * 60 + 52, 1)
        register(context, ALONE, ModSounds.ALONE, 5 * 60 + 48, 1)
        register(context, FACE_IT, ModSounds.FACE_IT, 3 * 60 + 27, 1)
        register(context, FALLING_LEAVES, ModSounds.FALLING_LEAVES, 3 * 60 + 12, 1)
        register(context, FINGER_PUPPETS, ModSounds.FINGER_PUPPETS, 1 * 60 + 53, 1)
        register(context, FALLS_FIRST_SUNDAY, ModSounds.FALLS_FIRST_SUNDAY, 2 * 60 + 57, 1)
        register(context, HAPPY_BIRTHDAY, ModSounds.HAPPY_BIRTHDAY, 2 * 60 + 17, 1)
        register(context, IN_SEARCH_OF_LIFE, ModSounds.IN_SEARCH_OF_LIFE, 4 * 60 + 40, 1)
        register(context, INTERDIMENSIONAL, ModSounds.INTERDIMENSIONAL, 1 * 60 + 47, 1)
        register(context, ITS_INSIDE, ModSounds.ITS_INSIDE, 5 * 60 + 41, 1)
        register(context, LOOK_AT_THE_CAMERA, ModSounds.LOOK_AT_THE_CAMERA, 5 * 60 + 35, 1)
        register(context, MAKING_WAYS, ModSounds.MAKING_WAYS, 3 * 60 + 6, 1)
        register(context, MEMORY_LOSS, ModSounds.MEMORY_LOSS, 6 * 60 + 38, 1)
        register(context, NORMAL, ModSounds.NORMAL, 3 * 60 + 33, 1)
        register(context, OVERHEAD, ModSounds.OVERHEAD, 2 * 60 + 59, 1)
        register(context, PLUCKED, ModSounds.PLUCKED, 2 * 60 + 36, 1)
        register(context, REMEMBER, ModSounds.REMEMBER, 3 * 60 + 22, 1)
        register(context, RENDER, ModSounds.RENDER, 3 * 60 + 50, 1)
        register(context, RUNNING_FROM_GIANTS, ModSounds.RUNNING_FROM_GIANTS, 2 * 60, 1)
        register(context, SHADOW_PEOPLE, ModSounds.SHADOW_PEOPLE, 4 * 60 + 23, 1)
        register(context, SPACE_WHALES, ModSounds.SPACE_WHALES, 2 * 60 + 48, 1)
        register(context, SURVIVED_BY, ModSounds.SURVIVED_BY, 2 * 60 + 32, 1)
        register(context, THERE_THERE, ModSounds.THERE_THERE, 1 * 60 + 51, 1)
        register(context, THICKER, ModSounds.THICKER, 3 * 60 + 13, 1)
        register(context, TIME_RIDER, ModSounds.TIME_RIDER, 3 * 60 + 13, 1)
        register(context, TURNING_OVER_ROCKS, ModSounds.TURNING_OVER_ROCKS, 3 * 60 + 5, 1)
        register(context, UNCANNY, ModSounds.UNCANNY, 3 * 60 + 33, 1)
        register(context, WAR, ModSounds.WAR, 2 * 60 + 52, 1)
        register(context, WHEN_IT_RAINS, ModSounds.WHEN_IT_RAINS, 3 * 60 + 15, 1)
        register(context, WIND, ModSounds.WIND, 8 * 60 + 30, 1)

    }

}