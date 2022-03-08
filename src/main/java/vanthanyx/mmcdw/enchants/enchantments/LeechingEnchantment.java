package vanthanyx.mmcdw.enchants.enchantments;

import vanthanyx.mmcdw.Mcdw;
import vanthanyx.mmcdw.bases.McdwCustomWeaponBase;
import vanthanyx.mmcdw.enums.EnchantmentsID;
import vanthanyx.mmcdw.enums.SettingsID;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.registry.Registry;
import vanthanyx.mmcdw.enchants.types.HealingEnchantment;

public class LeechingEnchantment extends HealingEnchantment {

    public LeechingEnchantment(Enchantment.Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        if (Mcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.LEECHING)) {
            Registry.register(Registry.ENCHANTMENT, Mcdw.ID("leeching"), this);
        }
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return Mcdw.CONFIG.mcdwEnchantmentSettingsConfig.enableEnchantmentSettings
                .get(SettingsID.LEECHING_CAN_BE_MIXED_WITH_HEALING)
                || !(other instanceof HealingEnchantment);
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return Mcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.LEECHING);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof SwordItem || stack.getItem() instanceof AxeItem
                || stack.getItem() instanceof McdwCustomWeaponBase;
    }

    @Override
    public int getMinPower(int level) {
        return 1 + level * 10;
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level) + 5;
    }
}