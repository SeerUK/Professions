package net.unknown_degree.seer.Professions;

import net.unknown_degree.seer.Professions.data.DataSetup;
import net.unknown_degree.seer.Professions.data.DataWrite;
import net.unknown_degree.seer.Professions.commands.Commands;
import net.unknown_degree.seer.Professions.config.ConfigHandler;

import org.bukkit.plugin.java.JavaPlugin;

public class Professions extends JavaPlugin {
	
	public final String version = "v0.1-prealpha";
	
	@Override
	public void onEnable(){
		
		/*
		 * Register Events...
		 */
		getServer().getPluginManager().registerEvents(new DataSetup(), this);
		getServer().getPluginManager().registerEvents(new DataWrite(), this);
		 
		/*
		 * Setup Commands...
		 */
		getCommand("prof").setExecutor(new Commands(this));
		
		/*
		 * Check File Structure...
		 */
		ChkFileStructure fs = new ChkFileStructure();
		fs.check();
		@SuppressWarnings("unused")
        ConfigHandler c = new ConfigHandler(this);
		
		/*
		 * If we get to this point, the plugin is OK so far...
		 */
		getLogger().info("Professions enabled");
		
	}
	
	public void onDisable(){ 
		getLogger().info("Professions disabled.");
	}
	
	public Professions Plugin() {
        return this;
	}
	
}