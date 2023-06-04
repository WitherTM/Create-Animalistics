
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animalistics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.animalistics.item.UnsharpSpikeItem;
import net.mcreator.animalistics.item.SweetBerryItem;
import net.mcreator.animalistics.item.SweetBerryCleanItem;
import net.mcreator.animalistics.item.RawLeatherItem;
import net.mcreator.animalistics.item.DriedCactusPulpItem;
import net.mcreator.animalistics.item.CactusSpikeItem;
import net.mcreator.animalistics.item.CactusPulpItem;
import net.mcreator.animalistics.item.CactusFiberItem;
import net.mcreator.animalistics.item.BrokenStickItem;
import net.mcreator.animalistics.AnimalisticsMod;

public class AnimalisticsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnimalisticsMod.MODID);
	public static final RegistryObject<Item> WET_CACTUS = block(AnimalisticsModBlocks.WET_CACTUS);
	public static final RegistryObject<Item> BROKEN_STICK = REGISTRY.register("broken_stick", () -> new BrokenStickItem());
	public static final RegistryObject<Item> CACTUS_PULP = REGISTRY.register("cactus_pulp", () -> new CactusPulpItem());
	public static final RegistryObject<Item> DRIED_CACTUS_PULP = REGISTRY.register("dried_cactus_pulp", () -> new DriedCactusPulpItem());
	public static final RegistryObject<Item> CACTUS_FIBER = REGISTRY.register("cactus_fiber", () -> new CactusFiberItem());
	public static final RegistryObject<Item> CACTUS_SPIKE = REGISTRY.register("cactus_spike", () -> new CactusSpikeItem());
	public static final RegistryObject<Item> UNSHARP_SPIKE = REGISTRY.register("unsharp_spike", () -> new UnsharpSpikeItem());
	public static final RegistryObject<Item> RAW_LEATHER = REGISTRY.register("raw_leather", () -> new RawLeatherItem());
	public static final RegistryObject<Item> FRESH_SWEET_BERRY = REGISTRY.register("fresh_sweet_berry", () -> new SweetBerryItem());
	public static final RegistryObject<Item> SWEET_BERRY = REGISTRY.register("sweet_berry", () -> new SweetBerryCleanItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
