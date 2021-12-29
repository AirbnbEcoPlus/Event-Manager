package fr.endide.event;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class chooseevent implements CommandExecutor {

	private main main;
	public chooseevent(main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		Player player = (Player) sender;
		if (msg.equalsIgnoreCase("eventmanager")) {
			if (args[0].equalsIgnoreCase("uhccore")) {
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable UltimateSheepWars");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable MLGRush");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable WereWolfPlugin");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman enable UhcCore");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable Elections");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable rankAddon");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable pluginpv");
			}
			if (args[0].equalsIgnoreCase("sheepwars")) {
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman enable UltimateSheepWars");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable MLGRush");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable WereWolfPlugin");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable UhcCore");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable Elections");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable rankAddon");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable pluginpv");
			}
			if (args[0].equalsIgnoreCase("MLGRush")) {
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable UltimateSheepWars");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman enable MLGRush");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable WereWolfPlugin");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable UhcCore");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable Elections");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable rankAddon");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable pluginpv");
			}
			if (args[0].equalsIgnoreCase("uhclg")) {
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disbale UltimateSheepWars");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable MLGRush");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman enable WereWolfPlugin");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable UhcCore");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman enable Elections");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman enable rankAddon");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable pluginpv");
			}
			if (args[0].equalsIgnoreCase("lg")) {
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable UltimateSheepWars");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable MLGRush");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable WereWolfPlugin");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable UhcCore");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable Elections");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman disable rankAddon");
				main.getServer().dispatchCommand(main.getServer().getConsoleSender(), "plugman enable pluginpv");
			}
			
		}
		return false;
	}

}
