package vanthanyx.mmcdw.enchants.types;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class RangedEnchantment extends Enchantment {
    protected RangedEnchantment(Enchantment.Rarity rarity, EnchantmentTarget enchantmentTarget,
            EquipmentSlot[] equipmentSlots) {
        super(rarity, enchantmentTarget, equipmentSlots);
    }
}
