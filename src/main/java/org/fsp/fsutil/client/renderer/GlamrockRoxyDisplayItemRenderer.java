package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.GlamrockRoxyDisplayModel;
import org.fsp.fsutil.item.custom.GlamrockRoxyDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GlamrockRoxyDisplayItemRenderer extends GeoItemRenderer<GlamrockRoxyDisplayItem> {
    public GlamrockRoxyDisplayItemRenderer() {
        super(new GlamrockRoxyDisplayModel());
    }

    @Override
    public RenderType getRenderType(GlamrockRoxyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}