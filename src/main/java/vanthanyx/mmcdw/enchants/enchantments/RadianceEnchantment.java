package vanthanyx.mmcdw.enchants.enchantments;

import vanthanyx.mmcdw.Mcdw;
import vanthanyx.mmcdw.bases.McdwCustomWeaponBase;
import vanthanyx.mmcdw.enums.EnchantmentsID;
import vanthanyx.mmcdw.enums.SettingsID;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import vanthanyx.mmcdw.enchants.types.AOEEnchantment;
import vanthanyx.mmcdw.enchants.types.HealingEnchantment;

public class RadianceEnchantment extends HealingEnchantment {

    public RadianceEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        if (Mcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.RADIANCE)) {
            Registry.register(Registry.ENCHANTMENT, Mcdw.ID("radiance"), this);
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
                || !(other instanceof AOEEnchantment || other instanceof HealingEnchantment);
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return Mcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.RADIANCE);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof SwordItem || stack.getItem() instanceof AxeItem
                || stack.getItem() instanceof McdwCustomWeaponBase
                || stack.getItem() instanceof BowItem || stack.getItem() instanceof CrossbowItem;
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
