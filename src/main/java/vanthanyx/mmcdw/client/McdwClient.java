package vanthanyx.mmcdw.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;
import vanthanyx.mmcdw.bases.*;
import vanthanyx.mmcdw.enchants.summons.registry.SummonedEntityRegistry;
import vanthanyx.mmcdw.enchants.summons.render.SummonedBeeRenderer;
import vanthanyx.mmcdw.enums.*;
import vanthanyx.mmcdw.items.ItemsInit;

@Environment(EnvType.CLIENT)
public class McdwClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(SummonedEntityRegistry.SUMMONED_BEE_ENTITY, SummonedBeeRenderer::new);

        for (ShieldsID itemID : ShieldsID.values()) {
            registerShieldPredicates(ItemsInit.shieldItems.get(itemID));
        }
    }

    public static void registerShieldPredicates(McdwShield shield) {
        FabricModelPredicateProviderRegistry.register(shield, new Identifier("blocking"), (itemStack, clientWorld,
                livingEntity,
                seed) -> livingEntity != null && livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack
                        ? 1.0F
                        : 0.0F);
    }
}
