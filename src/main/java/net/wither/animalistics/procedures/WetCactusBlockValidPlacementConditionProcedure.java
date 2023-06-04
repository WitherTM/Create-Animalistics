package net.wither.animalistics.procedures;

import net.wither.animalistics.init.AnimalisticsModBlocks;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class WetCactusBlockValidPlacementConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SAND) {
			world.setBlock(BlockPos.containing(x, y, z), AnimalisticsModBlocks.WET_CACTUS.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.RED_SAND) {
			world.setBlock(BlockPos.containing(x, y, z), AnimalisticsModBlocks.WET_CACTUS.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == AnimalisticsModBlocks.WET_CACTUS.get()) {
			world.setBlock(BlockPos.containing(x, y, z), AnimalisticsModBlocks.WET_CACTUS.get().defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AnimalisticsModBlocks.WET_CACTUS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
