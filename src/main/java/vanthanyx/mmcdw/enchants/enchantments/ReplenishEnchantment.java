package vanthanyx.mmcdw.enchants.enchantments;

import vanthanyx.mmcdw.Mcdw;
import vanthanyx.mmcdw.enums.EnchantmentsID;
import vanthanyx.mmcdw.enums.SettingsID;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.InfinityEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.Registry;
import vanthanyx.mmcdw.enchants.types.RangedEnchantment;

public class ReplenishEnchantment extends RangedEnchantment {
    public ReplenishEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        if (Mcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.REPLENISH)) {
            Registry.register(Registry.ENCHANTMENT, Mcdw.ID("replenish"), this);
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
                || !(other instanceof InfinityEnchantment);
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return Mcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.REPLENISH);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof CrossbowItem || stack.getItem() instanceof BowItem;
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