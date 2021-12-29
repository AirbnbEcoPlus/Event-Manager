package fr.endide.event;

import java.util.Calendar;
import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	boolean allowToJoin = false;
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new eventListen(this), this);
		getCommand("eventmanager").setExecutor(new chooseevent(this));
		getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable MLGRush");
		getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable WereWolfPlugin");
		getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable UltimateSheepWars");
		getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable UhcCore");
		getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable Elections");
		getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable rankAddon");
		getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable pluginpv");
		Date now = new Date();
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				chooseGame(now);
			}
		},60L, 18000L);
		
	}
	@SuppressWarnings("deprecation")
	public void chooseGame(Date now){
		Date now1 = new Date();
		if(getDayNumberOld(now1) == 2) {
			if(getDayNumberOld(now1) > getDayNumberOld(now)) {
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman enable UltimateSheepWars");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable MLGRush");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable WereWolfPlugin");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable UhcCore");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable Elections");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable rankAddon");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable pluginpv");
			now.getDay();
			}
		}
		if(getDayNumberOld(now1) == 3) {
			if(getDayNumberOld(now1) > getDayNumberOld(now)) {
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman enable UhcCore");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable MLGRush");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable WereWolfPlugin");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable UltimateSheepWars");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable Elections");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable rankAddon");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable pluginpv");
			now.getDay();
			}
		}
		if(getDayNumberOld(now1) == 4) {
			if(getDayNumberOld(now1) > getDayNumberOld(now)) {
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman enable MLGRush");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable WereWolfPlugin");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable UltimateSheepWars");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable UhcCore");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable Elections");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable rankAddon");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable pluginpv");
			now.getDay();
			}
		}
		if(getDayNumberOld(now1) == 5) {
			if(getDayNumberOld(now1) > getDayNumberOld(now)) {
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman enable WereWolfPlugin");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman enable Elections");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman enable rankAddon");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable MLGRush");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable UltimateSheepWars");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable UhcCore");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable pluginpv");
			now.getDay();
			}
		}
		if(getDayNumberOld(now1) == 6) {
			if(getDayNumberOld(now1) > getDayNumberOld(now)) {
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman enable pluginpv");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable MLGRush");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable WereWolfPlugin");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable UltimateSheepWars");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable UhcCore");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable Elections");
			getServer().dispatchCommand(getServer().getConsoleSender(), "plugman disable rankAddon");
			now.getDay();
			}
		}
		
	}
	public static int getDayNumberOld(Date date) {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    return cal.get(Calendar.DAY_OF_WEEK);
	}
	
	
}
