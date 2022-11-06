package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Rarity;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModItems {
    private static final Item.Properties DISC_PROPERTIES = new Item.Properties().maxStackSize(1).group(LoFiRecordsToMineTo.LO_FI_GROUP).rarity(Rarity.RARE);

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LoFiRecordsToMineTo.MOD_ID);

    public static final RegistryObject<Item> A_LITTLE_SOMETHING = createRecord("a_little_something", ModSoundEvents.MUSIC_DISC_A_LITTLE_SOMETHING);
    public static final RegistryObject<Item> A_MIX_OF_TIME_AND_SPACE = createRecord("a_mix_of_time_and_space", ModSoundEvents.MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE);
    public static final RegistryObject<Item> ALONE = createRecord("alone", ModSoundEvents.MUSIC_DISC_ALONE);
    public static final RegistryObject<Item> FACE_IT = createRecord("face_it", ModSoundEvents.MUSIC_DISC_FACE_IT);
    public static final RegistryObject<Item> FALLING_LEAVES = createRecord("falling_leaves", ModSoundEvents.MUSIC_DISC_FALLING_LEAVES);
    public static final RegistryObject<Item> FINGER_PUPPETS = createRecord("finger_puppets", ModSoundEvents.MUSIC_DISC_FINGER_PUPPETS);
    public static final RegistryObject<Item> FALLS_FIRST_SUNDAY = createRecord("falls_first_sunday", ModSoundEvents.MUSIC_DISC_FALLS_FIRST_SUNDAY);
    public static final RegistryObject<Item> HAPPY_BIRTHDAY = createRecord("happy_birthday", ModSoundEvents.MUSIC_DISC_HAPPY_BIRTHDAY);
    public static final RegistryObject<Item> IN_SEARCH_OF_LIFE = createRecord("in_search_of_life", ModSoundEvents.MUSIC_DISC_IN_SEARCH_OF_LIFE);
    public static final RegistryObject<Item> INTERDIMENSIONAL = createRecord("interdimensional", ModSoundEvents.MUSIC_DISC_INTERDIMENSIONAL);
    public static final RegistryObject<Item> ITS_INSIDE = createRecord("its_inside", ModSoundEvents.MUSIC_DISC_ITS_INSIDE);
    public static final RegistryObject<Item> LOOK_AT_THE_CAMERA = createRecord("look_at_the_camera", ModSoundEvents.MUSIC_DISC_LOOK_AT_THE_CAMERA);
    public static final RegistryObject<Item> MAKING_WAYS = createRecord("making_ways", ModSoundEvents.MUSIC_DISC_MAKING_WAYS);
    public static final RegistryObject<Item> MEMORY_LOSS = createRecord("memory_loss", ModSoundEvents.MUSIC_DISC_MEMORY_LOSS);
    public static final RegistryObject<Item> NORMAL = createRecord("normal", ModSoundEvents.MUSIC_DISC_NORMAL);
    public static final RegistryObject<Item> OVERHEAD = createRecord("overhead", ModSoundEvents.MUSIC_DISC_OVERHEAD);
    public static final RegistryObject<Item> PLUCKED = createRecord("plucked", ModSoundEvents.MUSIC_DISC_PLUCKED);
    public static final RegistryObject<Item> REMEMBER = createRecord("remember", ModSoundEvents.MUSIC_DISC_REMEMBER);
    public static final RegistryObject<Item> RENDER = createRecord("render", ModSoundEvents.MUSIC_DISC_RENDER);
    public static final RegistryObject<Item> RUNNING_FROM_GIANTS = createRecord("running_from_giants", ModSoundEvents.MUSIC_DISC_RUNNING_FROM_GIANTS);
    public static final RegistryObject<Item> SHADOW_PEOPLE = createRecord("shadow_people", ModSoundEvents.MUSIC_DISC_SHADOW_PEOPLE);
    public static final RegistryObject<Item> SPACE_WHALES = createRecord("space_whales", ModSoundEvents.MUSIC_DISC_SPACE_WHALES);
    public static final RegistryObject<Item> SURVIVED_BY = createRecord("survived_by", ModSoundEvents.MUSIC_DISC_SURVIVED_BY);
    public static final RegistryObject<Item> THERE_THERE = createRecord("there_there", ModSoundEvents.MUSIC_DISC_THERE_THERE);
    public static final RegistryObject<Item> THICKER = createRecord("thiccer", ModSoundEvents.MUSIC_DISC_THICKER);
    public static final RegistryObject<Item> TIME_RIDER = createRecord("time_rider", ModSoundEvents.MUSIC_DISC_TIME_RIDER);
    public static final RegistryObject<Item> TURNING_OVER_ROCKS = createRecord("turning_over_rocks", ModSoundEvents.MUSIC_DISC_TURNING_OVER_ROCKS);
    public static final RegistryObject<Item> UNCANNY = createRecord("uncanny", ModSoundEvents.MUSIC_DISC_UNCANNY);
    public static final RegistryObject<Item> WAR = createRecord("war", ModSoundEvents.MUSIC_DISC_WAR);
    public static final RegistryObject<Item> WHEN_IT_RAINS = createRecord("when_it_rains", ModSoundEvents.MUSIC_DISC_WHEN_IT_RAINS);
    public static final RegistryObject<Item> WIND = createRecord("wind", ModSoundEvents.MUSIC_DISC_WIND);


    private static RegistryObject<Item> createRecord(String name, Supplier<SoundEvent> soundEvent) {
        return ITEMS.register(name, () -> new MusicDiscItem(0, soundEvent, DISC_PROPERTIES));
    }
}
