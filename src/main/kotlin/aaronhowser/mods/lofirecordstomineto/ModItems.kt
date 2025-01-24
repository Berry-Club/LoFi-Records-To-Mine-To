package aaronhowser.mods.lofirecordstomineto

import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item
import net.minecraft.world.item.JukeboxSong
import net.minecraft.world.item.Rarity
import net.neoforged.neoforge.registries.DeferredItem
import net.neoforged.neoforge.registries.DeferredRegister

object ModItems {

    val ITEM_REGISTRY: DeferredRegister.Items = DeferredRegister.createItems(LoFiRecordsToMineTo.ID)

    private fun jukeboxDisk(jukeboxSong: ResourceKey<JukeboxSong>): Item {
        return Item(Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(jukeboxSong))
    }

    private fun registerRecordItem(name: String, jukeboxSong: ResourceKey<JukeboxSong>): DeferredItem<Item> {
        val properties = Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(jukeboxSong)

        return ITEM_REGISTRY.registerItem(name) { Item(properties) }
    }

    val A_LITTLE_SOMETHING: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("a_little_something") { jukeboxDisk(ModJukeboxSongs.A_LITTLE_SOMETHING) }
    val A_MIX_OF_SOUND_AND_SPACE: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("a_mix_of_sound_and_space") { jukeboxDisk(ModJukeboxSongs.A_MIX_OF_SOUND_AND_SPACE) }
    val ALONE: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("alone") { jukeboxDisk(ModJukeboxSongs.ALONE) }
    val FACE_IT: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("face_it") { jukeboxDisk(ModJukeboxSongs.FACE_IT) }
    val FALLING_LEAVES: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("falling_leaves") { jukeboxDisk(ModJukeboxSongs.FALLING_LEAVES) }
    val FINGER_PUPPETS: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("finger_puppets") { jukeboxDisk(ModJukeboxSongs.FINGER_PUPPETS) }
    val FALLS_FIRST_SUNDAY: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("falls_first_sunday") { jukeboxDisk(ModJukeboxSongs.FALLS_FIRST_SUNDAY) }
    val HAPPY_BIRTHDAY: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("happy_birthday") { jukeboxDisk(ModJukeboxSongs.HAPPY_BIRTHDAY) }
    val IN_SEARCH_OF_LIFE: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("in_search_of_life") { jukeboxDisk(ModJukeboxSongs.IN_SEARCH_OF_LIFE) }
    val INTERDIMENSIONAL: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("interdimensional") { jukeboxDisk(ModJukeboxSongs.INTERDIMENSIONAL) }
    val ITS_INSIDE: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("its_inside") { jukeboxDisk(ModJukeboxSongs.ITS_INSIDE) }
    val LOOK_AT_THE_CAMERA: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("look_at_the_camera") { jukeboxDisk(ModJukeboxSongs.LOOK_AT_THE_CAMERA) }
    val MAKING_WAYS: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("making_ways") { jukeboxDisk(ModJukeboxSongs.MAKING_WAYS) }
    val MEMORY_LOSS: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("memory_loss") { jukeboxDisk(ModJukeboxSongs.MEMORY_LOSS) }
    val NORMAL: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("normal") { jukeboxDisk(ModJukeboxSongs.NORMAL) }
    val OVERHEAD: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("overhead") { jukeboxDisk(ModJukeboxSongs.OVERHEAD) }
    val PLUCKED: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("plucked") { jukeboxDisk(ModJukeboxSongs.PLUCKED) }
    val REMEMBER: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("remember") { jukeboxDisk(ModJukeboxSongs.REMEMBER) }
    val RENDER: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("render") { jukeboxDisk(ModJukeboxSongs.RENDER) }
    val RUNNING_FROM_GIANTS: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("running_from_giants") { jukeboxDisk(ModJukeboxSongs.RUNNING_FROM_GIANTS) }
    val SHADOW_PEOPLE: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("shadow_people") { jukeboxDisk(ModJukeboxSongs.SHADOW_PEOPLE) }
    val SPACE_WHALES: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("space_whales") { jukeboxDisk(ModJukeboxSongs.SPACE_WHALES) }
    val SURVIVED_BY: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("survived_by") { jukeboxDisk(ModJukeboxSongs.SURVIVED_BY) }
    val THERE_THERE: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("there_there") { jukeboxDisk(ModJukeboxSongs.THERE_THERE) }
    val THICKER: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("thicker") { jukeboxDisk(ModJukeboxSongs.THICKER) }
    val TIME_RIDER: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("time_rider") { jukeboxDisk(ModJukeboxSongs.TIME_RIDER) }
    val TURNING_OVER_ROCKS: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("turning_over_rocks") { jukeboxDisk(ModJukeboxSongs.TURNING_OVER_ROCKS) }
    val UNCANNY: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("uncanny") { jukeboxDisk(ModJukeboxSongs.UNCANNY) }
    val WAR: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("war") { jukeboxDisk(ModJukeboxSongs.WAR) }
    val WHEN_IT_RAINS: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("when_it_rains") { jukeboxDisk(ModJukeboxSongs.WHEN_IT_RAINS) }
    val WIND: DeferredItem<Item> =
        ITEM_REGISTRY.registerItem("wind") { jukeboxDisk(ModJukeboxSongs.WIND) }

}