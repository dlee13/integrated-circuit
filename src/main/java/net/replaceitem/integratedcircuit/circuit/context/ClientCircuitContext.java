package net.replaceitem.integratedcircuit.circuit.context;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public interface ClientCircuitContext {
    BlockPos getBlockPos();
    void playSound(@Nullable PlayerEntity except, SoundEvent sound, SoundCategory category, float volume, float pitch);
}
