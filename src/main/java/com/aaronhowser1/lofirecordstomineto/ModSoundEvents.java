package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.Registry;

public class ModSoundEvents {

    public static final SoundEvent MUSIC_DISC_A_LITTLE_SOMETHING        = create(new ResourceLocation("lofirecordstomineto", "a_little_something"));
    public static final SoundEvent MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE  = create(new ResourceLocation("lofirecordstomineto", "a_mix_of_sound_and_space"));
    public static final SoundEvent MUSIC_DISC_ALONE                     = create(new ResourceLocation("lofirecordstomineto", "alone"));
    public static final SoundEvent MUSIC_DISC_FACE_IT                   = create(new ResourceLocation("lofirecordstomineto", "face_it"));
//  Commented out because it has vocals
//  public static final SoundEvent MUSIC_DISC_FACES                     = create(new ResourceLocation("lofirecordstomineto", "faces"));
    public static final SoundEvent MUSIC_DISC_FALLING_LEAVES            = create(new ResourceLocation("lofirecordstomineto", "falling_leaves"));
    public static final SoundEvent MUSIC_DISC_FINGER_PUPPETS            = create(new ResourceLocation("lofirecordstomineto", "finger_puppets"));
    public static final SoundEvent MUSIC_DISC_FALLS_FIRST_SUNDAY        = create(new ResourceLocation("lofirecordstomineto", "falls_first_sunday"));
    public static final SoundEvent MUSIC_DISC_HAPPY_BIRTHDAY            = create(new ResourceLocation("lofirecordstomineto", "happy_birthday"));
    public static final SoundEvent MUSIC_DISC_IN_SEARCH_OF_LIFE         = create(new ResourceLocation("lofirecordstomineto", "in_search_of_life"));
    public static final SoundEvent MUSIC_DISC_INTERDIMENSIONAL          = create(new ResourceLocation("lofirecordstomineto", "interdimensional"));
    public static final SoundEvent MUSIC_DISC_ITS_INSIDE                = create(new ResourceLocation("lofirecordstomineto", "its_inside"));
//  public static final SoundEvent MUSIC_DISC_KEYHOLE                   = create(new ResourceLocation("lofirecordstomineto", "keyhole"));
    public static final SoundEvent MUSIC_DISC_LOOK_AT_THE_CAMERA        = create(new ResourceLocation("lofirecordstomineto", "look_at_the_camera"));
    public static final SoundEvent MUSIC_DISC_MAKING_WAYS               = create(new ResourceLocation("lofirecordstomineto", "making_ways"));
    public static final SoundEvent MUSIC_DISC_MEMORY_LOSS               = create(new ResourceLocation("lofirecordstomineto", "memory_loss"));
    public static final SoundEvent MUSIC_DISC_NORMAL                    = create(new ResourceLocation("lofirecordstomineto", "normal"));
    public static final SoundEvent MUSIC_DISC_OVERHEAD                  = create(new ResourceLocation("lofirecordstomineto", "overhead"));
    public static final SoundEvent MUSIC_DISC_PLUCKED                   = create(new ResourceLocation("lofirecordstomineto", "plucked"));
    public static final SoundEvent MUSIC_DISC_REMEMBER                  = create(new ResourceLocation("lofirecordstomineto", "remember"));
    public static final SoundEvent MUSIC_DISC_RENDER                    = create(new ResourceLocation("lofirecordstomineto", "render"));
    public static final SoundEvent MUSIC_DISC_RUNNING_FROM_GIANTS       = create(new ResourceLocation("lofirecordstomineto", "running_from_giants"));
    public static final SoundEvent MUSIC_DISC_SHADOW_PEOPLE             = create(new ResourceLocation("lofirecordstomineto", "shadow_people"));
    public static final SoundEvent MUSIC_DISC_SPACE_WHALES              = create(new ResourceLocation("lofirecordstomineto", "space_whales"));
    public static final SoundEvent MUSIC_DISC_SURVIVED_BY               = create(new ResourceLocation("lofirecordstomineto", "survived_by"));
    public static final SoundEvent MUSIC_DISC_THERE_THERE               = create(new ResourceLocation("lofirecordstomineto", "there_there"));
    public static final SoundEvent MUSIC_DISC_THICKER                   = create(new ResourceLocation("lofirecordstomineto", "thicker"));
    public static final SoundEvent MUSIC_DISC_TIME_RIDER                = create(new ResourceLocation("lofirecordstomineto", "time_rider"));
    public static final SoundEvent MUSIC_DISC_TURNING_OVER_ROCKS        = create(new ResourceLocation("lofirecordstomineto", "turning_over_rocks"));
    public static final SoundEvent MUSIC_DISC_UNCANNY                   = create(new ResourceLocation("lofirecordstomineto", "uncanny"));
    public static final SoundEvent MUSIC_DISC_WAR                       = create(new ResourceLocation("lofirecordstomineto", "war"));
    public static final SoundEvent MUSIC_DISC_WHEN_IT_RAINS             = create(new ResourceLocation("lofirecordstomineto", "when_it_rains"));
    public static final SoundEvent MUSIC_DISC_WIND                      = create(new ResourceLocation("lofirecordstomineto", "wind"));

    private static SoundEvent create(ResourceLocation name) {
        return new SoundEvent(name).setRegistryName(name);
    }
}
