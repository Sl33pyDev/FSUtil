package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import org.fsp.fsutil.client.model.Sl33pyDisplayModel;
import org.fsp.fsutil.client.model.VSpotDisplayModel;
import org.fsp.fsutil.item.custom.Sl33pyDisplayItem;
import org.fsp.fsutil.item.custom.VSpotDisplayItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

import static org.fsp.fsutil.Fsutil.MOD_ID;



public class Sl33pyDisplayItemRenderer extends GeoItemRenderer<Sl33pyDisplayItem> {
    public Sl33pyDisplayItemRenderer() {
        super(new Sl33pyDisplayModel());
    }

    @Override
    public RenderType getRenderType(Sl33pyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}


