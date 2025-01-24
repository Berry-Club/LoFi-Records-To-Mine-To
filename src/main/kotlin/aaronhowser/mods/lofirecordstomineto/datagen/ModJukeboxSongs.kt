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
        comparatorOutput: Int
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

    fun bootstrap(context: BootstrapContext<JukeboxSong>) {

        register(context, A_LITTLE_SOMETHING, ModSounds.A_LITTLE_SOMETHING, 180, 10)

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