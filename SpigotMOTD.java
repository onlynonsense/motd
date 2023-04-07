package org.nonsense.spigotmotd;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotMOTD extends JavaPlugin {

    @Override
    public void onEnable() {
        // events
        Bukkit.getServer().getPluginManager().registerEvents(new SpigotMOTDServerListPing(this), this);


        // config
        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

}
