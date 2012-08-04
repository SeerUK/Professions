package net.unknown_degree.seer.Professions;

import net.unknown_degree.seer.Professions.data.DataSetup;
import net.unknown_degree.seer.Professions.data.DataWrite;

import org.bukkit.plugin.java.JavaPlugin;

public class Professions extends JavaPlugin {
	
	public void onEnable(){
		
		getServer().getPluginManager().registerEvents(new DataSetup(), this);
		getServer().getPluginManager().registerEvents(new DataWrite(), this);
		 
		/*
		 * Check File Structure...
		 */
		ChkFileStructure fs = new ChkFileStructure();
		fs.check();
		/*
		 * Check configuration file...
		 */
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		/*
		 * If we get to this point, all is well...
		 */
		getLogger().info("Professions enabled");
		
	}
	
	public void onDisable(){ 
		
		getLogger().info("Professions disabled.");
		
	}
	
}