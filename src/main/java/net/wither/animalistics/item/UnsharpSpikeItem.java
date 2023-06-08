
package net.wither.animalistics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class UnsharpSpikeItem extends Item {
	public UnsharpSpikeItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
