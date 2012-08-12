package net.unknown_degree.seer.Professions.config;

import net.unknown_degree.seer.Professions.Professions;

import org.bukkit.plugin.java.JavaPlugin;

public class ConfigHandler extends JavaPlugin{
    
    public ConfigHandler(Professions plugin) {
        
        /* 
         * Setup default config if it's not there!
         */
        plugin.getConfig().options().copyDefaults(true);
        plugin.saveConfig();
        
    }
    
}
