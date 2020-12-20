package com.keanucode.keanumod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class KeanuMod implements ModInitializer {
    public static final Item TRAV = new FabricItem(new FabricItemSettings().group(ItemGroup.MISC));
    @Override
    public void onInitialize() {
        System.out.println("heujjjjj!!! goeie zoooi!!!!!");
        Registry.register(Registry.ITEM, new Identifier("keanumod", "trav"), TRAV);
    };
}
