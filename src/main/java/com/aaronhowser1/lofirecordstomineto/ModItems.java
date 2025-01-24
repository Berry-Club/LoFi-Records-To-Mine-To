package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LoFiRecordsToMineTo.MOD_ID);

    private static final Item.Properties DISC_PROPERTIES = new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.RARE);

    private static int lengthInTicks(int minutes, int seconds) {
        seconds += minutes * 60;
        return seconds * 20;
    }

    private static RegistryObject<RecordItem> register(
            String name,
            RegistryObject<SoundEvent> soundEvent,
            int lengthInTicks
    ) {
        return ITEMS_REGISTRY.register(
                name,
                () -> new RecordItem(
                        1,
                        soundEvent,
                        DISC_PROPERTIES,
                        lengthInTicks
                )
        );
    }

    public static final RegistryObject<RecordItem> A_LITTLE_SOMETHING =
            register(
                    "a_little_something",
                    ModSounds.MUSIC_DISC_A_LITTLE_SOMETHING,
                    lengthInTicks(4, 39)
            );
    public static final RegistryObject<RecordItem> A_MIX_OF_TIME_AND_SPACE =
            register(
                    "a_mix_of_sound_and_space",
                    ModSounds.MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE,
                    lengthInTicks(2, 52)
            );
    public static final RegistryObject<RecordItem> ALONE =
            register(
                    "alone",
                    ModSounds.MUSIC_DISC_ALONE,
                    lengthInTicks(5, 48)
            );
    public static final RegistryObject<RecordItem> FACE_IT =
            register(
                    "face_it",
                    ModSounds.MUSIC_DISC_FACE_IT,
                    lengthInTicks(3, 27)
            );
    public static final RegistryObject<RecordItem> FALLING_LEAVES =
            register(
                    "falling_leaves",
                    ModSounds.MUSIC_DISC_FALLING_LEAVES,
                    lengthInTicks(3, 12)
            );
    public static final RegistryObject<RecordItem> FINGER_PUPPETS =
            register(
                    "finger_puppets",
                    ModSounds.MUSIC_DISC_FINGER_PUPPETS,
                    lengthInTicks(1, 53)
            );
    public static final RegistryObject<RecordItem> FALLS_FIRST_SUNDAY =
            register(
                    "falls_first_sunday",
                    ModSounds.MUSIC_DISC_FALLS_FIRST_SUNDAY,
                    lengthInTicks(2, 57)
            );
    public static final RegistryObject<RecordItem> HAPPY_BIRTHDAY =
            register(
                    "happy_birthday",
                    ModSounds.MUSIC_DISC_HAPPY_BIRTHDAY,
                    lengthInTicks(2, 18)
            );
    public static final RegistryObject<RecordItem> IN_SEARCH_OF_LIFE =
            register(
                    "in_search_of_life",
                    ModSounds.MUSIC_DISC_IN_SEARCH_OF_LIFE,
                    lengthInTicks(4, 40)
            );
    public static final RegistryObject<RecordItem> INTERDIMENSIONAL =
            register(
                    "interdimensional",
                    ModSounds.MUSIC_DISC_INTERDIMENSIONAL,
                    lengthInTicks(1, 47)
            );
    public static final RegistryObject<RecordItem> ITS_INSIDE =
            register(
                    "its_inside",
                    ModSounds.MUSIC_DISC_ITS_INSIDE,
                    lengthInTicks(5, 41)
            );
    public static final RegistryObject<RecordItem> LOOK_AT_THE_CAMERA =
            register(
                    "look_at_the_camera",
                    ModSounds.MUSIC_DISC_LOOK_AT_THE_CAMERA,
                    lengthInTicks(5, 35)
            );
    public static final RegistryObject<RecordItem> MAKING_WAYS =
            register(
                    "making_ways",
                    ModSounds.MUSIC_DISC_MAKING_WAYS,
                    lengthInTicks(3, 6)
            );
    public static final RegistryObject<RecordItem> MEMORY_LOSS =
            register(
                    "memory_loss",
                    ModSounds.MUSIC_DISC_MEMORY_LOSS,
                    lengthInTicks(6, 38)
            );
    public static final RegistryObject<RecordItem> NORMAL =
            register(
                    "normal",
                    ModSounds.MUSIC_DISC_NORMAL,
                    lengthInTicks(3, 33)
            );
    public static final RegistryObject<RecordItem> OVERHEAD =
            register(
                    "overhead",
                    ModSounds.MUSIC_DISC_OVERHEAD,
                    lengthInTicks(2, 59)
            );
    public static final RegistryObject<RecordItem> PLUCKED =
            register(
                    "plucked",
                    ModSounds.MUSIC_DISC_PLUCKED,
                    lengthInTicks(2, 36)
            );
    public static final RegistryObject<RecordItem> REMEMBER =
            register(
                    "remember",
                    ModSounds.MUSIC_DISC_REMEMBER,
                    lengthInTicks(3, 22)
            );
    public static final RegistryObject<RecordItem> RENDER =
            register(
                    "render",
                    ModSounds.MUSIC_DISC_RENDER,
                    lengthInTicks(3, 50)
            );
    public static final RegistryObject<RecordItem> RUNNING_FROM_GIANTS =
            register(
                    "running_from_giants",
                    ModSounds.MUSIC_DISC_RUNNING_FROM_GIANTS,
                    lengthInTicks(2, 0)
            );
    public static final RegistryObject<RecordItem> SHADOW_PEOPLE =
            register(
                    "shadow_people",
                    ModSounds.MUSIC_DISC_SHADOW_PEOPLE,
                    lengthInTicks(4, 23)
            );
    public static final RegistryObject<RecordItem> SPACE_WHALES =
            register(
                    "space_whales",
                    ModSounds.MUSIC_DISC_SPACE_WHALES,
                    lengthInTicks(2, 48)
            );
    public static final RegistryObject<RecordItem> SURVIVED_BY =
            register(
                    "survived_by",
                    ModSounds.MUSIC_DISC_SURVIVED_BY,
                    lengthInTicks(2, 32)
            );
    public static final RegistryObject<RecordItem> THERE_THERE =
            register(
                    "there_there",
                    ModSounds.MUSIC_DISC_THERE_THERE,
                    lengthInTicks(1, 51)
            );
    public static final RegistryObject<RecordItem> THICKER =
            register(
                    "thiccer",
                    ModSounds.MUSIC_DISC_THICKER,
                    lengthInTicks(3, 13)
            );
    public static final RegistryObject<RecordItem> TIME_RIDER =
            register(
                    "time_rider",
                    ModSounds.MUSIC_DISC_TIME_RIDER,
                    lengthInTicks(3, 13)
            );
    public static final RegistryObject<RecordItem> TURNING_OVER_ROCKS =
            register(
                    "turning_over_rocks",
                    ModSounds.MUSIC_DISC_TURNING_OVER_ROCKS,
                    lengthInTicks(3, 5)
            );
    public static final RegistryObject<RecordItem> UNCANNY =
            register(
                    "uncanny",
                    ModSounds.MUSIC_DISC_UNCANNY,
                    lengthInTicks(3, 33)
            );
    public static final RegistryObject<RecordItem> WAR =
            register(
                    "war",
                    ModSounds.MUSIC_DISC_WAR,
                    lengthInTicks(2, 52)
            );
    public static final RegistryObject<RecordItem> WHEN_IT_RAINS =
            register(
                    "when_it_rains",
                    ModSounds.MUSIC_DISC_WHEN_IT_RAINS,
                    lengthInTicks(3, 15)
            );
    public static final RegistryObject<RecordItem> WIND =
            register(
                    "wind",
                    ModSounds.MUSIC_DISC_WIND,
                    lengthInTicks(8, 30)
            );

}
