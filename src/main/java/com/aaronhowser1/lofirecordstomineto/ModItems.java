package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModItems {


    public static final Item MUSIC_DISC_A_LITTLE_SOMETHING              = register("music_disc_a_little_something",         new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_A_LITTLE_SOMETHING,       (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE        = register("music_disc_a_mix_of_sound_and_space",   new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE, (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_ALONE                           = register("music_disc_alone",                      new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_ALONE,                    (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_FACE_IT                         = register("music_disc_face_it",                    new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_FACE_IT,                  (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
//    public static final Item MUSIC_DISC_FACES                         = register("music_disc_faces",                           new ItemModRecord(7,               ModSoundEvents.MUSIC_DISC_FACES,                    (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_FALLING_LEAVES                  = register("music_disc_falling_leaves",             new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_FALLING_LEAVES,           (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_FINGER_PUPPETS                  = register("music_disc_finger_puppets",             new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_FINGER_PUPPETS,           (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_FIRST_FALLS_SUNDAY              = register("music_disc_first_falls_sunday",         new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_FIRST_FALLS_SUNDAY,       (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_HAPPY_BIRTHDAY                  = register("music_disc_happy_birthday",             new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_HAPPY_BIRTHDAY,           (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_IN_SEARCH_OF_LIFE               = register("music_disc_in_search_of_life",          new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_IN_SEARCH_OF_LIFE,        (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_INTERDIMENSIONAL                = register("music_disc_interdimensional",           new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_INTERDIMENSIONAL,         (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_ITS_INSIDE                      = register("music_disc_its_inside",                 new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_ITS_INSIDE,               (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
//    public static final Item MUSIC_DISC_KEYHOLE                         = register("music_disc_a_little_something",            new ItemModRecord(7,               ModSoundEvents.KEYHOLE,                             (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_LOOK_AT_THE_CAMERA              = register("music_disc_look_at_the_camera",         new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_LOOK_AT_THE_CAMERA,       (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_MAKING_WAYS                     = register("music_disc_making_ways",                new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_MAKING_WAYS,              (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_MEMORY_LOSS                     = register("music_disc_memory_loss",                new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_MEMORY_LOSS,              (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_NORMAL                          = register("music_disc_normal",                     new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_NORMAL,                   (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_OVERHEAD                        = register("music_disc_overhead",                   new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_OVERHEAD,                 (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_PLUCKED                         = register("music_disc_plucked",                    new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_PLUCKED,                  (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_REMEMBER                        = register("music_disc_remember",                   new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_REMEMBER,                 (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_RENDER                          = register("music_disc_render",                     new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_RENDER,                   (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_RUNNING_FROM_GIANTS             = register("music_disc_running_from_giants",        new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_RUNNING_FROM_GIANTS,      (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_SHADOW_PEOPLE                   = register("music_disc_shadow_people",              new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_SHADOW_PEOPLE,            (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_SPACE_WHALES                    = register("music_disc_space_whales",               new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_SPACE_WHALES,             (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_SURVIVED_BY                     = register("music_disc_survived_by",                new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_SURVIVED_BY,              (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_THERE_THERE                      = register("music_disc_there_there",               new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_THERE_THERE,              (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_THICKER                         = register("music_disc_thicker",                    new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_THICKER,                  (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_TIME_RIDER                      = register("music_disc_time_rider",                 new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_TIME_RIDER,               (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_TURNING_OVER_ROCKS              = register("music_disc_turning_over_rocks",         new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_TURNING_OVER_ROCKS,       (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_UNCANNY                         = register("music_disc_uncanny",                    new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_UNCANNY,                  (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_WAR                             = register("music_disc_war",                        new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_WAR,                      (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_WHEN_IT_RAINS                   = register("music_disc_when_it_rains",              new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_WHEN_IT_RAINS,            (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));
    public static final Item MUSIC_DISC_WIND                            = register("music_disc_wind",                       new ItemModRecord(7,    ModSoundEvents.MUSIC_DISC_WIND,                     (new Item.Properties()).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.RARE)));


    private static Item register(String key, Item p_221547_1_) {
        return register(new ResourceLocation(key), p_221547_1_);
    }

    private static Item register(ResourceLocation key, Item p_221544_1_) {
        if (p_221544_1_ instanceof BlockItem) {
            ((BlockItem)p_221544_1_).addToBlockToItemMap(Item.BLOCK_TO_ITEM, p_221544_1_);
        }

        return Registry.register(Registry.ITEM, key, p_221544_1_);
    }
}
