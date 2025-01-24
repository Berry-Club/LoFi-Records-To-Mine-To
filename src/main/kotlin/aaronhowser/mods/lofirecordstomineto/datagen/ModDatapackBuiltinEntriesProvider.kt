package aaronhowser.mods.lofirecordstomineto.datagen

import aaronhowser.mods.lofirecordstomineto.LoFiRecordsToMineTo
import net.minecraft.core.HolderLookup
import net.minecraft.core.RegistrySetBuilder
import net.minecraft.core.registries.Registries
import net.minecraft.data.PackOutput
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider
import java.util.concurrent.CompletableFuture

class ModDatapackBuiltinEntriesProvider(
    output: PackOutput,
    registries: CompletableFuture<HolderLookup.Provider>
) : DatapackBuiltinEntriesProvider(
    output,
    registries,
    BUILDER,
    setOf(LoFiRecordsToMineTo.ID)
) {

    companion object {
        val BUILDER: RegistrySetBuilder = RegistrySetBuilder()
            .add(Registries.JUKEBOX_SONG, ModJukeboxSongs::bootstrap)
    }

}