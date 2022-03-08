package vanthanyx.mmcdw.bases;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import vanthanyx.mmcdw.Mmcdw;
import vanthanyx.mmcdw.api.util.RarityHelper;
import vanthanyx.mmcdw.enums.ScythesID;
import vanthanyx.mmcdw.items.ItemsInit;

import java.util.List;

public class McdwScythe extends SwordItem {
    public McdwScythe(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed,
                new Item.Settings().group(Mmcdw.WEAPONS).rarity(RarityHelper.fromToolMaterial(material)));
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        for (ScythesID scythesID : ScythesID.values()) {
            if (stack.getItem() == ItemsInit.scytheItems.get(scythesID)) {
                int i = 1;
                String str = scythesID.toString().toLowerCase().substring(7);
                String translationKey = String.format("tooltip_info_item.mmcdw.%s_", str);
                while (I18n.hasTranslation(translationKey + i)) {
                    tooltip.add(new TranslatableText(translationKey + i).formatted(Formatting.ITALIC));
                    i++;
                }
                break;
            }
        }
    }
}