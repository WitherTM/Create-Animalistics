package net.wither.animalistics.procedures;

import net.wither.animalistics.init.AnimalisticsModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class WetCactusBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == AnimalisticsModBlocks.WET_CACTUS.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.SAND || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.RED_SAND)) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		} else {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SAND) {
				world.setBlock(new BlockPos(x, y, z), AnimalisticsModBlocks.WET_CACTUS.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.RED_SAND) {
				world.setBlock(new BlockPos(x, y, z), AnimalisticsModBlocks.WET_CACTUS.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == AnimalisticsModBlocks.WET_CACTUS.get()) {
				world.setBlock(new BlockPos(x, y, z), AnimalisticsModBlocks.WET_CACTUS.get().defaultBlockState(), 3);
			} else {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		}
	}
}
