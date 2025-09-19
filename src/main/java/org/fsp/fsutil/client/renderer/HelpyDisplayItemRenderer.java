package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.HelpyDisplayModel;
import org.fsp.fsutil.item.custom.HelpyDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class HelpyDisplayItemRenderer extends GeoItemRenderer<HelpyDisplayItem> {
    public HelpyDisplayItemRenderer() {
        super(new HelpyDisplayModel());
    }

    @Override
    public RenderType getRenderType(HelpyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}