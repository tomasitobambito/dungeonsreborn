package net.okense.dungeonsreborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;
import net.okense.dungeonsreborn.block.ModBlocks;
import net.okense.dungeonsreborn.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DIAMOND_DUST_BAG, dropsWithSilkTouchOrShears(ModBlocks.DIAMOND_DUST_BAG,
                (LootPoolEntry.Builder)this.applyExplosionDecay(ModBlocks.DIAMOND_DUST_BAG,
                        ((LeafEntry.Builder) ItemEntry.builder(ModItems.DIAMOND_DUST)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(9.0f)))))));

        addDrop(ModBlocks.PUMPKIN_PASTURES_STONE_BRICKS);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CRACKED_STONE_BRICKS);
        addDrop(ModBlocks.PUMPKIN_PASTURES_MUDDY_STONE_BRICKS);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE);

        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_A);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_B);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_C);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_D);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_E);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_F);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_G);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_H);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_I);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_J);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_K);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_L);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_M);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_N);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_O);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_P);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Q);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_R);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_S);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_T);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_U);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_V);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_W);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_X);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Y);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Z);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_0);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_1);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_2);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_3);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_4);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_5);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_6);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_7);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_8);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_9);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_EXC);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_INT);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_DOT);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_COM);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT1);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT2);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT3);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT4);
        addDrop(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT5);
    }
}
