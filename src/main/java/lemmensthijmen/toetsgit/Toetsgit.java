package lemmensthijmen.toetsgit;

import org.bukkit.plugin.java.JavaPlugin;

public final class Toetsgit extends JavaPlugin {

    private static Toetsgit main;

    @Override
    public void onEnable() {
        Toetsgit.main = this;

        new Event();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static lemmensthijmen.toetsgit.Toetsgit getMain() {
        return main;
    }
}
