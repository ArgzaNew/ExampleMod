package com.example.examplemod.core.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.core.itemgroup.ExampleModItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            ExampleMod.MOD_ID);

    public static final RegistryObject<Item> POOP = ITEMS.register("poop", () -> new Item(new Item.Properties().tab(ExampleModItemGroup.EXAMPLE_MOD)));

    public static final RegistryObject<Item> EXAMPLE_INGOT = ITEMS.register("example_ingot", () -> new Item(new Item.Properties().tab(ExampleModItemGroup.EXAMPLE_MOD)));
}
