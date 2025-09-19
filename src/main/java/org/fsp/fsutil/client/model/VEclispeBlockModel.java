package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.VEclispeTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class VEclispeBlockModel extends GeoModel<VEclispeTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(VEclispeTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(VEclispeTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/eclipse.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VEclispeTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/glameclipseplush.png");
    }
}
