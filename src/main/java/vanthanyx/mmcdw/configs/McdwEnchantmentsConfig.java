package vanthanyx.mmcdw.configs;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import vanthanyx.mmcdw.enums.EnchantmentsID;

import java.util.HashMap;

@Config(name = "mcdw_enchantments_config")
public class McdwEnchantmentsConfig implements ConfigData {

    // Enable or Disable Enchantments
    public HashMap<EnchantmentsID, Boolean> enableEnchantments = new HashMap<>();

    public McdwEnchantmentsConfig() {
        for (EnchantmentsID enchantmentsID : EnchantmentsID.values())
            enableEnchantments.put(enchantmentsID, true);
        enableEnchantments.replace(EnchantmentsID.ACCELERATE, false);
    }
}
