package vanthanyx.mmcdw.enchants.enchantments;

import vanthanyx.mmcdw.Mmcdw;
import vanthanyx.mmcdw.enums.EnchantmentsID;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;
import vanthanyx.mmcdw.enchants.types.RangedEnchantment;

public class AccelerateEnchantment extends RangedEnchantment {
    public AccelerateEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
        if (Mmcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.ACCELERATE)) {
            Registry.register(Registry.ENCHANTMENT, Mmcdw.ID("accelerate"), this);
        }
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return Mmcdw.CONFIG.mcdwEnchantmentsConfig.enableEnchantments.get(EnchantmentsID.ACCELERATE);
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