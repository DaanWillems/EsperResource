package com.solawep.esperresource.command;

import com.solawep.esperresource.EsperResource;
import com.solawep.esperresource.regeneration.RegenerationManager;
import com.solawep.esperresource.region.Region;
import com.solawep.esperresource.region.RegionManager;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class CommandHandler {

    RegionManager regionManager;
    RegenerationManager regenerationManager;
    EsperResource plugin;

    public CommandHandler(EsperResource _plugin, RegionManager _regionManager, RegenerationManager _regenerationManager) {
        plugin = _plugin;
        this.regionManager = _regionManager;
        this.regenerationManager = _regenerationManager;
    }

    public String getCommand() {
        throw new NotImplementedException();
    }

    public String getUsage() {
        throw new NotImplementedException();
    }

    public boolean execute(String[] args, Player sender) {
        throw new NotImplementedException();
    }
}
