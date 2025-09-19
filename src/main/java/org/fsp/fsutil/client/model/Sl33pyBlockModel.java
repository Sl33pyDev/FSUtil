package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.Sl33pyTileEntity;
import org.fsp.fsutil.entity.VSpotTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class Sl33pyBlockModel extends GeoModel<Sl33pyTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(Sl33pyTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(Sl33pyTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/sl33py.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Sl33pyTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/sl33py.png");
    }
}
