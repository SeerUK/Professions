package net.unknown_degree.seer.Professions;

import org.bukkit.plugin.java.JavaPlugin;

import net.unknown_degree.seer.Professions.FileStructure;

public class Professions extends JavaPlugin {
	public void onEnable(){
		
		getLogger().info("Professions enabled");
		//getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		 
		/*
		 * Check File Structure...:
		 */
		FileStructure f = new FileStructure();
		f.check();
		 
	}
	public void onDisable(){ 
		getLogger().info("Professions disabled.");
	}
}
