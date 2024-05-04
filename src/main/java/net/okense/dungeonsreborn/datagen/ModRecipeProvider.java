package net.okense.dungeonsreborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.okense.dungeonsreborn.item.ModItems;
import net.okense.dungeonsreborn.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerShapelessRecipe(exporter, ModItems.DIAMOND_DUST, Items.DIAMOND, "diamond", 4);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, Items.DIAMOND, ModItems.DIAMOND_DUST);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DIAMOND_DUST_BAG, ModItems.DIAMOND_DUST);
    }
}
