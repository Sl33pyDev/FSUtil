package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.FTFreddyDisplayModel;
import org.fsp.fsutil.client.model.PSpringBonnieDisplayModel;
import org.fsp.fsutil.item.custom.FTFreddyDisplayItem;
import org.fsp.fsutil.item.custom.PSpringBonnieDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FTFreddyDisplayItemRenderer extends GeoItemRenderer<FTFreddyDisplayItem> {
    public FTFreddyDisplayItemRenderer() {
        super(new FTFreddyDisplayModel());
    }

    @Override
    public RenderType getRenderType(FTFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}