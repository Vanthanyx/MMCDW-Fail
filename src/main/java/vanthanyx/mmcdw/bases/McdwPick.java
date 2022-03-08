package vanthanyx.mmcdw.bases;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import vanthanyx.mmcdw.Mmcdw;
import vanthanyx.mmcdw.api.util.RarityHelper;
import vanthanyx.mmcdw.enums.PicksID;
import vanthanyx.mmcdw.items.ItemsInit;

import java.util.List;

public class McdwPick extends PickaxeItem {
    public McdwPick(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed,
                new Item.Settings().group(Mmcdw.WEAPONS).rarity(RarityHelper.fromToolMaterial(material)));
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        if (stack.getItem() == ItemsInit.pickItems.get(PicksID.PICK_DIAMOND_PICKAXE_VAR)) {
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.diamond_pick_1").formatted(Formatting.ITALIC));
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.diamond_pick_2").formatted(Formatting.ITALIC));
            tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.diamond_pick_3").formatted(Formatting.ITALIC));
        }
    }
}