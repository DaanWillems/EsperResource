package com.solawep.esperresource.command;

import com.solawep.esperresource.EsperResource;
import com.solawep.esperresource.command.handlers.RegionHandler;
import com.solawep.esperresource.regeneration.RegenerationManager;
import com.solawep.esperresource.region.RegionManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class CommandDispatcher implements CommandExecutor {

    private Map<String, CommandHandler> commands = new HashMap<String, CommandHandler>();

    public CommandDispatcher(EsperResource _plugin, RegionManager _regionManager, RegenerationManager _regenerationManager) {
        commands.put("region", new RegionHandler(_plugin, _regionManager, _regenerationManager));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player player = (Player) sender;


        return true;
    }
}
