package com.keanucode.keanumod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class KeanuMod implements ModInitializer {
    // Create a definition for the Trav item (has no functionality)
    public static final Item TRAV = new TravItem(new FabricItemSettings().group(ItemGroup.MISC));

    // Pickaxe
    public static final ToolItem TRAV_PICKAXE = new TravPickaxeMaterial.CustomPickaxeItem(TravPickaxeMaterial.INSTANCE, 1, 1.5F, new Item.Settings().group(ItemGroup.TOOLS));

    // Block
    public static final Block TRAV_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).hardness(30.0f));
    @Override
    public void onInitialize() {
        System.out.println("KeanuMod has been loaded!");

        // Register items
        Registry.register(Registry.ITEM, new Identifier("keanumod", "trav"), TRAV);
        Registry.register(Registry.ITEM, new Identifier("keanumod", "travpickaxe"), TRAV_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("keanumod", "travblock"), new BlockItem(TRAV_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

        // Register blocks
        Registry.register(Registry.BLOCK, new Identifier("keanumod", "travblock"), TRAV_BLOCK);
    };
}
