package net.unknown_degree.seer.Professions.data;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.w3c.dom.*;

import java.io.*;

import javax.xml.parsers.*;


public class DataRead extends JavaPlugin  {

    /*
     * Prints an awesome looking info box to the player giving them information
     * about a specified job in relevance to them.
     */
    public static void getInfo(CommandSender sender,String prof) throws Exception {
        
        prof = prof.toLowerCase();
        Player p = (Player) sender;
        
        /*
         * Parse player data:
         */
        File file = new File("./plugins/professions/data/" + p.getPlayerListName() + ".xml");
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(file);
        NodeList nodes = doc.getElementsByTagName("prof");
        
        /*
         * Output sexy messages...
         */
        sender.sendMessage(ChatColor.GREEN + "================= ..::" + ChatColor.WHITE + "Professions Info" + ChatColor.GREEN + "::.. =================");
        
        for ( int i = 0; i < nodes.getLength(); ) {
            Node n = nodes.item(i);
            Element v = (Element) n;
            String j = v.getAttribute("name").toLowerCase();
            
            // TODO If job exists in config :
            if ( j.equals(prof) ) {
                sender.sendMessage(ChatColor.DARK_AQUA + prof.toUpperCase() + "  ::  " + ChatColor.GREEN + "Employed");
                sender.sendMessage(ChatColor.DARK_AQUA + "LEVEL: " + ChatColor.WHITE + v.getAttribute("level") + ChatColor.DARK_AQUA + "   ::  XP: " + ChatColor.WHITE + v.getAttribute("exp"));
                // TODO Output experience bar...
                sender.sendMessage("");
                break;
            } else {
                sender.sendMessage(ChatColor.DARK_AQUA + prof.toUpperCase() + "  ::  " + ChatColor.GREEN + "Unemployed");
                sender.sendMessage("");
                break;
            }
            
            /*
             * TODO Display earning information from config.
             */
            
            //sender.sendMessage("Profession " + (i + 1) + ": " + v.getAttribute("name"));
        }
        
        sender.sendMessage(ChatColor.GREEN + "====================================================");
        
    }
    
}
