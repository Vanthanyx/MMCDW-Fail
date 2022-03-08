package vanthanyx.mmcdw.enchants.enchantments;

import vanthanyx.mmcdw.Mmcdw;
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
import vanthanyx.mmcdw.enchants.types.AOEEnchantment;
import vanthanyx.mmcdw.enchants.types.DamageBoostEnchantment;

public class AmbushEnchantment extends DamageBoostEnchantment {

    public AmbushEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        if (Mmcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.AMBUSH)) {
            Registry.register(Registry.ENCHANTMENT, Mmcdw.ID("ambush"), this);
        }
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return Mmcdw.CONFIG.mcdwEnchantmentSettingsConfig.enableEnchantmentSettings
                .get(SettingsID.ENABLE_OP_ENCHANTMENT_MIXING) ||
                !(other instanceof AOEEnchantment || other instanceof DamageBoostEnchantment);
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return Mmcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.AMBUSH);
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
