package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.BonnieTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class BonnieBlockModel extends GeoModel<BonnieTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(BonnieTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(BonnieTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/bonnie.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BonnieTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/bonnieplush.png");
    }
}
