package au.id.rleach.nolightningfires;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.event.block.BlockIgniteEvent.IgniteCause.LIGHTNING;

public final class NoLightningFires extends JavaPlugin implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onBlockIgnite(BlockIgniteEvent event) {
        if(LIGHTNING.equals(event.getCause())) event.setCancelled(true);
    }
}
