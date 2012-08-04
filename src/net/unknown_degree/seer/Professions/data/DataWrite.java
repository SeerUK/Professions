package net.unknown_degree.seer.Professions.data;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DataWrite extends JavaPlugin implements Listener {
	
	/*
	 * onBlockBreak();
	 * 
	 * This function writes the player data on block break events.
	 * TODO Write to player files...
	 */
	@EventHandler
	public void onBlockBreak(BlockBreakEvent evt) {
		Player p = evt.getPlayer();
		Block b = evt.getBlock();
		b.getType();
		p.sendMessage(p.getName() + " you just broke: " + b.getTypeId() + ":" + b.getData());
	}
	
}
