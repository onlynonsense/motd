package org.nonsense.motd;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MOTD extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new SpigotMOTDServerListPing(this), this);

        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

}
