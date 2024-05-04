package net.okense.dungeonsreborn.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.okense.dungeonsreborn.DungeonsReborn;

public class ModBlocks {

    public static final Block DIAMOND_DUST_BAG = registerBlock("diamond_dust_bag",
            new DiamondDustBagBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)));

    public static final Block PUMPKIN_PASTURES_STONE_BRICKS = registerBlock("pumpkin_pastures_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CRACKED_STONE_BRICKS = registerBlock("pumpkin_pastures_cracked_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_MUDDY_STONE_BRICKS = registerBlock("pumpkin_pastures_muddy_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE = registerBlock("pumpkin_pastures_chiseled_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));

    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_A = registerBlock("pumpkin_pastures_chiseled_stone_rune_a",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_B = registerBlock("pumpkin_pastures_chiseled_stone_rune_b",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_C = registerBlock("pumpkin_pastures_chiseled_stone_rune_c",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_D = registerBlock("pumpkin_pastures_chiseled_stone_rune_d",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_E = registerBlock("pumpkin_pastures_chiseled_stone_rune_e",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_F = registerBlock("pumpkin_pastures_chiseled_stone_rune_f",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_G = registerBlock("pumpkin_pastures_chiseled_stone_rune_g",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_H = registerBlock("pumpkin_pastures_chiseled_stone_rune_h",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_I = registerBlock("pumpkin_pastures_chiseled_stone_rune_i",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_J = registerBlock("pumpkin_pastures_chiseled_stone_rune_j",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_K = registerBlock("pumpkin_pastures_chiseled_stone_rune_k",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_L = registerBlock("pumpkin_pastures_chiseled_stone_rune_l",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_M = registerBlock("pumpkin_pastures_chiseled_stone_rune_m",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_N = registerBlock("pumpkin_pastures_chiseled_stone_rune_n",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_O = registerBlock("pumpkin_pastures_chiseled_stone_rune_o",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_P = registerBlock("pumpkin_pastures_chiseled_stone_rune_p",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Q = registerBlock("pumpkin_pastures_chiseled_stone_rune_q",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_R = registerBlock("pumpkin_pastures_chiseled_stone_rune_r",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_S = registerBlock("pumpkin_pastures_chiseled_stone_rune_s",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_T = registerBlock("pumpkin_pastures_chiseled_stone_rune_t",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_U = registerBlock("pumpkin_pastures_chiseled_stone_rune_u",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_V = registerBlock("pumpkin_pastures_chiseled_stone_rune_v",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_W = registerBlock("pumpkin_pastures_chiseled_stone_rune_w",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_X = registerBlock("pumpkin_pastures_chiseled_stone_rune_x",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Y = registerBlock("pumpkin_pastures_chiseled_stone_rune_y",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Z = registerBlock("pumpkin_pastures_chiseled_stone_rune_z",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_0 = registerBlock("pumpkin_pastures_chiseled_stone_rune_0",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_1 = registerBlock("pumpkin_pastures_chiseled_stone_rune_1",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_2 = registerBlock("pumpkin_pastures_chiseled_stone_rune_2",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_3 = registerBlock("pumpkin_pastures_chiseled_stone_rune_3",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_4 = registerBlock("pumpkin_pastures_chiseled_stone_rune_4",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_5 = registerBlock("pumpkin_pastures_chiseled_stone_rune_5",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_6 = registerBlock("pumpkin_pastures_chiseled_stone_rune_6",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_7 = registerBlock("pumpkin_pastures_chiseled_stone_rune_7",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_8 = registerBlock("pumpkin_pastures_chiseled_stone_rune_8",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_9 = registerBlock("pumpkin_pastures_chiseled_stone_rune_9",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_EXC = registerBlock("pumpkin_pastures_chiseled_stone_rune_exc",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_INT = registerBlock("pumpkin_pastures_chiseled_stone_rune_int",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_DOT = registerBlock("pumpkin_pastures_chiseled_stone_rune_dot",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_COM = registerBlock("pumpkin_pastures_chiseled_stone_rune_com",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT1 = registerBlock("pumpkin_pastures_chiseled_stone_rune_alt1",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT2 = registerBlock("pumpkin_pastures_chiseled_stone_rune_alt2",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT3 = registerBlock("pumpkin_pastures_chiseled_stone_rune_alt3",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT4 = registerBlock("pumpkin_pastures_chiseled_stone_rune_alt4",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT5 = registerBlock("pumpkin_pastures_chiseled_stone_rune_alt5",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DungeonsReborn.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(DungeonsReborn.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        DungeonsReborn.LOGGER.info("Registering Mod Blocks for " + DungeonsReborn.MOD_ID);
    }
}
