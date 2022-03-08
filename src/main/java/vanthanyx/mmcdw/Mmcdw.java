package vanthanyx.mmcdw;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import vanthanyx.mmcdw.configs.McdwConfig;
import vanthanyx.mmcdw.configs.McdwEnchantsGiverConfig;
import vanthanyx.mmcdw.enchants.EnchantsRegistry;
import vanthanyx.mmcdw.enchants.summons.registry.SummonedEntityRegistry;
import vanthanyx.mmcdw.enums.ShieldsID;
import vanthanyx.mmcdw.enums.SwordsID;
import vanthanyx.mmcdw.items.ItemsInit;

public class Mmcdw implements ModInitializer {

        public static final String MOD_ID = "mcdw";

        public static Identifier ID(String path) {
                return new Identifier(MOD_ID, path);
        }

        public static final ItemGroup WEAPONS = FabricItemGroupBuilder.build(
                        Mmcdw.ID("weapons"),
                        () -> new ItemStack(ItemsInit.swordItems.get(SwordsID.SWORD_HEARTSTEALER)));
        public static final ItemGroup SHIELDS = FabricItemGroupBuilder.build(
                        Mmcdw.ID("weapons/shields"),
                        () -> new ItemStack(ItemsInit.shieldItems.get(ShieldsID.SHIELD_ROYAL_GUARD)));
        public static final ItemGroup ENCHANTMENTS = FabricItemGroupBuilder.create(
                        Mmcdw.ID("enchants"))
                        .icon(() -> new ItemStack(Items.ENCHANTED_BOOK))
                        .appendItems(itemStacks -> {
                                // For loop creates first 3 levels of enchanted books
                                for (int i = 1; i <= 3; i++) {
                                        // for (EnchantsRegistry enchant: )
                                        // itemStacks.add(EnchantedBookItem.forEnchantment(new
                                        // EnchantmentLevelEntry(RangedEnchantsRegistry.ACCELERATE,1)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.AMBUSH, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.ANIMA_CONDUIT, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.BONUS_SHOT, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.CHAIN_REACTION, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.CHAINS, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.CHARGE, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.COMMITTED, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.CRITICAL_HIT, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.DIPPING_POISON, i)));
                                        itemStacks
                                                        .add(EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.ECHO, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.ENIGMA_RESONATOR, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.EXPLODING, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.FREEZING, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.FUSE_SHOT, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.GRAVITY, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.GROWING, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.GUARDING_STRIKE, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.JUNGLE_POISON, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.LEECHING, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.LEVITATION_SHOT, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.POISON_CLOUD, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.RADIANCE, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.RAMPAGING, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.REFRESHMENT, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.REPLENISH, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.RICOCHET, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.SHOCKWAVE, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.SMITING, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.SOUL_SIPHON, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.SOUL_DEVOURER, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.STUNNING, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.SWIRLING, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.TEMPO_THEFT, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.THUNDERING, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.VOID_SHOT, i)));
                                        itemStacks.add(EnchantedBookItem
                                                        .forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.VOID_STRIKE, i)));
                                        itemStacks.add(
                                                        EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(
                                                                        EnchantsRegistry.WEAKENING, i)));
                                }
                                // Add individual levels of enchanted books
                        })
                        .build();

        public static McdwConfig CONFIG;

        @Override
        public void onInitialize() {
                McdwConfig.init();
                CONFIG = AutoConfig.getConfigHolder(McdwConfig.class).getConfig();

                ItemsInit.init();

                // Enchants
                EnchantsRegistry.init();

                // EnchantGiver
                McdwEnchantsGiverConfig.appendEnchants();

                SummonedEntityRegistry.register();
        }
}