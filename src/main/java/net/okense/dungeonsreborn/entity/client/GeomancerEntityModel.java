// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.okense.dungeonsreborn.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.CrossbowPosing;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.IllagerEntity;
import net.minecraft.util.Arm;
import net.minecraft.util.math.MathHelper;
import net.okense.dungeonsreborn.entity.custom.GeomancerEntity;

public class GeomancerEntityModel<T extends GeomancerEntity>
		extends SinglePartEntityModel<T> {

	private final ModelPart geomancer;
	private final ModelPart head;
	private final ModelPart rightArm;
	private final ModelPart leftArm;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;

	//	private final ModelPart waist;
//	private final ModelPart nose;
//	private final ModelPart eyebrows;
//	private final ModelPart Body;
//	private final ModelPart necklace;
//	private final ModelPart pearl_r1;
//	private final ModelPart pearl_r2;
//	private final ModelPart RightArm_r1;
//	private final ModelPart Cane;

	public GeomancerEntityModel(ModelPart root) {
		this.geomancer = root.getChild("geomancer");
		this.head = root.getChild("geomancer").getChild("waist").getChild("head");
		this.leftLeg = root.getChild("geomancer").getChild("LeftLeg");
		this.rightLeg = root.getChild("geomancer").getChild("RightLeg");
		this.leftArm = root.getChild("geomancer").getChild("waist").getChild("LeftArm");
		this.rightArm = root.getChild("geomancer").getChild("waist").getChild("RightArm");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData geomancer = modelPartData.addChild("geomancer", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData waist = geomancer.addChild("waist", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

		ModelPartData head = waist.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -9.7389F, -3.9829F, 8.0F, 10.0F, 8.0F, new Dilation(0.0F))
				.uv(32, 0).cuboid(-3.0F, -1.7389F, -4.9829F, 6.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

		ModelPartData nose = head.addChild("nose", ModelPartBuilder.create().uv(24, 0).cuboid(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.7389F, 0.0171F));

		ModelPartData eyebrows = head.addChild("eyebrows", ModelPartBuilder.create().uv(4, 20).cuboid(-4.0F, -5.0F, -5.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(4, 20).cuboid(1.0F, -5.0F, -5.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(4, 20).cuboid(-4.0F, -6.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(4, 20).cuboid(2.0F, -6.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.2611F, 0.0171F));

		ModelPartData Body = waist.addChild("Body", ModelPartBuilder.create().uv(16, 20).cuboid(-4.0F, -12.0F, -3.0F, 8.0F, 12.0F, 6.0F, new Dilation(0.0F))
				.uv(0, 38).cuboid(-4.0F, -12.0F, -3.0F, 8.0F, 18.0F, 6.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData necklace = Body.addChild("necklace", ModelPartBuilder.create().uv(0, 0).cuboid(4.0F, -26.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-6.0F, -26.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

		ModelPartData pearl_r1 = necklace.addChild("pearl_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(1.0F, 1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(4.0F, 2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(7.0F, 1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(9.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -24.0F, -2.0F, 0.2182F, 0.0F, 0.0F));

		ModelPartData pearl_r2 = necklace.addChild("pearl_r2", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(4.0F, -1.0F, 5.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(8.0F, -2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -24.0F, -2.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData RightArm = waist.addChild("RightArm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, -10.0F, 0.0F));

		ModelPartData RightArm_r1 = RightArm.addChild("RightArm_r1", ModelPartBuilder.create().uv(40, 46).cuboid(-8.0F, -2.0F, -24.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 22.0F, -1.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData Cane = RightArm.addChild("Cane", ModelPartBuilder.create().uv(60, 11).cuboid(-0.5F, -9.0F, -0.5F, 1.0F, 30.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 1.0F, -10.0F));

		ModelPartData LeftArm = waist.addChild("LeftArm", ModelPartBuilder.create().uv(40, 46).mirrored().cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.0F, -10.0F, 0.0F));

		ModelPartData LeftLeg = geomancer.addChild("LeftLeg", ModelPartBuilder.create().uv(0, 22).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -12.0F, 0.0F));

		ModelPartData RightLeg = geomancer.addChild("RightLeg", ModelPartBuilder.create().uv(0, 22).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-2.0F, -12.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public ModelPart getPart() {
		return this.geomancer;
	}

	@Override
	public void setAngles(T illagerEntity, float f, float g, float h, float i, float j) {
		boolean bl;
		this.head.yaw = i * ((float)Math.PI / 180);
		this.head.pitch = j * ((float)Math.PI / 180);
		if (this.riding) {
			this.rightArm.pitch = -0.62831855f;
			this.rightArm.yaw = 0.0f;
			this.rightArm.roll = 0.0f;
			this.leftArm.pitch = -0.62831855f;
			this.leftArm.yaw = 0.0f;
			this.leftArm.roll = 0.0f;
			this.rightLeg.pitch = -1.4137167f;
			this.rightLeg.yaw = 0.31415927f;
			this.rightLeg.roll = 0.07853982f;
			this.leftLeg.pitch = -1.4137167f;
			this.leftLeg.yaw = -0.31415927f;
			this.leftLeg.roll = -0.07853982f;
		} else {
			this.rightArm.pitch = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.0f * g * 0.5f;//
			this.rightArm.yaw = 0.0f;
			this.rightArm.roll = 0.0f;
			this.leftArm.pitch = MathHelper.cos(f * 0.6662f) * 1.0f * g * 0.5f;//
			this.leftArm.yaw = 0.0f;
			this.leftArm.roll = 0.0f;
			this.rightLeg.pitch = MathHelper.cos(f * 0.6662f) * 1.4f * g * 0.5f;
			this.rightLeg.yaw = 0.0f;
			this.rightLeg.roll = 0.0f;
			this.leftLeg.pitch = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * g * 0.5f;
			this.leftLeg.yaw = 0.0f;
			this.leftLeg.roll = 0.0f;
		}
		IllagerEntity.State state = ((IllagerEntity)illagerEntity).getState();
		if (state == IllagerEntity.State.ATTACKING) {
			if (((LivingEntity)illagerEntity).getMainHandStack().isEmpty()) {
				CrossbowPosing.meleeAttack(this.leftArm, this.rightArm, true, this.handSwingProgress, h);
			} else {
				CrossbowPosing.meleeAttack(this.rightArm, this.leftArm, illagerEntity, this.handSwingProgress, h);
			}
		} else if (state == IllagerEntity.State.SPELLCASTING) {
			this.rightArm.pivotZ = 0.0f;
			this.rightArm.pivotX = -5.0f;
			this.leftArm.pivotZ = 0.0f;
			this.leftArm.pivotX = 5.0f;
			this.rightArm.pitch = MathHelper.cos(h * 0.6662f) * 0.25f;
			this.leftArm.pitch = MathHelper.cos(h * 0.6662f) * 0.25f;
			this.rightArm.roll = 2.3561945f;
			this.leftArm.roll = -2.3561945f;
			this.rightArm.yaw = 0.0f;
			this.leftArm.yaw = 0.0f;
		} else if (state == IllagerEntity.State.CELEBRATING) {
			this.rightArm.pivotZ = 0.0f;
			this.rightArm.pivotX = -5.0f;
			this.rightArm.pitch = MathHelper.cos(h * 0.6662f) * 0.05f;
			this.rightArm.roll = 2.670354f;
			this.rightArm.yaw = 0.0f;
			this.leftArm.pivotZ = 0.0f;
			this.leftArm.pivotX = 5.0f;
			this.leftArm.pitch = MathHelper.cos(h * 0.6662f) * 0.05f;
			this.leftArm.roll = -2.3561945f;
			this.leftArm.yaw = 0.0f;
		}
	}

	private ModelPart getAttackingArm(Arm arm) {
		return this.rightArm;
	}

//	@Override
//	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
//		geomancer.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//	}
}