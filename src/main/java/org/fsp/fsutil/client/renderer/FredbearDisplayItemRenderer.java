package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.FredbearDisplayModel;
import org.fsp.fsutil.item.custom.FredbearDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FredbearDisplayItemRenderer extends GeoItemRenderer<FredbearDisplayItem> {
    public FredbearDisplayItemRenderer() {
        super(new FredbearDisplayModel());
    }

    @Override
    public RenderType getRenderType(FredbearDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}