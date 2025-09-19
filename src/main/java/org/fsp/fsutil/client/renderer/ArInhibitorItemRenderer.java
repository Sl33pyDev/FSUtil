package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import org.fsp.fsutil.client.model.ArInhibitorDisplayModel;
import org.fsp.fsutil.client.model.VSpotDisplayModel;
import org.fsp.fsutil.item.custom.ArInhibitorDisplayItem;
import org.fsp.fsutil.item.custom.VSpotDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

import static org.fsp.fsutil.Fsutil.MOD_ID;


public class ArInhibitorItemRenderer extends GeoItemRenderer<ArInhibitorDisplayItem> {
    public ArInhibitorItemRenderer() {
        super(new ArInhibitorDisplayModel());
    }

    @Override
    public RenderType getRenderType(ArInhibitorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
