package com.keanucode.keanumod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class KeanuMod implements ModInitializer {
    public static final Item TRAV = new TravItem(new FabricItemSettings().group(ItemGroup.MISC));
    public static final ToolItem TRAV_PICKAXE = new TravPickaxeMaterial.CustomPickaxeItem(TravPickaxeMaterial.INSTANCE, 1, 1.5F, new Item.Settings().group(ItemGroup.TOOLS));
    @Override
    public void onInitialize() {
        System.out.println("heujjjjj!!! goeie zoooi!!!!!");
        Registry.register(Registry.ITEM, new Identifier("keanumod", "trav"), TRAV);
        Registry.register(Registry.ITEM, new Identifier("keanumod", "travpickaxe"), TRAV_PICKAXE);
    };
}
