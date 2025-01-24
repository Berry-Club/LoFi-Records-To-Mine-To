package aaronhowser.mods.lofirecordstomineto.datagen

import aaronhowser.mods.lofirecordstomineto.LoFiRecordsToMineTo
import aaronhowser.mods.lofirecordstomineto.registry.ModItems
import net.minecraft.core.HolderLookup
import net.minecraft.core.component.DataComponents
import net.minecraft.data.PackOutput
import net.minecraft.world.item.Item
import net.neoforged.neoforge.common.data.LanguageProvider
import java.util.concurrent.CompletableFuture
import java.util.function.Supplier

class ModLanguageProvider(
    output: PackOutput,
    private val lookupProvider: CompletableFuture<HolderLookup.Provider>
) : LanguageProvider(output, LoFiRecordsToMineTo.ID, "en_us") {

    companion object;

    override fun addTranslations() {
        addItems()
    }

    private fun addRecord(
        item: Supplier<Item>,
        songName: String,
        authorString: String = "1micah5"
    ) {
        addItem(item, "Music Disc")

        val playable = item.get().defaultInstance.get(DataComponents.JUKEBOX_PLAYABLE)!!

        val songTranslationKey = playable.song.unwrap(lookupProvider.get()).get().value().description.string

        add(songTranslationKey, "$authorString - $songName")
    }

    private fun addItems() {

        addRecord(ModItems.A_LITTLE_SOMETHING, "A Little Something")
        addRecord(ModItems.A_MIX_OF_SOUND_AND_SPACE, "A Mix of Sound and Space")
        addRecord(ModItems.ALONE, "Alone")
        addRecord(ModItems.FACE_IT, "Face It")
        addRecord(ModItems.FALLING_LEAVES, "Falling Leaves")
        addRecord(ModItems.FINGER_PUPPETS, "Finger Puppets")
        addRecord(ModItems.FALLS_FIRST_SUNDAY, "Fall's First Sunday")
        addRecord(ModItems.HAPPY_BIRTHDAY, "Happy Birthday")
        addRecord(ModItems.IN_SEARCH_OF_LIFE, "In Search of Life")
        addRecord(ModItems.INTERDIMENSIONAL, "Interdimensional")
        addRecord(ModItems.ITS_INSIDE, "It's Inside")
        addRecord(ModItems.LOOK_AT_THE_CAMERA, "Look at the Camera")
        addRecord(ModItems.MAKING_WAYS, "Making Ways")
        addRecord(ModItems.MEMORY_LOSS, "Memory Loss")
        addRecord(ModItems.NORMAL, "Normal")
        addRecord(ModItems.OVERHEAD, "Overhead")
        addRecord(ModItems.PLUCKED, "Plucked")
        addRecord(ModItems.REMEMBER, "Remember")
        addRecord(ModItems.RENDER, "Render")
        addRecord(ModItems.RUNNING_FROM_GIANTS,     "Running from Giants")
        addRecord(ModItems.SHADOW_PEOPLE, "Shadow People")
        addRecord(ModItems.SPACE_WHALES, "Space Whales")
        addRecord(ModItems.SURVIVED_BY, "Survived By")
        addRecord(ModItems.THERE_THERE, "There There")
        addRecord(ModItems.THICKER, "Thicker")
        addRecord(ModItems.TIME_RIDER, "Time Rider")
        addRecord(ModItems.TURNING_OVER_ROCKS, "Turning Over Rocks")
        addRecord(ModItems.UNCANNY, "Uncanny")
        addRecord(ModItems.WAR, "War")
        addRecord(ModItems.WHEN_IT_RAINS, "When It Rains")
        addRecord(ModItems.WIND, "Wind")

    }

}