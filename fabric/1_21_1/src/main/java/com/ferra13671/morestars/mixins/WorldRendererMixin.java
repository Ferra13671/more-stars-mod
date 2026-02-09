package com.ferra13671.morestars.mixins;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {

    @ModifyConstant(method = "buildStarsBuffer", constant = @Constant(intValue = 1500))
    public int modifyStarsConstantInBuildStarsBuffer(int constant) {
        return 20000;
    }

    @ModifyConstant(method = "buildStarsBuffer", constant = @Constant(floatValue = 0.15f))
    public float modifyStarSizeConstantInBuildStarsBuffer(float constant) {
        return 0.05f;
    }
}
