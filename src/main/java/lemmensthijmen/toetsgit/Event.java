package lemmensthijmen.toetsgit;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Event implements Listener {

    public Event() {
        Toetsgit.getMain().getServer().getPluginManager().registerEvents(this, Toetsgit.getMain());
    }

    @EventHandler
    public void onPLayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        // kijken of de naam over 1 komt met die van davor!

        if (player.getDisplayName().equals("davor")) {
            player.setHealth(500);
        } else {
            player.sendMessage("je bent geen vip!");
        }
    }
}
