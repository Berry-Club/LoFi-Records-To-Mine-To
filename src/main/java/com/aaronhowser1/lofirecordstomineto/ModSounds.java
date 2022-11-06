package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LoFiRecordsToMineTo.MOD_ID);

    public static final RegistryObject<SoundEvent> MUSIC_DISC_A_LITTLE_SOMETHING = registerSoundEvent("a_little_something");

    public static final RegistryObject<SoundEvent> MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE = registerSoundEvent("a_mix_of_sound_and_space");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ALONE = registerSoundEvent("alone");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_FACE_IT = registerSoundEvent("face_it");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_FALLING_LEAVES = registerSoundEvent("falling_leaves");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_FINGER_PUPPETS = registerSoundEvent("finger_puppets");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_FALLS_FIRST_SUNDAY = registerSoundEvent("falls_first_sunday");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAPPY_BIRTHDAY = registerSoundEvent("happy_birthday");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_IN_SEARCH_OF_LIFE = registerSoundEvent("in_search_of_life");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_INTERDIMENSIONAL = registerSoundEvent("interdimensional");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ITS_INSIDE = registerSoundEvent("its_inside");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_LOOK_AT_THE_CAMERA = registerSoundEvent("look_at_the_camera");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_MAKING_WAYS = registerSoundEvent("making_ways");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_MEMORY_LOSS = registerSoundEvent("memory_loss");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_NORMAL = registerSoundEvent("normal");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_OVERHEAD = registerSoundEvent("overhead");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PLUCKED = registerSoundEvent("plucked");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_REMEMBER = registerSoundEvent("remember");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_RENDER = registerSoundEvent("render");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_RUNNING_FROM_GIANTS = registerSoundEvent("running_from_giants");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_SHADOW_PEOPLE = registerSoundEvent("shadow_people");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_SPACE_WHALES = registerSoundEvent("space_whales");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_SURVIVED_BY = registerSoundEvent("survived_by");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_THERE_THERE = registerSoundEvent("there_there");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_THICKER = registerSoundEvent("thicker");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_TIME_RIDER = registerSoundEvent("time_rider");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_TURNING_OVER_ROCKS = registerSoundEvent("turning_over_rocks");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_UNCANNY = registerSoundEvent("uncanny");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_WAR = registerSoundEvent("war");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_WHEN_IT_RAINS = registerSoundEvent("when_it_rains");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_WIND = registerSoundEvent("wind");

    public static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(LoFiRecordsToMineTo.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
