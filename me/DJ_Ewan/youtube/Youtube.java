package me.DJ_Ewan.youtube;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Youtube extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
		public static Youtube plugin;
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has shut down.");
	}
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + pdfFile.getVersion() + " Is running.");
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if (commandLabel.equalsIgnoreCase("megasword")){
			if (player.hasPermission("megaweapons.msword")
			{
			 	Player player = (Player) sender;
				PlayerInventory pi = player.getInventory();
				ItemStack megasword = new ItemStack(Material.DIAMOND_SWORD, 1); 
				megasword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
				megasword.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 15);
				megasword.addUnsafeEnchantment(Enchantment.DURABILITY, 500); 
				ItemMeta imsword = megasword.getItemMeta(); 
				imsword.setDisplayName (ChatColor.GOLD + "" + ChatColor.MAGIC + "ii" + ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "MEGASWORD" + ChatColor.GOLD + "" + ChatColor.MAGIC + "ii");
				megasword.setItemMeta(imsword);
				pi.addItem(megasword);
				player.sendMessage(ChatColor.AQUA + "Here you go!");
			}else{
				Player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
			}
		}
	
		if (commandLabel.equalsIgnoreCase("megabow")){ 
			if (player.hasPermission("megaweapons.mbow")
			{
				Player player = (Player) sender;
				PlayerInventory pi = player.getInventory();
				ItemStack megabow = new ItemStack(Material.BOW, 1);
				megabow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 32767);
				megabow.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 15);
				megabow.addUnsafeEnchantment(Enchantment.DURABILITY, 500);
				megabow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
				ItemMeta imbow = megabow.getItemMeta();
				imbow.setDisplayName (ChatColor.GOLD + "" + ChatColor.MAGIC + "ii" + ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "MEGABOW" + ChatColor.GOLD + "" + ChatColor.MAGIC + "ii");
				megabow.setItemMeta(imbow);
				pi.addItem(megabow);
				ItemStack arrow = new ItemStack(Material.ARROW, 1);
				pi.addItem(arrow);
				player.sendMessage(ChatColor.AQUA + "Here you go!");
			}else{
				Player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
			}
		 }
	
	return true;
	
	}
}
