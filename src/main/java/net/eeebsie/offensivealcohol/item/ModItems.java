package net.eeebsie.offensivealcohol.item;

import net.eeebsie.offensivealcohol.OffensiveAlcohol;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
       public static final Item  COCKTAIL_UMBRELLA = registerItem("cocktail_umbrella", new Item(new FabricItemSettings()));
       public static final Item  NETHERITE_ANCHORBLADE = registerItem("netherite_anchorblade", new Item(new FabricItemSettings()));

       private static void addItemsToIngredients(FabricItemGroupEntries entries) {
             entries.add(COCKTAIL_UMBRELLA);
              entries.add(NETHERITE_ANCHORBLADE);
       }

       private static Item registerItem(String name, Item item) {
              return Registry.register(Registries.ITEM, new Identifier(OffensiveAlcohol.MOD_ID, name), item);
       }

       public static void RegisterModItems() {
              OffensiveAlcohol.LOGGER.info("Registering Mod Items for " + OffensiveAlcohol.MOD_ID);

              ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredients);
       }
}
