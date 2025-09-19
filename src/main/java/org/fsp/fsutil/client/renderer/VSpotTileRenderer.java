package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import org.fsp.fsutil.client.model.VEclispeBlockModel;
import org.fsp.fsutil.client.model.VSpotBlockModel;
import org.fsp.fsutil.entity.VEclispeTileEntity;
import org.fsp.fsutil.entity.VSpotTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

import static org.fsp.fsutil.Fsutil.MOD_ID;


public class VSpotTileRenderer extends GeoBlockRenderer<VSpotTileEntity> {
    public VSpotTileRenderer() {
        super(new VSpotBlockModel());
    }

    @Override
    public RenderType getRenderType(VSpotTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
