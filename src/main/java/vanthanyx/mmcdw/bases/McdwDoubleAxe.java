package vanthanyx.mmcdw.bases;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import vanthanyx.mmcdw.Mmcdw;
import vanthanyx.mmcdw.api.util.RarityHelper;
import vanthanyx.mmcdw.enums.DoubleAxesID;
import vanthanyx.mmcdw.items.ItemsInit;

import java.util.List;

public class McdwDoubleAxe extends AxeItem {

    public McdwDoubleAxe(ToolMaterial material, float attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed,
                new Item.Settings().group(Mmcdw.WEAPONS).rarity(RarityHelper.fromToolMaterial(material)));
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        for (DoubleAxesID doubleAxesID : DoubleAxesID.values()) {
            if (stack.getItem() == ItemsInit.doubleAxeItems.get(doubleAxesID)) {
                int i = 1;
                String str = doubleAxesID.toString().toLowerCase().substring(4);
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