package aaronhowser.mods.lofirecordstomineto.datagen

import aaronhowser.mods.lofirecordstomineto.LoFiRecordsToMineTo
import net.minecraft.core.HolderLookup
import net.minecraft.data.DataGenerator
import net.minecraft.data.PackOutput
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.common.data.ExistingFileHelper
import net.neoforged.neoforge.data.event.GatherDataEvent
import java.util.concurrent.CompletableFuture

@EventBusSubscriber(
    modid = LoFiRecordsToMineTo.ID,
    bus = EventBusSubscriber.Bus.MOD
)
object ModDataGen {

    @SubscribeEvent
    fun onGatherData(event: GatherDataEvent) {
        val generator: DataGenerator = event.generator
        val output: PackOutput = generator.packOutput
        val existingFileHelper: ExistingFileHelper = event.existingFileHelper
        val lookupProvider: CompletableFuture<HolderLookup.Provider> = event.lookupProvider

        val datapackRegistrySets = generator.addProvider(
            event.includeServer(),
            ModDatapackBuiltinEntriesProvider(output, lookupProvider)
        )

        val languageProvider = generator.addProvider(
            event.includeClient(),
            ModLanguageProvider(output, datapackRegistrySets.registryProvider)
        )

        val soundDefinitionsProvider = generator.addProvider(
            event.includeClient(),
            ModSoundDefinitionsProvider(output, existingFileHelper)
        )

    }

}