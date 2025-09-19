package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.FTFreddyTileEntity;
import org.fsp.fsutil.entity.PSpringBonnieTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class FTFreddyBlockModel extends GeoModel<FTFreddyTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(FTFreddyTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(FTFreddyTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/ftfreddy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FTFreddyTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/ftfreddyplush.png");
    }
}
