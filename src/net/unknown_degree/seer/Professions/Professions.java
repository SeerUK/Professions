package net.unknown_degree.seer.Professions;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class Professions extends JavaPlugin {
	public void onEnable(){ 
		 getLogger().info("Settler enabled");
		 //getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		 
		 //Boolean test = (new File("./plugins/settler/").exists());
		 //String test2 = test.toString();
		 //getLogger().info(test2);
	}
	public void onDisable(){ 
		 getLogger().info("Settler disabled.");
	}
}
