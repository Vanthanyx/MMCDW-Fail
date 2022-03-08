package vanthanyx.mmcdw.bases;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import vanthanyx.mmcdw.Mmcdw;
import vanthanyx.mmcdw.api.interfaces.IOffhandAttack;
import vanthanyx.mmcdw.api.util.RarityHelper;
import vanthanyx.mmcdw.enums.DaggersID;
import vanthanyx.mmcdw.items.ItemsInit;

import java.util.List;

public class McdwDagger extends SwordItem implements IOffhandAttack {

    public McdwDagger(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed,
                new Item.Settings().group(Mmcdw.WEAPONS).rarity(RarityHelper.fromToolMaterial(material)));
    }

    @Override
    public TypedActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        return useOffhand(worldIn, playerIn, handIn);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        for (DaggersID daggersID : DaggersID.values()) {
            if (stack.getItem() == ItemsInit.daggerItems.get(daggersID)) {
                int i = 1;
                String str = daggersID.toString().toLowerCase().substring(7);
                String translationKey = String.format("tooltip_info_item.mmcdw.%s_", str);
                while (I18n.hasTranslation(translationKey + i)) {
                    tooltip.add(new TranslatableText(translationKey + i).formatted(Formatting.ITALIC));
                    i++;
                }
                tooltip.add(new TranslatableText("tooltip_info_item.mmcdw.gap").formatted(Formatting.ITALIC));
                tooltip.add(new TranslatableText("tooltip_note_item.mmcdw.dualwield").formatted(Formatting.GREEN));
                break;
            }
        }
    }
}