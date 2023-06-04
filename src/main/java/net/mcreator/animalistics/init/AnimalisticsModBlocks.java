
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animalistics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.animalistics.block.WetCactusBlock;
import net.mcreator.animalistics.AnimalisticsMod;

public class AnimalisticsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AnimalisticsMod.MODID);
	public static final RegistryObject<Block> WET_CACTUS = REGISTRY.register("wet_cactus", () -> new WetCactusBlock());
}
