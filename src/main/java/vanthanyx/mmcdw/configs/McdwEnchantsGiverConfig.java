
package vanthanyx.mmcdw.configs;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vanthanyx.mmcdw.Mmcdw;
import vanthanyx.mmcdw.enums.*;
import vanthanyx.mmcdw.items.ItemsInit;
import wraith.enchant_giver.EnchantsList;

public class McdwEnchantsGiverConfig {
        public static void appendEnchants() {

                if (Mmcdw.CONFIG.mcdwEnchantmentSettingsConfig.enableEnchantmentSettings
                                .get(SettingsID.ENABLE_INNATE_ENCHANTMENTS)) {
                        // AMBUSH ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.daggerItems.get(DaggersID.DAGGER_BACKSTABBER)),
                                        new Identifier("mcdw:ambush"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.daggerItems.get(DaggersID.DAGGER_SWIFT_STRIKER)),
                                        new Identifier("mcdw:ambush"), 1, false);

                        // CHAINS ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.scytheItems.get(ScythesID.SICKLE_JAILORS_SCYTHE)),
                                        new Identifier("mcdw:chains"), 1, true);

                        // COMMITTED ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(
                                                        ItemsInit.soulDaggerItems.get(SoulDaggersID.SWORD_TRUTHSEEKER)),
                                        new Identifier("mcdw:committed"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.staffItems.get(StavesID.STAFF_GROWING_STAFF)),
                                        new Identifier("mcdw:committed"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.daggerItems
                                                        .get(DaggersID.DAGGER_RESOLUTE_TEMPEST_KNIFE)),
                                        new Identifier("mcdw:committed"), 1, false);

                        // CRITICAL HIT ENCHANTMENT
                        EnchantsList.addEnchant(Registry.ITEM.getId(ItemsInit.swordItems.get(SwordsID.SWORD_HAWKBRAND)),
                                        new Identifier("mcdw:critical_hit"), 1, true);
                        EnchantsList.addEnchant(Registry.ITEM.getId(ItemsInit.swordItems.get(SwordsID.SWORD_SINISTER)),
                                        new Identifier("mcdw:critical_hit"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.swordItems.get(SwordsID.SWORD_MASTERS_KATANA)),
                                        new Identifier("mcdw:critical_hit"), 1, true);

                        // ECHO ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.spearItems.get(SpearsID.SPEAR_WHISPERING_SPEAR)),
                                        new Identifier("mcdw:echo"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.daggerItems.get(DaggersID.DAGGER_SWIFT_STRIKER)),
                                        new Identifier("mcdw:echo"), 1, false);

                        // ENIGMA RESONATOR ENCHANTMENT
                        EnchantsList.addEnchant(Registry.ITEM.getId(ItemsInit.daggerItems.get(DaggersID.DAGGER_MOON)),
                                        new Identifier("mcdw:enigma_resonator"), 1, true);

                        // EXPLODING ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.doubleAxeItems.get(DoubleAxesID.AXE_CURSED)),
                                        new Identifier("mcdw:exploding"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(
                                                        ItemsInit.staffItems.get(StavesID.STAFF_BATTLESTAFF_OF_TERROR)),
                                        new Identifier("mcdw:exploding"), 1, true);

                        // FIRE ASPECT ENCHANTMENT
                        EnchantsList.addEnchant(Registry.ITEM.getId(ItemsInit.axeItems.get(AxesID.AXE_FIREBRAND)),
                                        new Identifier("minecraft:fire_aspect"), 1, true);

                        // FREEZING ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.daggerItems.get(DaggersID.DAGGER_FANGS_OF_FROST)),
                                        new Identifier("mcdw:freezing"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.scytheItems.get(ScythesID.SICKLE_FROST_SCYTHE)),
                                        new Identifier("mcdw:freezing"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.swordItems.get(SwordsID.SWORD_FREEZING_FOIL)),
                                        new Identifier("mcdw:freezing"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(
                                                        ItemsInit.daggerItems.get(DaggersID.DAGGER_CHILL_GALE_KNIFE)),
                                        new Identifier("mcdw:freezing"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.swordItems.get(SwordsID.SWORD_FROST_SLAYER)),
                                        new Identifier("mcdw:freezing"), 1, true);
                        // TODO CHANGE ENCHANTMENT OUT WITH MAYBE SHARPNESS?
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.scytheItems.get(ScythesID.SICKLE_SKULL_SCYTHE)),
                                        new Identifier("mcdw:freezing"), 1, true);

                        // GRAVITY ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.axeItems.get(AxesID.AXE_ENCRUSTED_ANCHOR)),
                                        new Identifier("mcdw:gravity"), 1, true);

                        // JUNGLE'S POISON ENCHANTMENT
                        EnchantsList.addEnchant(Registry.ITEM.getId(ItemsInit.whipItems.get(WhipsID.WHIP_VINE_WHIP)),
                                        new Identifier("mcdw:jungle_poison"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.axeItems.get(AxesID.AXE_ENCRUSTED_ANCHOR)),
                                        new Identifier("mcdw:jungle_poison"), 1, false);

                        // LEECHING ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.swordItems.get(SwordsID.SWORD_HEARTSTEALER)),
                                        new Identifier("mcdw:leeching"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.daggerItems.get(DaggersID.DAGGER_THE_BEGINNING)),
                                        new Identifier("mcdw:leeching"), 1, true);

                        // LOOTING ENCHANTMENT
                        EnchantsList.addEnchant(Registry.ITEM.getId(ItemsInit.spearItems.get(SpearsID.SPEAR_FORTUNE)),
                                        new Identifier("minecraft:looting"), 1, true);

                        // POISON CLOUD ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(
                                                        ItemsInit.sickleItems.get(SicklesID.SICKLE_NIGHTMARES_BITE)),
                                        new Identifier("mcdw:poison_cloud"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.glaiveItems.get(GlaivesID.SPEAR_VENOM_GLAIVE)),
                                        new Identifier("mcdw:poison_cloud"), 1, true);

                        // PROSPECTOR ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(
                                                        ItemsInit.sickleItems.get(SicklesID.SICKLE_LAST_LAUGH_GOLD)),
                                        new Identifier("mcdw:prospector"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(
                                                        ItemsInit.sickleItems.get(SicklesID.SICKLE_LAST_LAUGH_SILVER)),
                                        new Identifier("mcdw:prospector"), 1, true);

                        // RAMPAGING ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.swordItems.get(SwordsID.SWORD_DANCERS_SWORD)),
                                        new Identifier("mcdw:rampaging"), 1, true);

                        // RUSHDOWN ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.daggerItems
                                                        .get(DaggersID.DAGGER_RESOLUTE_TEMPEST_KNIFE)),
                                        new Identifier("mcdw:rushdown"), 1, false);

                        // SHOCKWAVE ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.doubleAxeItems.get(DoubleAxesID.AXE_WHIRLWIND)),
                                        new Identifier("mcdw:shockwave"), 1, true);

                        // SMITING ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.glaiveItems.get(GlaivesID.SPEAR_GRAVE_BANE)),
                                        new Identifier("mcdw:smiting"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.swordItems.get(SwordsID.SWORD_DARK_KATANA)),
                                        new Identifier("mcdw:smiting"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.glaiveItems.get(GlaivesID.SPEAR_CACKLING_BROOM)),
                                        new Identifier("mcdw:smiting"), 1, true);

                        // SOUL DEVOURER ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.scytheItems.get(ScythesID.SICKLE_SOUL_SCYTHE)),
                                        new Identifier("mcdw:soul_devourer"), 1, true);

                        // SOUL SIPHON ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.soulDaggerItems
                                                        .get(SoulDaggersID.DAGGER_ETERNAL_KNIFE)),
                                        new Identifier("mcdw:soul_siphon"), 1, true);

                        // STUNNING ENCHANTMENT
                        EnchantsList.addEnchant(Registry.ITEM.getId(ItemsInit.axeItems.get(AxesID.AXE_HIGHLAND)),
                                        new Identifier("mcdw:stunning"), 1, true);

                        // SWIRLING ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.daggerItems.get(DaggersID.DAGGER_SHEAR_DAGGER)),
                                        new Identifier("mcdw:swirling"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.swordItems.get(SwordsID.SWORD_BROADSWORD)),
                                        new Identifier("mcdw:swirling"), 1, true);

                        /*
                         * // THUNDERING ENCHANTMENT
                         * EnchantsList.addEnchant(
                         * Registry.ITEM.getId(ItemsInit.hammerItems.get(HammersID.HAMMER_STORMLANDER)),
                         * new Identifier("mcdw:thundering"), 1, true);
                         */

                        // VOID STRIKE ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(
                                                        ItemsInit.daggerItems.get(DaggersID.DAGGER_VOID_TOUCHED_BLADE)),
                                        new Identifier("mcdw:void_strike"), 1, true);
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.daggerItems.get(DaggersID.DAGGER_THE_END)),
                                        new Identifier("mcdw:void_strike"), 1, true);

                        // WEAKENING ENCHANTMENT
                        EnchantsList.addEnchant(
                                        Registry.ITEM.getId(ItemsInit.swordItems.get(SwordsID.SWORD_NAMELESS_BLADE)),
                                        new Identifier("mcdw:weakening"), 1, true);
                }
        }
}
