package net.unknown_degree.seer.Professions;

import org.bukkit.plugin.java.JavaPlugin;
//import net.unknown_degree.seer.Professions.ProfFileStructure;

public class Professions extends JavaPlugin {
	
	public void onEnable(){
		
		//getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		 
		/*
		 * Check File Structure...
		 */
		ProfFileStructure f = new ProfFileStructure();
		f.check();
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