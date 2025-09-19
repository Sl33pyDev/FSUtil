package org.fsp.fsutil.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import org.fsp.fsutil.client.model.VEclispeBlockModel;
import org.fsp.fsutil.entity.VEclispeTileEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

import static org.fsp.fsutil.Fsutil.MOD_ID;


public class VEclispeTileRenderer extends GeoBlockRenderer<VEclispeTileEntity> {
    public VEclispeTileRenderer() {
        super(new VEclispeBlockModel());
    }

    @Override
    public RenderType getRenderType(VEclispeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
