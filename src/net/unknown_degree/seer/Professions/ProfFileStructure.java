package net.unknown_degree.seer.Professions;

import java.io.File;
import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginLogger;

public class ProfFileStructure extends JavaPlugin {

	public void check() {
		
		/*
		 * Set up plug-in folders:
		 */
		File f = new File("./plugins/professions/");
		if ( !f.exists() ) {
			PluginLogger.getLogger(JavaPlugin.class.getName()).log(Level.WARNING, "Professions directory not found. Attempting creation...");
			try {
				f.mkdir();
				PluginLogger.getLogger(JavaPlugin.class.getName()).log(Level.INFO, "Professions directory created successfully!");
			} catch (Exception e) {
				PluginLogger.getLogger(JavaPlugin.class.getName()).log(Level.SEVERE, "Professions directory creation failed!");
			}
		}
		f = new File("./plugins/professions/data/");
		if ( !f.exists() ) {
			PluginLogger.getLogger(JavaPlugin.class.getName()).log(Level.WARNING, "Professions data directory not found. Attempting creation...");
			try {
				f.mkdir();
				PluginLogger.getLogger(JavaPlugin.class.getName()).log(Level.INFO, "Professions data directory created successfully!");
			} catch (Exception e) {
				PluginLogger.getLogger(JavaPlugin.class.getName()).log(Level.SEVERE, "Professions data directory creation failed!");
			}
		}
		
	}
}