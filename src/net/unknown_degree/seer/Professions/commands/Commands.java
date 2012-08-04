package net.unknown_degree.seer.Professions.commands;

import net.unknown_degree.seer.Professions.Professions;
import net.unknown_degree.seer.Professions.data.DataWrite;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
	
	private Professions plugin;
	
	public Commands(Professions plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if ( sender instanceof Player ) {
			if ( args.length != 0 ) {
				String sub = args[0].toLowerCase();
				switch ( sub ) {
					case "join":
						/*
						 * /prof join [profession]
						 * 
						 * This job will allow a user to join a specific job.
						 * TODO Finish Job joining command...
						 */
						if ( args.length == 2 ) {
							/*
							 * Run if command is correct.
							 */
							DataWrite.joinProf(sender, args[1]);
							return true;
						} else {
							sender.sendMessage(ChatColor.RED + "Please enter a profession to join...");
							sender.sendMessage(ChatColor.RED + "Usage: /prof join [profession]");
							return true;
						}
					default:
						/*
						 * If the command isn't valid, show the usage:				 * 
						 */
						return false;
				}
			/*
			 * /prof
			 * 
			 * This is the root command. Show version information.
			 * TODO Show version information.
			 */
			} else {
				sender.sendMessage(ChatColor.GREEN + "[Professions]" + ChatColor.WHITE + "::Version " + ChatColor.RED + plugin.version);
				return true;
			}
		} else {
			sender.sendMessage(ChatColor.RED + "You must be a player to run this command.");
			return false;
		}
	}
	
}
