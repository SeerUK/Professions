package net.unknown_degree.seer.Professions.data;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.java.JavaPlugin;

public class DataSetup extends JavaPlugin implements Listener {

	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent evt) throws IOException {
		
		this.checkPlayerData(evt.getPlayer().getPlayerListName());
		
	}
	
	
	/*
	 * checkPlayerData(<name>);
	 * 
	 * This function checks to see if the player has a data file set up.
	 * If the player doesn't a file is set up for them.
	 */
	private boolean checkPlayerData(String name) throws IOException {
		
		File f = new File("./plugins/professions/data/" + name + ".xml");
		if ( !f.exists() ) {
			
			try {
				boolean fs = f.createNewFile();
				if( fs ) {
					PluginLogger.getLogger(JavaPlugin.class.getName()).log(Level.INFO, "[Professions] New player: " + name + "::Data file created successfully.");
					/*
					 * TODO Generate proper XML structure.
					 */
				} else {
					PluginLogger.getLogger(JavaPlugin.class.getName()).log(Level.SEVERE, "[Professions] New player: " + name + "::Data file could not be created!");
				}
			} catch ( IOException e ) { }
			
		}
		
		return false;
		
	}
	
}
