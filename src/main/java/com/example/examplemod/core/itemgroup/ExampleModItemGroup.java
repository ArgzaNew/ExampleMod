package com.example.examplemod.core.itemgroup;

import com.example.examplemod.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ExampleModItemGroup extends ItemGroup {
	public static final ExampleModItemGroup EXAMPLE_MOD = new ExampleModItemGroup(ItemGroup.TABS.length, "example_mod");
	
	public ExampleModItemGroup(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.POOP.get());
	}

}
