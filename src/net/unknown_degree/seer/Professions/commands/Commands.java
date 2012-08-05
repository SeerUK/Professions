package net.unknown_degree.seer.Professions.commands;

import net.unknown_degree.seer.Professions.Professions;
import net.unknown_degree.seer.Professions.data.DataWrite;
import net.unknown_degree.seer.Professions.data.DataRead;

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
						 * This command will allow a user to join a specific job.
						 */
						if ( args.length == 2 ) {
							/*
							 * Run if command is correct.
							 */
						    sub = args[1].toLowerCase();
							DataWrite.joinProf(sender, sub);
							return true;
						} else {
							sender.sendMessage(ChatColor.RED + "Please enter a profession to join...");
							sender.sendMessage(ChatColor.RED + "Usage: /prof join [profession]");
							return true;
						}
					case "info":
					    /*
					     * /prof info [profession]
					     * 
					     * This command allows the user to see the status of a job.
					     */
					    if ( args.length == 2 ) {
					        sub = args[1].toLowerCase();
					        try {
                                DataRead.getInfo(sender, sub);
                                return true;
                            } catch (Exception e) { return false; }
					    } else {
					        sender.sendMessage(ChatColor.RED + "Please enter a profession to join...");
                            sender.sendMessage(ChatColor.RED + "Usage: /prof join [profession]");
                            return true;
					    }
					default:
						/*
						 * If the command isn't valid, show the usage:
						 */
						return false;
				}
			/*
			 * /prof
			 * 
			 * This is the root command. Show version information.
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
