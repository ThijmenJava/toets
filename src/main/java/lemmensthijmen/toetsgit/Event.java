package lemmensthijmen.toetsgit;

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

        if (player.getDisplayName().equals("davor")) {
            player.sendMessage("Vip!");
        }
    }
}
