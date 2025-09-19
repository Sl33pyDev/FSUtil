package org.fsp.fsutil.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.fsp.fsutil.Fsutil;
import org.fsp.fsutil.entity.*;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Fsutil.MOD_ID);
    public static final RegistryObject<BlockEntityType<VSpotTileEntity>> V_SPOT = REGISTRY.register("v_spot", () -> BlockEntityType.Builder.of(VSpotTileEntity::new, ModBlocks.V_SPOT.get()).build(null));
    public static final RegistryObject<BlockEntityType<Sl33pyTileEntity>> SL33PY = REGISTRY.register("sl33py", () -> BlockEntityType.Builder.of(Sl33pyTileEntity::new, ModBlocks.SL33PY.get()).build(null));
    public static final RegistryObject<BlockEntityType<TinkerTileEntity>> TINKER = REGISTRY.register("tinker", () -> BlockEntityType.Builder.of(TinkerTileEntity::new, ModBlocks.TINKER.get()).build(null));
    public static final RegistryObject<BlockEntityType<FTFreddyTileEntity>> FT_FREDDY = REGISTRY.register("ft_freddy", () -> BlockEntityType.Builder.of(FTFreddyTileEntity::new, ModBlocks.FT_FREDDY.get()).build(null));
    public static final RegistryObject<BlockEntityType<GlamrockChicaTileEntity>> GLAMROCK_CHICA = REGISTRY.register("glamrock_chica", () -> BlockEntityType.Builder.of(GlamrockChicaTileEntity::new, ModBlocks.GLAMROCK_CHICA.get()).build(null));
    public static final RegistryObject<BlockEntityType<GlamrockRoxyTileEntity>> GLAMROCK_ROXY = REGISTRY.register("glamrock_roxy", () -> BlockEntityType.Builder.of(GlamrockRoxyTileEntity::new, ModBlocks.GLAMROCK_ROXY.get()).build(null));
    public static final RegistryObject<BlockEntityType<FredbearTileEntity>> FREDBEAR = REGISTRY.register("fredbear", () -> BlockEntityType.Builder.of(FredbearTileEntity::new, ModBlocks.FREDBEAR.get()).build(null));
    public static final RegistryObject<BlockEntityType<HelpyTileEntity>> HELPY = REGISTRY.register("helpy", () -> BlockEntityType.Builder.of(HelpyTileEntity::new, ModBlocks.HELPY.get()).build(null));
    public static final RegistryObject<BlockEntityType<PFredbearTileEntity>> P_FREDBEAR = REGISTRY.register("p_fredbear", () -> BlockEntityType.Builder.of(PFredbearTileEntity::new, ModBlocks.P_FREDBEAR.get()).build(null));
    public static final RegistryObject<BlockEntityType<FreddyTileEntity>> FREDDY = REGISTRY.register("freddy", () -> BlockEntityType.Builder.of(FreddyTileEntity::new, ModBlocks.FREDDY.get()).build(null));
    public static final RegistryObject<BlockEntityType<FTFoxyTileEntity>> FT_FOXY = REGISTRY.register("ft_foxy", () -> BlockEntityType.Builder.of(FTFoxyTileEntity::new, ModBlocks.FT_FOXY.get()).build(null));
    public static final RegistryObject<BlockEntityType<BonnieTileEntity>> BONNIE = REGISTRY.register("bonnie", () -> BlockEntityType.Builder.of(BonnieTileEntity::new, ModBlocks.BONNIE.get()).build(null));
    public static final RegistryObject<BlockEntityType<Sl33pyArmTileEntity>> SL33PY_ARM = REGISTRY.register("sl33py_arm", () -> BlockEntityType.Builder.of(Sl33pyArmTileEntity::new, ModBlocks.SL33PY_ARM.get()).build(null));
    public static final RegistryObject<BlockEntityType<SpringBonnieTileEntity>> SPRING_BONNIE = REGISTRY.register("spring_bonnie", () -> BlockEntityType.Builder.of(SpringBonnieTileEntity::new, ModBlocks.SPRING_BONNIE.get()).build(null));
    public static final RegistryObject<BlockEntityType<PSpringBonnieTileEntity>> P_SPRING_BONNIE = REGISTRY.register("p_spring_bonnie", () -> BlockEntityType.Builder.of(PSpringBonnieTileEntity::new, ModBlocks.P_SPRING_BONNIE.get()).build(null));
    public static final RegistryObject<BlockEntityType<VEclispeTileEntity>> V_ECLISPE = REGISTRY.register("v_eclispe", () -> BlockEntityType.Builder.of(VEclispeTileEntity::new, ModBlocks.V_ECLISPE.get()).build(null));
    public static final RegistryObject<BlockEntityType<AR_ITileEntity>> AR_I = REGISTRY.register("ar_i", () -> BlockEntityType.Builder.of(AR_ITileEntity::new, ModBlocks.AR_I.get()).build(null));
    // Start of user code block custom block entities
    // End of user code block custom block entities
    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
        return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
    }
}

