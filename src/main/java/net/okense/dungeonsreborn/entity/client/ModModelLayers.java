package net.okense.dungeonsreborn.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.okense.dungeonsreborn.DungeonsReborn;

public class ModModelLayers {
    public static final EntityModelLayer GEOMANCER =
            new EntityModelLayer(new Identifier(DungeonsReborn.MOD_ID, "geomancer"),"main");
}
