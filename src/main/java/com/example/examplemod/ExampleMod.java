package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.examplemod.core.init.BlockInit;
import com.example.examplemod.core.init.FeatureInit;
import com.example.examplemod.core.init.ItemInit;
import com.example.examplemod.core.itemgroup.ExampleModItemGroup;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("examplemod")
@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Bus.MOD)
public class ExampleMod {
	// Directly reference a log4j logger.
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "examplemod";

	public ExampleMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItem(final RegistryEvent.Register<Item> event) {
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->{
			event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(ExampleModItemGroup.EXAMPLE_MOD)).setRegistryName(block.getRegistryName()));
		});
		
	}

}
