package com.ferra13671.morestars.mixins;

import net.minecraft.client.render.SkyRendering;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(SkyRendering.class)
public class SkyRenderingMixin {

    @ModifyConstant(method = "tessellateStar", constant = @Constant(intValue = 1500))
    public int modifyStarsConstantInTessellateStar(int constant) {
        return 20000;
    }

    @ModifyConstant(method = "tessellateStar", constant = @Constant(floatValue = 0.15f))
    public float modifyStarSizeConstantInTessellateStar(float constant) {
        return 0.05f;
    }
}
