package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.AR_ITileEntity;
import org.fsp.fsutil.entity.Sl33pyTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class ArInhibitorBlockModel extends GeoModel<AR_ITileEntity> {
    @Override
    public ResourceLocation getAnimationResource(AR_ITileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/ar_inhibitor.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(AR_ITileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/ar_inhibitor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AR_ITileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/ar_i_main.png");
    }
}
