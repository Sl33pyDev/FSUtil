package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.PFredbearDisplayModel;
import org.fsp.fsutil.item.custom.PFredbearDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class PFredbearDisplayItemRenderer extends GeoItemRenderer<PFredbearDisplayItem> {
    public PFredbearDisplayItemRenderer() {
        super(new PFredbearDisplayModel());
    }

    @Override
    public RenderType getRenderType(PFredbearDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}