package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.fsp.fsutil.client.model.Sl33pyDisplayModel;
import org.fsp.fsutil.client.model.TinkerDisplayModel;
import org.fsp.fsutil.item.custom.Sl33pyDisplayItem;
import org.fsp.fsutil.item.custom.TinkerDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;


public class TinkerDisplayItemRenderer extends GeoItemRenderer<TinkerDisplayItem> {
    public TinkerDisplayItemRenderer() {
        super(new TinkerDisplayModel());
    }

    @Override
    public RenderType getRenderType(TinkerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}


