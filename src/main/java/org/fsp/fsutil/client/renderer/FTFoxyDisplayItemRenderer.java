package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.FTFoxyDisplayModel;
import org.fsp.fsutil.item.custom.FTFoxyDisplayItem;
import org.fsp.fsutil.item.custom.FTFreddyDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FTFoxyDisplayItemRenderer extends GeoItemRenderer<FTFoxyDisplayItem> {
    public FTFoxyDisplayItemRenderer() {
        super(new FTFoxyDisplayModel());
    }

    @Override
    public RenderType getRenderType(FTFoxyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}