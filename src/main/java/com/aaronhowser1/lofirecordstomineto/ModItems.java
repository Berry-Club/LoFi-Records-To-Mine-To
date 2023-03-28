package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LoFiRecordsToMineTo.MOD_ID);
    private static final Item.Properties DISC_PROPERTIES = new Item.Properties()
            .tab(CreativeModeTab.TAB_MISC)
            .stacksTo(1)
            .rarity(Rarity.RARE);

    private static int lengthInTicks(int minutes, int seconds) {
        seconds += minutes*60;
        return seconds*20;
    }

    public static final RegistryObject<Item> A_LITTLE_SOMETHING = ITEMS.register("a_little_something", () -> new RecordItem(1, ModSounds.MUSIC_DISC_A_LITTLE_SOMETHING, DISC_PROPERTIES, lengthInTicks(4, 39)));
    public static final RegistryObject<Item> A_MIX_OF_TIME_AND_SPACE = ITEMS.register("a_mix_of_sound_and_space", () -> new RecordItem(1, ModSounds.MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE, DISC_PROPERTIES, lengthInTicks(2, 52)));
    public static final RegistryObject<Item> ALONE = ITEMS.register("alone", () -> new RecordItem(1, ModSounds.MUSIC_DISC_ALONE, DISC_PROPERTIES, lengthInTicks(5, 48)));
    public static final RegistryObject<Item> FACE_IT = ITEMS.register("face_it", () -> new RecordItem(1, ModSounds.MUSIC_DISC_FACE_IT, DISC_PROPERTIES, lengthInTicks(3, 27)));
    public static final RegistryObject<Item> FALLING_LEAVES = ITEMS.register("falling_leaves", () -> new RecordItem(1, ModSounds.MUSIC_DISC_FALLING_LEAVES, DISC_PROPERTIES, lengthInTicks(3, 12)));
    public static final RegistryObject<Item> FINGER_PUPPETS = ITEMS.register("finger_puppets", () -> new RecordItem(1, ModSounds.MUSIC_DISC_FINGER_PUPPETS, DISC_PROPERTIES, lengthInTicks(1, 53)));
    public static final RegistryObject<Item> FALLS_FIRST_SUNDAY = ITEMS.register("falls_first_sunday", () -> new RecordItem(1, ModSounds.MUSIC_DISC_FALLS_FIRST_SUNDAY, DISC_PROPERTIES, lengthInTicks(2, 57)));
    public static final RegistryObject<Item> HAPPY_BIRTHDAY = ITEMS.register("happy_birthday", () -> new RecordItem(1, ModSounds.MUSIC_DISC_HAPPY_BIRTHDAY, DISC_PROPERTIES, lengthInTicks(2,18)));
    public static final RegistryObject<Item> IN_SEARCH_OF_LIFE = ITEMS.register("in_search_of_life", () -> new RecordItem(1, ModSounds.MUSIC_DISC_IN_SEARCH_OF_LIFE, DISC_PROPERTIES, lengthInTicks(4, 40)));
    public static final RegistryObject<Item> INTERDIMENSIONAL = ITEMS.register("interdimensional", () -> new RecordItem(1, ModSounds.MUSIC_DISC_INTERDIMENSIONAL, DISC_PROPERTIES, lengthInTicks(1, 47)));
    public static final RegistryObject<Item> ITS_INSIDE = ITEMS.register("its_inside", () -> new RecordItem(1, ModSounds.MUSIC_DISC_ITS_INSIDE, DISC_PROPERTIES, lengthInTicks(5, 41)));
    public static final RegistryObject<Item> LOOK_AT_THE_CAMERA = ITEMS.register("look_at_the_camera", () -> new RecordItem(1, ModSounds.MUSIC_DISC_LOOK_AT_THE_CAMERA, DISC_PROPERTIES, lengthInTicks(5, 35)));
    public static final RegistryObject<Item> MAKING_WAYS = ITEMS.register("making_ways", () -> new RecordItem(1, ModSounds.MUSIC_DISC_MAKING_WAYS, DISC_PROPERTIES, lengthInTicks(3, 6)));
    public static final RegistryObject<Item> MEMORY_LOSS = ITEMS.register("memory_loss", () -> new RecordItem(1, ModSounds.MUSIC_DISC_MEMORY_LOSS, DISC_PROPERTIES, lengthInTicks(6, 38)));
    public static final RegistryObject<Item> NORMAL = ITEMS.register("normal", () -> new RecordItem(1, ModSounds.MUSIC_DISC_NORMAL, DISC_PROPERTIES, lengthInTicks(3, 33)));
    public static final RegistryObject<Item> OVERHEAD = ITEMS.register("overhead", () -> new RecordItem(1, ModSounds.MUSIC_DISC_OVERHEAD, DISC_PROPERTIES, lengthInTicks(2, 59)));
    public static final RegistryObject<Item> PLUCKED = ITEMS.register("plucked", () -> new RecordItem(1, ModSounds.MUSIC_DISC_PLUCKED, DISC_PROPERTIES, lengthInTicks(2, 36)));
    public static final RegistryObject<Item> REMEMBER = ITEMS.register("remember", () -> new RecordItem(1, ModSounds.MUSIC_DISC_REMEMBER, DISC_PROPERTIES, lengthInTicks(3, 22)));
    public static final RegistryObject<Item> RENDER = ITEMS.register("render", () -> new RecordItem(1, ModSounds.MUSIC_DISC_RENDER, DISC_PROPERTIES, lengthInTicks(3, 50)));
    public static final RegistryObject<Item> RUNNING_FROM_GIANTS = ITEMS.register("running_from_giants", () -> new RecordItem(1, ModSounds.MUSIC_DISC_RUNNING_FROM_GIANTS, DISC_PROPERTIES, lengthInTicks(2,0)));
    public static final RegistryObject<Item> SHADOW_PEOPLE = ITEMS.register("shadow_people", () -> new RecordItem(1, ModSounds.MUSIC_DISC_SHADOW_PEOPLE, DISC_PROPERTIES, lengthInTicks(4, 23)));
    public static final RegistryObject<Item> SPACE_WHALES = ITEMS.register("space_whales", () -> new RecordItem(1, ModSounds.MUSIC_DISC_SPACE_WHALES, DISC_PROPERTIES, lengthInTicks(2, 48)));
    public static final RegistryObject<Item> SURVIVED_BY = ITEMS.register("survived_by", () -> new RecordItem(1, ModSounds.MUSIC_DISC_SURVIVED_BY, DISC_PROPERTIES, lengthInTicks(2, 32)));
    public static final RegistryObject<Item> THERE_THERE = ITEMS.register("there_there", () -> new RecordItem(1, ModSounds.MUSIC_DISC_THERE_THERE, DISC_PROPERTIES, lengthInTicks(1, 51)));
    public static final RegistryObject<Item> THICKER = ITEMS.register("thiccer", () -> new RecordItem(1, ModSounds.MUSIC_DISC_THICKER, DISC_PROPERTIES, lengthInTicks(3, 13)));
    public static final RegistryObject<Item> TIME_RIDER = ITEMS.register("time_rider", () -> new RecordItem(1, ModSounds.MUSIC_DISC_TIME_RIDER, DISC_PROPERTIES, lengthInTicks(3, 13)));
    public static final RegistryObject<Item> TURNING_OVER_ROCKS = ITEMS.register("turning_over_rocks", () -> new RecordItem(1, ModSounds.MUSIC_DISC_TURNING_OVER_ROCKS, DISC_PROPERTIES, lengthInTicks(3, 5)));
    public static final RegistryObject<Item> UNCANNY = ITEMS.register("uncanny", () -> new RecordItem(1, ModSounds.MUSIC_DISC_UNCANNY, DISC_PROPERTIES, lengthInTicks(3, 33)));
    public static final RegistryObject<Item> WAR = ITEMS.register("war", () -> new RecordItem(1, ModSounds.MUSIC_DISC_WAR, DISC_PROPERTIES, lengthInTicks(2, 52)));
    public static final RegistryObject<Item> WHEN_IT_RAINS = ITEMS.register("when_it_rains", () -> new RecordItem(1, ModSounds.MUSIC_DISC_WHEN_IT_RAINS, DISC_PROPERTIES, lengthInTicks(3, 15)));
    public static final RegistryObject<Item> WIND = ITEMS.register("wind", () -> new RecordItem(1, ModSounds.MUSIC_DISC_WIND, DISC_PROPERTIES, lengthInTicks(8, 30)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
