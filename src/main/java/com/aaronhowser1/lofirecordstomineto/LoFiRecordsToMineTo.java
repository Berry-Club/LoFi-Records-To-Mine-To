package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("lofirecordstomineto")
public class LoFiRecordsToMineTo {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public LoFiRecordsToMineTo() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }




    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        private static Item createItemModRecord(ResourceLocation resourceLocation, SoundEvent soundEvent) {
            return new ItemModRecord(0, soundEvent, (new Item.Properties().maxStackSize(1).group(ItemGroup.MISC))).setRegistryName(resourceLocation);
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "a_little_something"), ModSoundEvents.MUSIC_DISC_A_LITTLE_SOMETHING),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "a_mix_of_time_and_space"), ModSoundEvents.MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "alone"), ModSoundEvents.MUSIC_DISC_ALONE),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "face_it"), ModSoundEvents.MUSIC_DISC_FACE_IT),
//                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "faces"), ModSoundEvents.FACES),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "falling_leaves"), ModSoundEvents.MUSIC_DISC_FALLING_LEAVES),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "finger_puppets"), ModSoundEvents.MUSIC_DISC_FINGER_PUPPETS),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "falls_first_sunday"), ModSoundEvents.MUSIC_DISC_FALLS_FIRST_SUNDAY),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "happy_birthday"), ModSoundEvents.MUSIC_DISC_HAPPY_BIRTHDAY),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "in_search_of_life"), ModSoundEvents.MUSIC_DISC_IN_SEARCH_OF_LIFE),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "interdimensional"), ModSoundEvents.MUSIC_DISC_INTERDIMENSIONAL),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "its_inside"), ModSoundEvents.MUSIC_DISC_ITS_INSIDE),
//                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "keyhole"), ModSoundEvents.KEYHOLE),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "look_at_the_camera"), ModSoundEvents.MUSIC_DISC_LOOK_AT_THE_CAMERA),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "making_ways"), ModSoundEvents.MUSIC_DISC_MAKING_WAYS),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "memory_loss"), ModSoundEvents.MUSIC_DISC_MEMORY_LOSS),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "normal"), ModSoundEvents.MUSIC_DISC_NORMAL),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "overhead"), ModSoundEvents.MUSIC_DISC_OVERHEAD),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "plucked"), ModSoundEvents.MUSIC_DISC_PLUCKED),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "remember"), ModSoundEvents.MUSIC_DISC_REMEMBER),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "render"), ModSoundEvents.MUSIC_DISC_RENDER),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "running_from_giants"), ModSoundEvents.MUSIC_DISC_RUNNING_FROM_GIANTS),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "shadow_people"), ModSoundEvents.MUSIC_DISC_SHADOW_PEOPLE),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "space_whales"), ModSoundEvents.MUSIC_DISC_SPACE_WHALES),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "survived_by"), ModSoundEvents.MUSIC_DISC_SURVIVED_BY),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "there_there"), ModSoundEvents.MUSIC_DISC_THERE_THERE),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "thicker"), ModSoundEvents.MUSIC_DISC_THICKER),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "time_rider"), ModSoundEvents.MUSIC_DISC_TIME_RIDER),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "turning_over_rocks"), ModSoundEvents.MUSIC_DISC_TURNING_OVER_ROCKS),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "uncanny"), ModSoundEvents.MUSIC_DISC_UNCANNY),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "war"), ModSoundEvents.MUSIC_DISC_WAR),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "when_it_rains"), ModSoundEvents.MUSIC_DISC_WHEN_IT_RAINS),
                    createItemModRecord(new ResourceLocation("lofirecordstomineto", "wind"), ModSoundEvents.MUSIC_DISC_WIND)
            );
        }

        @SubscribeEvent
        public static void onSoundRegistry(final RegistryEvent.Register<SoundEvent> event) {
            event.getRegistry().registerAll(ModSoundEvents.MUSIC_DISC_A_LITTLE_SOMETHING,
                    ModSoundEvents.MUSIC_DISC_ALONE,
                    ModSoundEvents.MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE,
                    ModSoundEvents.MUSIC_DISC_FACE_IT,
                    ModSoundEvents.MUSIC_DISC_FALLING_LEAVES,
                    ModSoundEvents.MUSIC_DISC_A_LITTLE_SOMETHING,
                    ModSoundEvents.MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE,
                    ModSoundEvents.MUSIC_DISC_ALONE,
                    ModSoundEvents.MUSIC_DISC_FACE_IT,
//                    ModSoundEvents.MUSIC_DISC_FACES,
                    ModSoundEvents.MUSIC_DISC_FALLING_LEAVES,
                    ModSoundEvents.MUSIC_DISC_FINGER_PUPPETS,
                    ModSoundEvents.MUSIC_DISC_FALLS_FIRST_SUNDAY,
                    ModSoundEvents.MUSIC_DISC_HAPPY_BIRTHDAY,
                    ModSoundEvents.MUSIC_DISC_IN_SEARCH_OF_LIFE,
                    ModSoundEvents.MUSIC_DISC_INTERDIMENSIONAL,
                    ModSoundEvents.MUSIC_DISC_ITS_INSIDE,
//                    ModSoundEvents.MUSIC_DISC_KEYHOLE,
                    ModSoundEvents.MUSIC_DISC_LOOK_AT_THE_CAMERA,
                    ModSoundEvents.MUSIC_DISC_MAKING_WAYS,
                    ModSoundEvents.MUSIC_DISC_MEMORY_LOSS,
                    ModSoundEvents.MUSIC_DISC_NORMAL,
                    ModSoundEvents.MUSIC_DISC_OVERHEAD,
                    ModSoundEvents.MUSIC_DISC_PLUCKED,
                    ModSoundEvents.MUSIC_DISC_REMEMBER,
                    ModSoundEvents.MUSIC_DISC_RENDER,
                    ModSoundEvents.MUSIC_DISC_RUNNING_FROM_GIANTS,
                    ModSoundEvents.MUSIC_DISC_SHADOW_PEOPLE,
                    ModSoundEvents.MUSIC_DISC_SPACE_WHALES,
                    ModSoundEvents.MUSIC_DISC_SURVIVED_BY,
                    ModSoundEvents.MUSIC_DISC_THERE_THERE,
                    ModSoundEvents.MUSIC_DISC_THICKER,
                    ModSoundEvents.MUSIC_DISC_TIME_RIDER,
                    ModSoundEvents.MUSIC_DISC_TURNING_OVER_ROCKS,
                    ModSoundEvents.MUSIC_DISC_UNCANNY,
                    ModSoundEvents.MUSIC_DISC_WAR,
                    ModSoundEvents.MUSIC_DISC_WHEN_IT_RAINS,
                    ModSoundEvents.MUSIC_DISC_WIND);
        }
    }
}
