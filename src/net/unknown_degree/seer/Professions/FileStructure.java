package net.unknown_degree.seer.Professions;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class FileStructure extends JavaPlugin {
	
	public void check() {
		this.create();
	}
	
	public void create() {
		
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
		
		return;
		
	}
}