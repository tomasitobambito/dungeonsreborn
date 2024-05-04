package net.okense.dungeonsreborn.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.okense.dungeonsreborn.DungeonsReborn;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DungeonsReborn.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DungeonsReborn.LOGGER.info("Registering Mod Items for " + DungeonsReborn.MOD_ID);
    }
}
