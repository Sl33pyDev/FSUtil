package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.FredbearTileEntity;
import org.fsp.fsutil.entity.PFredbearTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class FredbearBlockModel extends GeoModel<FredbearTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(FredbearTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(FredbearTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/fredbear.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FredbearTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/fredbearplush.png");
    }
}
