
package net.mcreator.dirtycraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.dirtycraft.DirtycraftModElements;

@DirtycraftModElements.ModElement.Tag
public class JAGHPACKPickaxeItem extends DirtycraftModElements.ModElement {
	@ObjectHolder("dirtycraft:jaghpack_pickaxe")
	public static final Item block = null;

	public JAGHPACKPickaxeItem(DirtycraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("jaghpack_pickaxe"));
	}
}
