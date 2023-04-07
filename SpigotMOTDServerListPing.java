package org.nonsense.spigotmotd;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class SpigotMOTDServerListPing implements Listener {

    private final SpigotMOTD plugin;

    public SpigotMOTDServerListPing(SpigotMOTD plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void OnServerListPing(ServerListPingEvent e) {
        String motd1 = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getStringList("motd").get(0));
        String motd2 = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getStringList("motd").get(1));


        int maxp = plugin.getConfig().getInt("maxplayers");

        e.setMaxPlayers(maxp);

        e.setMotd(motd1 + "\n" + motd2);




    }
}
