package com.solawep.esperresource.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {
    @EventHandler
    public void onPlayerJoin(BlockBreakEvent event)
    {
        Player player = (Player) event.getPlayer();
        player.sendMessage("You broke a block");
    }
}
