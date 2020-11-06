package com.solawep.esperresource;

import com.solawep.esperresource.command.CommandDispatcher;
import com.solawep.esperresource.config.ConfigManager;
import com.solawep.esperresource.listener.BlockBreakListener;
import com.solawep.esperresource.regeneration.RegenerationManager;
import com.solawep.esperresource.region.RegionManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class EsperResource extends JavaPlugin {
    ConfigManager configManager;
    RegenerationManager regenerationManager;
    RegionManager regionManager;

    @Override
    public void onEnable(){
        configManager = new ConfigManager(this);
        regenerationManager = new RegenerationManager(this);
        regionManager = new RegionManager(this);

        Bukkit.getPluginManager().registerEvents(new BlockBreakListener(), this);
        this.getCommand("er").setExecutor(new CommandDispatcher(this, regionManager, regenerationManager));
    }

    @Override
    public void onDisable(){

    }
}
