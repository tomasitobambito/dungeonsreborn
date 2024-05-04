package net.okense.dungeonsreborn.entity.client;

import net.minecraft.client.model.Model;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.okense.dungeonsreborn.DungeonsReborn;
import net.okense.dungeonsreborn.entity.custom.GeomancerEntity;

public class GeomancerPearlsFeatureRenderer<T extends GeomancerEntity>
        extends EyesFeatureRenderer<T, GeomancerEntityModel<T>> {
    private static final RenderLayer SKIN = RenderLayer.getEyes(new Identifier(TutorialMod.MOD_ID,"textures/entity/geomancer_neck.png"));

    public GeomancerPearlsFeatureRenderer(FeatureRendererContext<T, GeomancerEntityModel<T>> featureRendererContext) {
        super(featureRendererContext);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, T entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(this.getEyesTexture());
        ((Model)this.getContextModel()).render(matrices, vertexConsumer, 0xF00000, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public RenderLayer getEyesTexture() {
        return SKIN;
    }
}