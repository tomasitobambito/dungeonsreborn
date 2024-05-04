package net.okense.dungeonsreborn.block;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class DiamondDustBagBlock extends Block {
    public DiamondDustBagBlock(Settings settings){
        super(settings);
    }

    private static final VoxelShape OUTLINESHAPE = Stream.of(
            Block.createCuboidShape(2, 0, 2, 14, 12, 14),
            Block.createCuboidShape(4, 12, 4, 4, 14, 12),
            Block.createCuboidShape(12, 12, 4, 12, 14, 12),
            Block.createCuboidShape(4, 12, 4, 12, 14, 4),
            Block.createCuboidShape(4, 12, 12, 12, 14, 12),
            Block.createCuboidShape(4, 13, 4, 12, 13, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape COLLISIONSHAPE = Block.createCuboidShape(2, 0, 2, 14, 12, 14);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return OUTLINESHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return COLLISIONSHAPE;
    }
}


