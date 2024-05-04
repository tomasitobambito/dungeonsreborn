package net.okense.dungeonsreborn.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.okense.dungeonsreborn.DungeonsReborn;
import net.okense.dungeonsreborn.block.ModBlocks;

public class ModItemsGroups {

    public static final ItemGroup DUNGEONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DungeonsReborn.MOD_ID, "dungeons"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dungeons"))
                    .icon(() -> new ItemStack(ModBlocks.DIAMOND_DUST_BAG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DIAMOND_DUST);
                        entries.add(ModBlocks.DIAMOND_DUST_BAG);

                        entries.add(ModItems.GEOMANCER_SPAWN_EGG);

                        entries.add(ModBlocks.PUMPKIN_PASTURES_STONE_BRICKS);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CRACKED_STONE_BRICKS);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_MUDDY_STONE_BRICKS);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE);

                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_A);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_B);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_C);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_D);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_E);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_F);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_G);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_H);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_I);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_J);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_K);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_L);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_M);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_N);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_O);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_P);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Q);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_R);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_S);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_T);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_U);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_V);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_W);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_X);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Y);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_Z);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_0);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_1);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_2);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_3);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_4);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_5);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_6);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_7);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_8);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_9);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_EXC);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_INT);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_DOT);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_COM);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT1);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT2);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT3);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT4);
                        entries.add(ModBlocks.PUMPKIN_PASTURES_CHISELED_STONE_RUNE_ALT5);
                    }).build());

    public static void registerItemGroups() {
        DungeonsReborn.LOGGER.info("Registering Item Groups for " + DungeonsReborn.MOD_ID);
    }
}
