package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.VEclispeTileEntity;
import org.fsp.fsutil.entity.VSpotTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class VSpotBlockModel extends GeoModel<VSpotTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(VSpotTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(VSpotTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/spot.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VSpotTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/vspottxt.png");
    }
}
