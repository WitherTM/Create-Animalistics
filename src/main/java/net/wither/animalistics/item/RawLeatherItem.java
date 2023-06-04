
package net.wither.animalistics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawLeatherItem extends Item {
	public RawLeatherItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
