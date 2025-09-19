package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.PSpringBonnieDisplayModel;
import org.fsp.fsutil.client.model.SpringBonnieDisplayModel;
import org.fsp.fsutil.item.custom.PSpringBonnieDisplayItem;
import org.fsp.fsutil.item.custom.SpringBonnieDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class PSpringBonnieDisplayItemRenderer extends GeoItemRenderer<PSpringBonnieDisplayItem> {
    public PSpringBonnieDisplayItemRenderer() {
        super(new PSpringBonnieDisplayModel());
    }

    @Override
    public RenderType getRenderType(PSpringBonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}

