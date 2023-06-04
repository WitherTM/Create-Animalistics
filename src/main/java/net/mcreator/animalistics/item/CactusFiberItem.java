
package net.mcreator.animalistics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CactusFiberItem extends Item {
	public CactusFiberItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
