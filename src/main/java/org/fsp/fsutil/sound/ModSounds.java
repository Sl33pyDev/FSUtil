package org.fsp.fsutil.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.fsp.fsutil.Fsutil;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Fsutil.MOD_ID);
    public static final RegistryObject<SoundEvent> SQUEAK = REGISTRY.register("squeak", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fsutil", "squeak")));
}

