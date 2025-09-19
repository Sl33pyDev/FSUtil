package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.FreddyTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class FreddyBlockModel extends GeoModel<FreddyTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(FreddyTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(FreddyTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/freddy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FreddyTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/freddyplush.png");
    }
}
