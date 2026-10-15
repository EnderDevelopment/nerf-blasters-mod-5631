package com.pokemongo2016coc.nerfblastersmod.registry;

import com.pokemongo2016coc.nerfblastersmod.NerfBlastersMod;
import com.pokemongo2016coc.nerfblastersmod.item.NerfBlasterItem;
import com.pokemongo2016coc.nerfblastersmod.item.NerfDartItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item NERF_BLASTER = new NerfBlasterItem();
    public static final Item NERF_DART = new NerfDartItem();

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(NerfBlastersMod.MOD_ID, "nerf_blaster"), NERF_BLASTER);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(NerfBlastersMod.MOD_ID, "nerf_dart"), NERF_DART);
    }
}