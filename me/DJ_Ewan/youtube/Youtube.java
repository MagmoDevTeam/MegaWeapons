package me.DJ_Ewan.youtube;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
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
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args, PlayerInteractEvent e){
		
		if (commandLabel.equalsIgnoreCase("megasword")){
			Player player = (Player) sender;
			if (player.hasPermission("megaweapons.msword"))
			{
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
			}if(!player.hasPermission("megaweapons.msword"))
			{
				player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
			}
		}
	
		if (commandLabel.equalsIgnoreCase("megabow")){ 
			Player player = (Player) sender;
			if (player.hasPermission("megaweapons.mbow"))
			{
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
			}
			if (!player.hasPermission("megaweapons.mbow")){
				player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
			}
		 }
		 if (commandLabel.equalsIgnoreCase("megahelmet")){ 
		 	Player player = (Player) sender;
			if (player.hasPermission("megaweapons.mhelmet"))
			{
				PlayerInventory pi = player.getInventory();
				ItemStack megahelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
				megahelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
				megahelmet.addUnsafeEnchantment(Enchantment.THORNS, 15);
				megahelmet.addUnsafeEnchantment(Enchantment.DURABILITY, 500);
				megahelmet.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
				ItemMeta imhelmet = megahelmet.getItemMeta();
				imhelmet.setDisplayName (ChatColor.GOLD + "" + ChatColor.MAGIC + "ii" + ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "MEGAHELMET" + ChatColor.GOLD + "" + ChatColor.MAGIC + "ii");
				megahelmet.setItemMeta(imhelmet);
				pi.addItem(megahelmet);
				player.sendMessage(ChatColor.AQUA + "Here you go!");
			}
			if (!player.hasPermission("megaweapons.mhelmet")){
				player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
			}
		 }
		 
		 if (commandLabel.equalsIgnoreCase("megashirt")){
		 	Player player = (Player) sender;
		 	if (player.hasPermission("megaweapons.mshirt"))
		 	{
		 		PlayerInventory pi = player.getInventory();
		 		ItemStack megashirt = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		 		megashirt.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
		 		megashirt.addUnsafeEnchantment(Enchantment.THORNS, 15);
		 		megashirt.addUnsafeEnchantment(Enchantment.DURABILITY, 500);
		 		megashirt.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
		 		ItemMeta imegashirt = megashirt.getItemMeta();
		 		imegashirt.setDisplayName(ChatColor.GOLD + "" + ChatColor.MAGIC + "ii" + ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "MEGASHIRT" + ChatColor.GOLD + "" + ChatColor.MAGIC + "ii");
		 		megashirt.setItemMeta(imegashirt);
		 		pi.addItem(megashirt);
		 		player.sendMessage(ChatColor.AQUA + "Here you go!");
		 	}
		 	if (!player.hasPermission("megaweapons.mshirt")){
		 		player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
		 	}
		 }
		 
		 if (commandLabel.equalsIgnoreCase("megapants")){
		 	Player player = (Player) sender;
		 	if (player.hasPermission("megaweapons.mpants"))
		 	{
		 		PlayerInventory pi = player.getInventory();
		 		ItemStack megapants = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
		 		megapants.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
		 		megapants.addUnsafeEnchantment(Enchantment.THORNS, 15);
		 		megapants.addUnsafeEnchantment(Enchantment.DURABILITY, 500);
		 		megapants.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
		 		ItemMeta imegapants = megapants.getItemMeta();
		 		imegapants.setDisplayName(ChatColor.GOLD + "" + ChatColor.MAGIC + "ii" + ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "MEGAPANTS" + ChatColor.GOLD + "" + ChatColor.MAGIC + "ii");
		 		megapants.setItemMeta(imegapants);
		 		pi.addItem(megapants);
		 		player.sendMessage(ChatColor.AQUA + "Here you go!");
		 	}
		 	if (!player.hasPermission("megaweapons.mpants")){
		 		player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
		 	}
		 }
		 
		 if (commandLabel.equalsIgnoreCase("megaboots")){
		 	Player player = (Player) sender;
		 	if (player.hasPermission("megaweapons.mboots"))
		 	{
		 		PlayerInventory pi = player.getInventory();
		 		ItemStack megaboots = new ItemStack(Material.DIAMOND_BOOTS, 1);
		 		megaboots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 32767);
		 		megaboots.addUnsafeEnchantment(Enchantment.THORNS, 15);
		 		megaboots.addUnsafeEnchantment(Enchantment.DURABILITY, 500);
		 		megaboots.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
		 		ItemMeta imegaboots = megaboots.getItemMeta();
		 		imegaboots.setDisplayName(ChatColor.GOLD + "" + ChatColor.MAGIC + "ii" + ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "MEGABOOTS" + ChatColor.GOLD + "" + ChatColor.MAGIC + "ii");
		 		megaboots.setItemMeta(imegaboots);
		 		pi.addItem(megaboots);
		 		player.sendMessage(ChatColor.AQUA + "Here you go!");
		 	}
		 	if (!player.hasPermission("megaweapons.mboots")){
		 		player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
		 	}
		 }
		 
		 if (commandLabel.equalsIgnoreCase("megatato")){
		 	Player player = (Player) sender;
		 	if (player.hasPermission("megaweapons.mtato"))
		 	{
		 		PlayerInventory pi = player.getInventory();
		 		ItemStack megatato = new ItemStack(Material.POTATO, 1);
		 		megatato.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
		 		megatato.addUnsafeEnchantment(Enchantment.KNOCKBACK, 20);
		 		megatato.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 15);
		 		ItemMeta imegatato = megatato.getItemMeta();
		 		imegatato.setDisplayName(ChatColor.GOLD + "" + ChatColor.MAGIC + "ii" + ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "MEGATATO" + ChatColor.GOLD + "" + ChatColor.MAGIC + "ii");
		 		megatato.setItemMeta(imegatato);
		 		pi.addItem(megatato);
		 		player.sendMessage(ChatColor.AQUA + "Here you go!");
		 	}
		 	if(!player.hasPermission("megaweapons.mtato")){
		 		player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
		 	}
		 }
		 
		 if (commandLabel.equalsIgnoreCase("megacookie")){
		 	Player player = (Player) sender;
		 	if (player.hasPermission("megaweapons.mcookie"))
		 	{
		 		PlayerInventory pi = player.getInventory();
		 		ItemStack megacookie = new ItemStack(Material.POTATO, 1);
		 		megacookie.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 32767);
		 		megacookie.addUnsafeEnchantment(Enchantment.KNOCKBACK, 20);
		 		megacookie.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 15);
		 		ItemMeta imegacookie = megacookie.getItemMeta();
		 		imegacookie.setDisplayName(ChatColor.GOLD + "" + ChatColor.MAGIC + "ii" + ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "MEGACOOKIE" + ChatColor.GOLD + "" + ChatColor.MAGIC + "ii");
		 		megacookie.setItemMeta(imegacookie);
		 		pi.addItem(megacookie);
		 		player.sendMessage(ChatColor.AQUA + "Here you go!");
		 	}
		 	if(!player.hasPermission("megaweapons.mcookie")){
		 		player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
		 	}
		 }
		 
		// if (commandLabel.equalsIgnoreCase("megalauncher"))
		 //{
		 	//if (player.hasPermission("megaweapons.mlauncher")
		 	//{
		 	//	PlayerInventory pi = player.getInventory();
		 	//	ItemStack megalauncher = new ItemStack(Material.STICK, 1);
		 	//	ItemMeta imlauncher = megalauncher.getItemMeta();
		 	//	imlauncher.setDisplayName(ChatColor.GOLD + "" + ChatColor.MAGIC + "ii" + ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "MEGALAUNCHER" + ChatColor.GOLD + "" + ChatColor.MAGIC + "ii");
		 	//	megalauncher.setItemMeta(imlauncher);
		 	//	pi.addItem(megalauncher);
		 	//	player.sendMessage(ChatColor.AQUA + "Here you go!");
		 	//	if(e.getAction().equals(Action.RIGHT_CLICK_AIR)){
    		//		if(e.getItem().getType().equals(megalauncher.getType()) && e.getItem().hasItemMeta()){
      		//		if(e.getItem().getItemMeta().getDisplayName().equals(megalauncher.getItemMeta().getDisplayName()){
      					
      					
				    
				
		 		
		 	
		 
		 	
	
	return true;
	
	}
}

