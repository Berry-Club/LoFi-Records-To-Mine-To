package aaronhowser.mods.lofirecordstomineto.datagen

import aaronhowser.mods.lofirecordstomineto.LoFiRecordsToMineTo
import aaronhowser.mods.lofirecordstomineto.registry.ModSounds
import net.minecraft.Util
import net.minecraft.core.Holder
import net.minecraft.core.registries.Registries
import net.minecraft.data.worldgen.BootstrapContext
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceKey
import net.minecraft.sounds.SoundEvent
import net.minecraft.world.item.JukeboxSong

object ModJukeboxSongs {

    private fun createRk(name: String): ResourceKey<JukeboxSong> {
        return ResourceKey.create(
            Registries.JUKEBOX_SONG,
            LoFiRecordsToMineTo.getRl(name)
        )
    }

    private fun register(
        context: BootstrapContext<JukeboxSong>,
        resourceKey: ResourceKey<JukeboxSong>,
        soundEvent: Holder<SoundEvent>,
        lengthInSeconds: Int,
        comparatorOutput: Int = 15
    ) {
        context.register(
            resourceKey,
            JukeboxSong(
                soundEvent,
                Component.translatable(Util.makeDescriptionId("jukebox_song", resourceKey.location())),
                lengthInSeconds.toFloat(),
                comparatorOutput
            )
        )
    }

    private fun time(minutes: Int, seconds: Int): Int = minutes * 60 + seconds

    fun bootstrap(context: BootstrapContext<JukeboxSong>) {
        register(context, A_LITTLE_SOMETHING, ModSounds.A_LITTLE_SOMETHING, time(4, 39))
        register(context, A_MIX_OF_SOUND_AND_SPACE, ModSounds.A_MIX_OF_SOUND_AND_SPACE, time(2, 52))
        register(context, ALONE, ModSounds.ALONE, time(5, 48))
        register(context, FACE_IT, ModSounds.FACE_IT, time(3, 27))
        register(context, FALLING_LEAVES, ModSounds.FALLING_LEAVES, time(3, 12))
        register(context, FALLS_FIRST_SUNDAY, ModSounds.FALLS_FIRST_SUNDAY, time(2, 57))
        register(context, FINGER_PUPPETS, ModSounds.FINGER_PUPPETS, time(1, 53))
        register(context, HAPPY_BIRTHDAY, ModSounds.HAPPY_BIRTHDAY, time(2, 18))
        register(context, IN_SEARCH_OF_LIFE, ModSounds.IN_SEARCH_OF_LIFE, time(4, 40))
        register(context, INTERDIMENSIONAL, ModSounds.INTERDIMENSIONAL, time(1, 47))
        register(context, ITS_INSIDE, ModSounds.ITS_INSIDE, time(5, 41))
        register(context, LOOK_AT_THE_CAMERA, ModSounds.LOOK_AT_THE_CAMERA, time(5, 35))
        register(context, MAKING_WAYS, ModSounds.MAKING_WAYS, time(3, 6))
        register(context, MEMORY_LOSS, ModSounds.MEMORY_LOSS, time(6, 38))
        register(context, NORMAL, ModSounds.NORMAL, time(3, 33))
        register(context, OVERHEAD, ModSounds.OVERHEAD, time(2, 59))
        register(context, PLUCKED, ModSounds.PLUCKED, time(2, 36))
        register(context, REMEMBER, ModSounds.REMEMBER, time(3, 22))
        register(context, RENDER, ModSounds.RENDER, time(3, 50))
        register(context, RUNNING_FROM_GIANTS, ModSounds.RUNNING_FROM_GIANTS, time(2, 0))
        register(context, SHADOW_PEOPLE, ModSounds.SHADOW_PEOPLE, time(4, 23))
        register(context, SPACE_WHALES, ModSounds.SPACE_WHALES, time(2, 48))
        register(context, SURVIVED_BY, ModSounds.SURVIVED_BY, time(2, 32))
        register(context, THERE_THERE, ModSounds.THERE_THERE, time(1, 51))
        register(context, THICKER, ModSounds.THICKER, time(3, 13))
        register(context, TIME_RIDER, ModSounds.TIME_RIDER, time(3, 13))
        register(context, TURNING_OVER_ROCKS, ModSounds.TURNING_OVER_ROCKS, time(3, 5))
        register(context, UNCANNY, ModSounds.UNCANNY, time(3, 33))
        register(context, WAR, ModSounds.WAR, time(2, 52))
        register(context, WHEN_IT_RAINS, ModSounds.WHEN_IT_RAINS, time(3, 15))
        register(context, WIND, ModSounds.WIND, time(8, 30))
    }

    val A_LITTLE_SOMETHING = createRk("a_little_something")
    val A_MIX_OF_SOUND_AND_SPACE = createRk("a_mix_of_sound_and_space")
    val ALONE = createRk("alone")
    val FACE_IT = createRk("face_it")
    val FALLING_LEAVES = createRk("falling_leaves")
    val FINGER_PUPPETS = createRk("finger_puppets")
    val FALLS_FIRST_SUNDAY = createRk("falls_first_sunday")
    val HAPPY_BIRTHDAY = createRk("happy_birthday")
    val IN_SEARCH_OF_LIFE = createRk("in_search_of_life")
    val INTERDIMENSIONAL = createRk("interdimensional")
    val ITS_INSIDE = createRk("its_inside")
    val LOOK_AT_THE_CAMERA = createRk("look_at_the_camera")
    val MAKING_WAYS = createRk("making_ways")
    val MEMORY_LOSS = createRk("memory_loss")
    val NORMAL = createRk("normal")
    val OVERHEAD = createRk("overhead")
    val PLUCKED = createRk("plucked")
    val REMEMBER = createRk("remember")
    val RENDER = createRk("render")
    val RUNNING_FROM_GIANTS = createRk("running_from_giants")
    val SHADOW_PEOPLE = createRk("shadow_people")
    val SPACE_WHALES = createRk("space_whales")
    val SURVIVED_BY = createRk("survived_by")
    val THERE_THERE = createRk("there_there")
    val THICKER = createRk("thicker")
    val TIME_RIDER = createRk("time_rider")
    val TURNING_OVER_ROCKS = createRk("turning_over_rocks")
    val UNCANNY = createRk("uncanny")
    val WAR = createRk("war")
    val WHEN_IT_RAINS = createRk("when_it_rains")
    val WIND = createRk("wind")


}