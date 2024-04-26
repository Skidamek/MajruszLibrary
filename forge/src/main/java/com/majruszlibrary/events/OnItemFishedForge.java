package com.majruszlibrary.events;

import com.majruszlibrary.events.base.Events;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.ItemFishedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class OnItemFishedForge {
	@SubscribeEvent
	public static void onItemFished( ItemFishedEvent event ) {
		Player player = event.getEntity();

		Events.dispatch( new OnItemFished( player, event.getHookEntity(), player.getItemInHand( player.getUsedItemHand() ), event.getDrops() ) );
	}
}
