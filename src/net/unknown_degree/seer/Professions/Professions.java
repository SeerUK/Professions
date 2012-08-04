package net.unknown_degree.seer.Professions;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class Professions extends JavaPlugin {
	public void onEnable(){
		
		 getLogger().info("Professions enabled");
		 //getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		 
		 /*
		  * Set up plug-in folders:
		  */
		 File f = new File("./plugins/professions/");
		 if ( !f.exists() ) {
			 getLogger().info("Professions directory not found. Attempting creation...");
			 try {
				 f.mkdir();
				 getLogger().info("....\nProfessions directory created successfully!");
			 } catch (Exception e) {
				 getLogger().info("....\nProfessions directory was NOT created!");
			 }
		 }
		 
	}
	public void onDisable(){ 
		 getLogger().info("Professions disabled.");
	}
}
