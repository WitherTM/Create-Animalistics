
package net.wither.animalistics.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class DriedCactusPulpItem extends Item {
	public DriedCactusPulpItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
