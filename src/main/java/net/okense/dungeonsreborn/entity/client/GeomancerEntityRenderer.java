package net.okense.dungeonsreborn.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.okense.dungeonsreborn.DungeonsReborn;
import net.okense.dungeonsreborn.DungeonsReborn;
import net.okense.dungeonsreborn.entity.custom.GeomancerEntity;

public class GeomancerEntityRenderer extends MobEntityRenderer<GeomancerEntity, GeomancerEntityModel<GeomancerEntity>> {
    private static final Identifier TEXTURE = new Identifier(DungeonsReborn.MOD_ID, "textures/entity/geomancer.png");

    public GeomancerEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GeomancerEntityModel<>(context.getPart(ModModelLayers.GEOMANCER)), 0.5f);
        //this.addFeature(new GeomancerPearlsFeatureRenderer<>(this));
    }

    @Override
    protected void scale(GeomancerEntity geomancerEntity, MatrixStack matrixStack, float f) {
        float g = 0.9375f;
        matrixStack.scale(0.9375f, 0.9375f, 0.9375f);
    }

    @Override
    public Identifier getTexture(GeomancerEntity entity) {
        return TEXTURE;
    }

}
