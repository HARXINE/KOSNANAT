
package net.mcreator.jagh.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;
import net.minecraft.block.Blocks;

import net.mcreator.jagh.JaghModElements;

@JaghModElements.ModElement.Tag
public class JAGHPACKHoeItem extends JaghModElements.ModElement {
	@ObjectHolder("jagh:jaghpack_hoe")
	public static final Item block = null;

	public JAGHPACKHoeItem(JaghModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.SMOOTH_QUARTZ_STAIRS));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("jaghpack_hoe"));
	}
}
