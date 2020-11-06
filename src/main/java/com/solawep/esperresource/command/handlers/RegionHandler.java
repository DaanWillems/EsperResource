package com.solawep.esperresource.command.handlers;

import com.sk89q.worldedit.regions.Region;
import com.solawep.esperresource.EsperResource;
import com.solawep.esperresource.command.CommandHandler;
import com.solawep.esperresource.provider.WorldEditProvider;
import com.solawep.esperresource.regeneration.RegenerationManager;
import com.solawep.esperresource.region.RegionManager;
import org.bukkit.entity.Player;

public class RegionHandler extends CommandHandler {

    WorldEditProvider worldEditProvider;

    public RegionHandler(EsperResource _plugin, RegionManager _regionManager, RegenerationManager _regenerationManager) {
        super(_plugin, _regionManager, _regenerationManager);
        worldEditProvider = new WorldEditProvider(_plugin);
    }

    @Override
    public String getCommand() {
        return "region";
    }

    @Override
    public String getUsage() {
        return null;
    }

    @Override
    public boolean execute(String[] args, Player sender) {
        if(args[1].equals("create")) {
            sender.sendMessage("creating");
            Region region = worldEditProvider.getSelection(sender);
            if(region == null) {
                return true;
            }
            return true;
        } else if(args[1].equals("delete")) {
            sender.sendMessage("deleting");
        }
        return false;
    }
}
