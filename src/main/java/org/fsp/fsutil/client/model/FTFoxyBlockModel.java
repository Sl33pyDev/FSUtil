package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.FTFoxyTileEntity;
import org.fsp.fsutil.entity.FTFreddyTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class FTFoxyBlockModel extends GeoModel<FTFoxyTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(FTFoxyTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(FTFoxyTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/ftfoxy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FTFoxyTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/ftfoxyplush.png");
    }
}
