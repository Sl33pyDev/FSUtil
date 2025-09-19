package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.FreddyBlockModel;
import org.fsp.fsutil.client.model.GlamrockChicaBlockModel;
import org.fsp.fsutil.entity.FreddyTileEntity;
import org.fsp.fsutil.entity.GlamrockChicaTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class GlamrockChicaTileRenderer extends GeoBlockRenderer<GlamrockChicaTileEntity> {
    public GlamrockChicaTileRenderer() {
        super(new GlamrockChicaBlockModel());
    }

    @Override
    public RenderType getRenderType(GlamrockChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
