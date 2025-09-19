package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.GlamrockRoxyBlockModel;
import org.fsp.fsutil.entity.GlamrockRoxyTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class GlamrockRoxyTileRenderer extends GeoBlockRenderer<GlamrockRoxyTileEntity> {
    public GlamrockRoxyTileRenderer() {
        super(new GlamrockRoxyBlockModel());
    }

    @Override
    public RenderType getRenderType(GlamrockRoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
