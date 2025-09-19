package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.FreddyDisplayModel;
import org.fsp.fsutil.item.custom.FreddyDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FreddyDisplayItemRenderer extends GeoItemRenderer<FreddyDisplayItem> {
    public FreddyDisplayItemRenderer() {
        super(new FreddyDisplayModel());
    }

    @Override
    public RenderType getRenderType(FreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}