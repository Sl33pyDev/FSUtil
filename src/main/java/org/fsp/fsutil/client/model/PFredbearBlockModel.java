package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.PFredbearTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class PFredbearBlockModel extends GeoModel<PFredbearTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(PFredbearTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(PFredbearTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/fredbear.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PFredbearTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/pfredbearplush.png");
    }
}
