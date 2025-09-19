package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.FreddyDisplayModel;
import org.fsp.fsutil.client.model.GlamrockChicaDisplayModel;
import org.fsp.fsutil.item.custom.FreddyDisplayItem;
import org.fsp.fsutil.item.custom.GlamrockChicaDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GlamrockChicaDisplayItemRenderer extends GeoItemRenderer<GlamrockChicaDisplayItem> {
    public GlamrockChicaDisplayItemRenderer() {
        super(new GlamrockChicaDisplayModel());
    }

    @Override
    public RenderType getRenderType(GlamrockChicaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}