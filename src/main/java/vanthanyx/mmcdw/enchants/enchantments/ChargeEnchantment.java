package vanthanyx.mmcdw.enchants.enchantments;

import vanthanyx.mmcdw.Mcdw;
import vanthanyx.mmcdw.enums.EnchantmentsID;
import vanthanyx.mmcdw.enums.SettingsID;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;
import vanthanyx.mmcdw.enchants.types.RangedEnchantment;

public class ChargeEnchantment extends RangedEnchantment {

    public ChargeEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        if (Mcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.CHARGE)) {
            Registry.register(Registry.ENCHANTMENT, Mcdw.ID("charge"), this);
        }
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return Mcdw.CONFIG.mcdwEnchantmentSettingsConfig.enableEnchantmentSettings
                .get(SettingsID.ENABLE_OP_ENCHANTMENT_MIXING)
                || !(other instanceof TempoTheftEnchantment);
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return Mcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.CHARGE);
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
