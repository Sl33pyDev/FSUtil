package org.fsp.fsutil.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.fsp.fsutil.procedure.OpenclosedProcedure;

public class CurtainDoorBlock extends Block {
    public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 2);

    public CurtainDoorBlock() {
        super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(1f, 10f).lightLevel(s -> (new Object() {
            public int getLightLevel() {
                if (s.getValue(BLOCKSTATE) == 0)
                    return 0;
                if (s.getValue(BLOCKSTATE) == 1)
                    return 0;
                return 0;
            }
        }.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        if (state.getValue(BLOCKSTATE) == 1) {
            return Shapes.or(box(30, -16, -1, 32, 32, 0), box(-14, 30, -1, 30, 32, 0), box(-16, -16, -1, -14, 32, 0), box(30, -16, 16, 32, 32, 17), box(-14, 30, 16, 30, 32, 17), box(-16, -16, 16, -14, 32, 17), box(-16, -16, 0, -14, 32, 16),
                    box(30, -16, 0, 32, 32, 16), box(-14, 30, 0, 30, 32, 16), box(-14, -16, 7, 30, 30, 9));
        }
        return Shapes.or(Block.box(30, -16, -1, 32, 32, 0),
                Block.box(-14, 30, -1, 30, 32, 0),
                Block.box(-16, -16, -1, -14, 32, 0),
                Block.box(30, -16, 16, 32, 32, 17),
                Block.box(-14, 30, 16, 30, 32, 17),
                Block.box(-16, -16, 16, -14, 32, 17),
                Block.box(-16, -16, 0, -14, 32, 16),
                Block.box(30, -16, 0, 32, 32, 16),
                Block.box(-14, 30, 0, 30, 32, 16),
                Block.box(20, 12, 7, 30, 30, 9),
                Block.box(-14, 0, 7, -6, 12, 9),
                Block.box(-14, -2, 6, -10, 0, 10),
                Block.box(-14, -7, 7, -9, -2, 9),
                Block.box(-14, -12, 7, -7, -7, 9),
                Block.box(23, -12, 7, 30, -7, 9),
                Block.box(22, 0, 7, 30, 12, 9),
                Block.box(26, -2, 6, 30, 0, 10),
                Block.box(25, -7, 7, 30, -2, 9),
                Block.box(-14, 12, 7, -4, 30, 9));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(BLOCKSTATE);
    }

    @Override
    public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        super.use(blockstate, world, pos, entity, hand, hit);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        double hitX = hit.getLocation().x;
        double hitY = hit.getLocation().y;
        double hitZ = hit.getLocation().z;
        Direction direction = hit.getDirection();
        OpenclosedProcedure.execute(world, x, y, z, blockstate);
        return InteractionResult.SUCCESS;
    }
}

