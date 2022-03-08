package vanthanyx.mmcdw.api.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import vanthanyx.mmcdw.api.interfaces.IOffhandAttack;

public class CombatEventHandler {

    public static void checkForOffHandAttack() {
        MinecraftClient mc = MinecraftClient.getInstance();
        PlayerEntity player = mc.player;
        HitResult hitResult = mc.crosshairTarget;
        if (MinecraftClient.getInstance().world != null
                && MinecraftClient.getInstance().currentScreen == null
                && !MinecraftClient.getInstance().isPaused()
                && player != null
                && !player.isBlocking()) {
            ItemStack offhand = player.getOffHandStack();
            if (offhand.getItem() instanceof IOffhandAttack) {
                // float reach = (float) 3.0D;

                if (hitResult instanceof EntityHitResult) {
                    if (mc.crosshairTarget != null && mc.interactionManager != null) {
                        mc.interactionManager.attackEntity(player,
                                ((EntityHitResult) mc.crosshairTarget).getEntity());
                    }
                }
            }
        }
    }
}
