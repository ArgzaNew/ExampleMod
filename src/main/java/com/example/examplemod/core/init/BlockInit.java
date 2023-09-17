package com.example.examplemod.core.init;

import com.example.examplemod.ExampleMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ExampleMod.MOD_ID);

	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN).strength(0.5f, 1f)
					.harvestTool(ToolType.AXE).harvestLevel(0).sound(SoundType.SCAFFOLDING)));
	
	public static final RegistryObject<Block> EXAMPLE_ORE = BLOCKS.register("example_ore",
			() -> new Block(AbstractBlock.Properties.copy(net.minecraft.block.Blocks.IRON_ORE)));
	
	public static final RegistryObject<Block> COVELLITE_ORE = BLOCKS.register("covellite_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE)));
	

}
