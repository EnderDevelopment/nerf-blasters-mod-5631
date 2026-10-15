package com.pokemongo2016coc.nerfblastersmod.registry;

import com.pokemongo2016coc.nerfblastersmod.NerfBlastersMod;
import com.pokemongo2016coc.nerfblastersmod.entity.NerfDartEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntities {
    public static final EntityType<NerfDartEntity> NERF_DART = EntityType.Builder.<NerfDartEntity>of(NerfDartEntity::new, MobCategory.MISC)
            .sized(0.25f, 0.25f)
            .build("nerf_dart");

    public static void register() {
        Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(NerfBlastersMod.MOD_ID, "nerf_dart"), NERF_DART);
    }
}