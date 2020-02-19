package com.aaronhowser1.lofirecordstomineto;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.Registry;

public class ModSoundEvents {
    public static final SoundEvent MUSIC_DISC_A_LITTLE_SOMETHING        = register("lofirecordstomineto:music_disc.alittlesomething");
    public static final SoundEvent MUSIC_DISC_A_MIX_OF_SOUND_AND_SPACE  = register("lofirecordstomineto:music_disc.amixofsoundandspace");
    public static final SoundEvent MUSIC_DISC_ALONE                     = register("lofirecordstomineto:music_disc.alone");
    public static final SoundEvent MUSIC_DISC_FACE_IT                   = register("lofirecordstomineto:music_disc.faceit");
//  Commented out because it has vocals
//  public static final SoundEvent MUSIC_DISC_FACES                     = register("lofirecordstomineto:music_disc.faces");
    public static final SoundEvent MUSIC_DISC_FALLING_LEAVES            = register("lofirecordstomineto:music_disc.fallingleaves");
    public static final SoundEvent MUSIC_DISC_FINGER_PUPPETS            = register("lofirecordstomineto:music_disc.fingerpuppets");
    public static final SoundEvent MUSIC_DISC_FIRST_FALLS_SUNDAY        = register("lofirecordstomineto:music_disc.firstfallssunday");
    public static final SoundEvent MUSIC_DISC_HAPPY_BIRTHDAY            = register("lofirecordstomineto:music_disc.happybirthday");
    public static final SoundEvent MUSIC_DISC_IN_SEARCH_OF_LIFE         = register("lofirecordstomineto:music_disc.insearchoflife");
    public static final SoundEvent MUSIC_DISC_INTERDIMENSIONAL          = register("lofirecordstomineto:music_disc.interdimensional");
    public static final SoundEvent MUSIC_DISC_ITS_INSIDE                = register("lofirecordstomineto:music_disc.itsinside");
//  public static final SoundEvent MUSIC_DISC_KEYHOLE                   = register("lofirecordstomineto:music_disc.keyhole");
    public static final SoundEvent MUSIC_DISC_LOOK_AT_THE_CAMERA        = register("lofirecordstomineto:music_disc.lookatthecamera");
    public static final SoundEvent MUSIC_DISC_MAKING_WAYS               = register("lofirecordstomineto:music_disc.makingways");
    public static final SoundEvent MUSIC_DISC_MEMORY_LOSS               = register("lofirecordstomineto:music_disc.memoryloss");
    public static final SoundEvent MUSIC_DISC_NORMAL                    = register("lofirecordstomineto:music_disc.normal");
    public static final SoundEvent MUSIC_DISC_OVERHEAD                  = register("lofirecordstomineto:music_disc.overhead");
    public static final SoundEvent MUSIC_DISC_PLUCKED                   = register("lofirecordstomineto:music_disc.plucked");
    public static final SoundEvent MUSIC_DISC_REMEMBER                  = register("lofirecordstomineto:music_disc.remember");
    public static final SoundEvent MUSIC_DISC_RENDER                    = register("lofirecordstomineto:music_disc.render");
    public static final SoundEvent MUSIC_DISC_RUNNING_FROM_GIANTS       = register("lofirecordstomineto:music_disc.runningfromgiants");
    public static final SoundEvent MUSIC_DISC_SHADOW_PEOPLE             = register("lofirecordstomineto:music_disc.shadowpeople");
    public static final SoundEvent MUSIC_DISC_SPACE_WHALES              = register("lofirecordstomineto:music_disc.spacewhales");
    public static final SoundEvent MUSIC_DISC_SURVIVED_BY               = register("lofirecordstomineto:music_disc.survivedby...");
    public static final SoundEvent MUSIC_DISC_THERE_THERE                = register("lofirecordstomineto:music_disc.therethere");
    public static final SoundEvent MUSIC_DISC_THICKER                   = register("lofirecordstomineto:music_disc.thicker");
    public static final SoundEvent MUSIC_DISC_TIME_RIDER                = register("lofirecordstomineto:music_disc.timerider");
    public static final SoundEvent MUSIC_DISC_TURNING_OVER_ROCKS        = register("lofirecordstomineto:music_disc.turningoverrocks");
    public static final SoundEvent MUSIC_DISC_UNCANNY                   = register("lofirecordstomineto:music_disc.uncanny");
    public static final SoundEvent MUSIC_DISC_WAR                       = register("lofirecordstomineto:music_disc.war");
    public static final SoundEvent MUSIC_DISC_WHEN_IT_RAINS             = register("lofirecordstomineto:music_disc.whenitrains");
    public static final SoundEvent MUSIC_DISC_WIND                      = register("lofirecordstomineto:music_disc.wind");


    private static net.minecraft.util.SoundEvent register(String key) {
        return Registry.register(Registry.SOUND_EVENT, key, new SoundEvent(new ResourceLocation(key)));
    }

}
