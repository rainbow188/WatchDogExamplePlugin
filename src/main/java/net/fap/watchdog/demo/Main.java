package net.fap.watchdog.demo;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import net.fap.watchdog.check.api.event.PlayerCheatEvent;

public class Main extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Demo Plugin Enable!");
        getServer().getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onPlayerCheatEvent(PlayerCheatEvent event)
    {
        Player player = event.getPlayer();
        getServer().broadcastMessage(player.getName()+"try cheating!");
    }

}
