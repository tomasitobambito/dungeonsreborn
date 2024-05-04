package net.okense.dungeonsreborn;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.okense.dungeonsreborn.entity.ModEntities;
import net.okense.dungeonsreborn.entity.client.GeomancerEntityModel;
import net.okense.dungeonsreborn.entity.client.GeomancerEntityRenderer;
import net.okense.dungeonsreborn.entity.client.ModModelLayers;

public class DungeonsRebornClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GEOMANCER, GeomancerEntityModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.GEOMANCER, GeomancerEntityRenderer::new);
    }
}
