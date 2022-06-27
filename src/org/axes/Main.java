package org.axes;
import org.axes.commands.AxesCommand;
import org.axes.events.AxesEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerEvents();
        registerCommands();
        if (Bukkit.getPluginManager().getPlugin("WorldGuard") == null) {
            getLogger().severe("WorldGuard not found!");
        }
    }

    public void registerEvents() {
        getServer().getPluginManager().registerEvents(new AxesEvent(), this);
    }

    public void registerCommands() {
        getCommand("axe").setExecutor(new AxesCommand());
    }

    public static String color(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
