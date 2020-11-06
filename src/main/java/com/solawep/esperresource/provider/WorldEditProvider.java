package com.solawep.esperresource.provider;

import com.sk89q.worldedit.IncompleteRegionException;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.sk89q.worldedit.regions.Region;
import com.solawep.esperresource.EsperResource;
import org.apache.logging.log4j.message.Message;
import org.bukkit.entity.Player;

public class WorldEditProvider {
    private final WorldEditPlugin worldEdit;
    private EsperResource plugin;

    public WorldEditProvider(EsperResource _plugin) {
        plugin = _plugin;
        this.worldEdit = (WorldEditPlugin) plugin.getServer().getPluginManager().getPlugin("WorldEdit");
    }

    public Region getSelection(Player player) {
        Region selection;
        try {
            selection = worldEdit.getSession(player).getSelection(BukkitAdapter.adapt(player.getWorld()));
        } catch (IncompleteRegionException e) {
//            player.sendMessage(Message.NO_SELECTION.get(player));
            return null;
        }
        return selection;
    }
}
