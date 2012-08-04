package net.unknown_degree.seer.Professions.commands;

import net.unknown_degree.seer.Professions.Professions;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Professions plugin;
	
	public Commands(Professions plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if ( sender instanceof Player ) {
			if ( args.length != 0 ) {
				
				/*
				 * /prof join [profession]
				 * 
				 * This job will allow a user to join a specific job.
				 * TODO Finish Job joining command...
				 */
				if ( args[0].equalsIgnoreCase("join") ) {
					if ( args.length == 2 ) {
						sender.sendMessage(args[1]);
						return true;
					} else {
						sender.sendMessage(ChatColor.RED + "Please enter a profession to join...");
						sender.sendMessage(ChatColor.RED + "Usage: /prof join [profession]");
						return true;
					}
					
				/*
				 * /prof
				 * 
				 * This is the root command. Show version information.
				 * TODO Show version information.
				 */
				} else { 
					return false;
				}
			} else {
				return false;
			}
		} else {
			sender.sendMessage(ChatColor.RED + "You must be a player to run this command.");
			return false;
		}
	}
	
}
