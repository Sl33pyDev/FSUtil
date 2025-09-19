package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.Sl33pyTileEntity;
import org.fsp.fsutil.entity.TinkerTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class TinkerBlockModel extends GeoModel<TinkerTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(TinkerTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(TinkerTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/tinker.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TinkerTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/tinker.png");
    }
}
