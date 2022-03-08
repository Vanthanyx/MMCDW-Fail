package vanthanyx.mmcdw.bases;

import net.minecraft.client.item.TooltipContext;
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
import vanthanyx.mmcdw.enums.SoulDaggersID;
import vanthanyx.mmcdw.items.ItemsInit;

import java.util.List;

public class McdwSoulDagger extends SwordItem {
    public McdwSoulDagger(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed,
                new Item.Settings().group(Mmcdw.WEAPONS).rarity(RarityHelper.fromToolMaterial(material)));
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        if (stack.getItem() == ItemsInit.soulDaggerItems.get(SoulDaggersID.DAGGER_SOUL_KNIFE)) {
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.soul_knife_1").formatted(Formatting.ITALIC));
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.soul_knife_2").formatted(Formatting.ITALIC));
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.soul_knife_3").formatted(Formatting.ITALIC));
        }
        if (stack.getItem() == ItemsInit.soulDaggerItems.get(SoulDaggersID.SWORD_TRUTHSEEKER)) {
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.truthseeker_1").formatted(Formatting.ITALIC));
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.truthseeker_2").formatted(Formatting.ITALIC));
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.truthseeker_3").formatted(Formatting.ITALIC));
        }
        if (stack.getItem() == ItemsInit.soulDaggerItems.get(SoulDaggersID.DAGGER_ETERNAL_KNIFE)) {
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.eternal_knife_1").formatted(Formatting.ITALIC));
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.eternal_knife_2").formatted(Formatting.ITALIC));
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.eternal_knife_3").formatted(Formatting.ITALIC));
        }
    }
}