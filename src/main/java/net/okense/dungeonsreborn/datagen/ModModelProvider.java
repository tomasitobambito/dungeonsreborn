package net.okense.dungeonsreborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.okense.dungeonsreborn.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PUMPKIN_PASTURES_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PUMPKIN_PASTURES_CRACKED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PUMPKIN_PASTURES_MUDDY_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE);

        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_A,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_B,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_C,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_D,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_E,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_F,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_G,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_H,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_I,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_J,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_K,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_L,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_M,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_N,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_O,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_P,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Q,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_R,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_S,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_T,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_U,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_V,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_W,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_X,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Y,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Z,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_0,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_1,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_2,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_3,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_4,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_5,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_6,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_7,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_8,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_9,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_EXC,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_INT,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_DOT,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_COM,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT1,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT2,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT3,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT4,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
        blockStateModelGenerator.registerCubeWithCustomTextures(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT5,
                ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE,
                ModModelProvider::customBookshelf);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    private static TextureMap customBookshelf(Block side, Block end) {
        return new TextureMap()
                .put(TextureKey.PARTICLE, TextureMap.getId(end))
                .put(TextureKey.UP, TextureMap.getId(end))
                .put(TextureKey.DOWN, TextureMap.getId(end))
                .put(TextureKey.SIDE, TextureMap.getId(side));
    }
}
