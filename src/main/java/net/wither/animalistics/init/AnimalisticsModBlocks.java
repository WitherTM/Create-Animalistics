
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.wither.animalistics.init;

import net.wither.animalistics.block.WetCactusBlock;
import net.wither.animalistics.AnimalisticsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class AnimalisticsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AnimalisticsMod.MODID);
	public static final RegistryObject<Block> WET_CACTUS = REGISTRY.register("wet_cactus", () -> new WetCactusBlock());
}
