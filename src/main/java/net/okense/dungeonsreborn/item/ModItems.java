package net.okense.dungeonsreborn.item;

import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.okense.dungeonsreborn.DungeonsReborn;
import net.okense.dungeonsreborn.entity.ModEntities;

public class ModItems {

    public static final Item DIAMOND_DUST = registerItem("diamond_dust", new Item(new Item.Settings()));
    public static final Item GEOMANCER_SPAWN_EGG = registerItem("geomancer_spawn_egg",
            new SpawnEggItem(ModEntities.GEOMANCER, 0x959b9b, 0xad88c1, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DungeonsReborn.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DungeonsReborn.LOGGER.info("Registering Mod Items for " + DungeonsReborn.MOD_ID);
    }
}
