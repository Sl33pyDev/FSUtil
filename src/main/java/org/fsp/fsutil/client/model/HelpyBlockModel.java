package org.fsp.fsutil.client.model;

import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.entity.HelpyTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class HelpyBlockModel extends GeoModel<HelpyTileEntity> {
    @Override
    public ResourceLocation getAnimationResource(HelpyTileEntity animatable) {
        return new ResourceLocation("fsutil", "animations/plush.animation.json");
    }

    @Override
    public ResourceLocation getModelResource(HelpyTileEntity animatable) {
        return new ResourceLocation("fsutil", "geo/helpy.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HelpyTileEntity animatable) {
        return new ResourceLocation("fsutil", "textures/block/helpyplush.png");
    }
}
