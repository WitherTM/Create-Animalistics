
package net.wither.animalistics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CactusPulpItem extends Item {
	public CactusPulpItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
