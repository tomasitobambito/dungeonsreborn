package net.okense.dungeonsreborn.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.okense.dungeonsreborn.DungeonsReborn;
import net.okense.dungeonsreborn.entity.custom.GeomancerEntity;
import net.okense.dungeonsreborn.DungeonsReborn;
import net.okense.dungeonsreborn.entity.custom.GeomancerEntity;

public class ModEntities {
    public static final EntityType<GeomancerEntity> GEOMANCER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(DungeonsReborn.MOD_ID, "geomancer"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GeomancerEntity::new).dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build());
}
