package fr.endide.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class eventListen implements Listener {

	private main main;
	public eventListen(main main) {
		this.main = main;
	}
    public void ifServerIsReady(PlayerJoinEvent event) {
    	if(main.allowToJoin == false) {
    		Player player = event.getPlayer();
    		player.kickPlayer("Le serveur n'est pas encore pret");
    	}
    }

}
