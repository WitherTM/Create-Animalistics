
package net.mcreator.animalistics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UnsharpSpikeItem extends Item {
	public UnsharpSpikeItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
