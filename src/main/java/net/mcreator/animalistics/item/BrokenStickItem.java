
package net.mcreator.animalistics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BrokenStickItem extends Item {
	public BrokenStickItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
