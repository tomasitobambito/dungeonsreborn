package net.okense.dungeonsreborn.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.SpellcastingIllagerEntity;
import net.minecraft.entity.mob.VexEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.raid.RaiderEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class GeomancerEntity extends SpellcastingIllagerEntity {
    public GeomancerEntity(EntityType<? extends SpellcastingIllagerEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 10;
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(2, new FleeEntityGoal<PlayerEntity>(this, PlayerEntity.class, 8.0f, 0.6, 1.0));
//        this.goalSelector.add(5, new EvokerEntity.ConjureFangsGoal());
        this.goalSelector.add(8, new WanderAroundGoal(this, 0.6));
        this.goalSelector.add(9, new LookAtEntityGoal(this, PlayerEntity.class, 3.0f, 1.0f));
        this.goalSelector.add(10, new LookAtEntityGoal(this, MobEntity.class, 8.0f));
        this.targetSelector.add(1, new RevengeGoal(this, RaiderEntity.class).setGroupRevenge(new Class[0]));
        this.targetSelector.add(2, new ActiveTargetGoal<PlayerEntity>((MobEntity)this, PlayerEntity.class, true).setMaxTimeWithoutVisibility(300));
        this.targetSelector.add(3, new ActiveTargetGoal<MerchantEntity>((MobEntity)this, MerchantEntity.class, false).setMaxTimeWithoutVisibility(300));
        this.targetSelector.add(3, new ActiveTargetGoal<IronGolemEntity>((MobEntity)this, IronGolemEntity.class, false));
    }

    public static DefaultAttributeContainer.Builder createGeomancerAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 12.0)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 24.0);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
    }

    @Override
    public SoundEvent getCelebratingSound() {return SoundEvents.ENTITY_EVOKER_CELEBRATE;}

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
    }

    @Override
    protected void mobTick() {
        super.mobTick();
    }

    @Override
    public boolean isTeammate(Entity other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (super.isTeammate(other)) {
            return true;
        }
        if (other instanceof VexEntity) {
            VexEntity vexEntity = (VexEntity)other;
            return this.isTeammate(vexEntity.getOwner());
        }
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_EVOKER_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_EVOKER_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_EVOKER_HURT;
    }

    @Override
    protected SoundEvent getCastSpellSound() {
        return SoundEvents.ENTITY_EVOKER_CAST_SPELL;
    }

    @Override
    public void addBonusForWave(int wave, boolean unused) {
    }

//    class ConjureFangsGoal
//            extends SpellcastingIllagerEntity.CastSpellGoal {
//        ConjureFangsGoal() {
//            super(EvokerEntity.this);
//        }
//
//        @Override
//        protected int getSpellTicks() {
//            return 40;
//        }
//
//        @Override
//        protected int startTimeDelay() {
//            return 100;
//        }
//
//        @Override
//        protected void castSpell() {
//            LivingEntity livingEntity = EvokerEntity.this.getTarget();
//            double d = Math.min(livingEntity.getY(), EvokerEntity.this.getY());
//            double e = Math.max(livingEntity.getY(), EvokerEntity.this.getY()) + 1.0;
//            float f = (float) MathHelper.atan2(livingEntity.getZ() - EvokerEntity.this.getZ(), livingEntity.getX() - EvokerEntity.this.getX());
//            if (EvokerEntity.this.squaredDistanceTo(livingEntity) < 9.0) {
//                float g;
//                int i;
//                for (i = 0; i < 5; ++i) {
//                    g = f + (float)i * (float)Math.PI * 0.4f;
//                    this.conjureFangs(EvokerEntity.this.getX() + (double)MathHelper.cos(g) * 1.5, EvokerEntity.this.getZ() + (double)MathHelper.sin(g) * 1.5, d, e, g, 0);
//                }
//                for (i = 0; i < 8; ++i) {
//                    g = f + (float)i * (float)Math.PI * 2.0f / 8.0f + 1.2566371f;
//                    this.conjureFangs(EvokerEntity.this.getX() + (double)MathHelper.cos(g) * 2.5, EvokerEntity.this.getZ() + (double)MathHelper.sin(g) * 2.5, d, e, g, 3);
//                }
//            } else {
//                for (int i = 0; i < 16; ++i) {
//                    double h = 1.25 * (double)(i + 1);
//                    int j = 1 * i;
//                    this.conjureFangs(EvokerEntity.this.getX() + (double)MathHelper.cos(f) * h, EvokerEntity.this.getZ() + (double)MathHelper.sin(f) * h, d, e, f, j);
//                }
//            }
//        }
//
//        private void conjureFangs(double x, double z, double maxY, double y, float yaw, int warmup) {
//            BlockPos blockPos = BlockPos.ofFloored(x, y, z);
//            boolean bl = false;
//            double d = 0.0;
//            do {
//                BlockState blockState2;
//                VoxelShape voxelShape;
//                BlockPos blockPos2 = blockPos.down();
//                BlockState blockState = EvokerEntity.this.getWorld().getBlockState(blockPos2);
//                if (!blockState.isSideSolidFullSquare(EvokerEntity.this.getWorld(), blockPos2, Direction.UP)) continue;
//                if (!EvokerEntity.this.getWorld().isAir(blockPos) && !(voxelShape = (blockState2 = EvokerEntity.this.getWorld().getBlockState(blockPos)).getCollisionShape(EvokerEntity.this.getWorld(), blockPos)).isEmpty()) {
//                    d = voxelShape.getMax(Direction.Axis.Y);
//                }
//                bl = true;
//                break;
//            } while ((blockPos = blockPos.down()).getY() >= MathHelper.floor(maxY) - 1);
//            if (bl) {
//                EvokerEntity.this.getWorld().spawnEntity(new EvokerFangsEntity(EvokerEntity.this.getWorld(), x, (double)blockPos.getY() + d, z, yaw, warmup, EvokerEntity.this));
//                EvokerEntity.this.getWorld().emitGameEvent(GameEvent.ENTITY_PLACE, new Vec3d(x, (double)blockPos.getY() + d, z), GameEvent.Emitter.of(EvokerEntity.this));
//            }
//        }
//
//        @Override
//        protected SoundEvent getSoundPrepare() {
//            return SoundEvents.ENTITY_EVOKER_PREPARE_ATTACK;
//        }
//
//        @Override
//        protected SpellcastingIllagerEntity.Spell getSpell() {
//            return SpellcastingIllagerEntity.Spell.FANGS;
//        }
//    }
}
