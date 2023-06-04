
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.wither.animalistics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnimalisticsModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(AnimalisticsModItems.CACTUS_SPIKE.get());
			tabData.accept(AnimalisticsModItems.UNSHARP_SPIKE.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(AnimalisticsModItems.BROKEN_STICK.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(AnimalisticsModBlocks.WET_CACTUS.get().asItem());
			tabData.accept(AnimalisticsModItems.CACTUS_PULP.get());
			tabData.accept(AnimalisticsModItems.DRIED_CACTUS_PULP.get());
			tabData.accept(AnimalisticsModItems.CACTUS_FIBER.get());
		}

		if (tabData.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(AnimalisticsModItems.RAW_LEATHER.get());
			tabData.accept(AnimalisticsModItems.FRESH_SWEET_BERRY.get());
			tabData.accept(AnimalisticsModItems.SWEET_BERRY.get());
		}
	}
}
