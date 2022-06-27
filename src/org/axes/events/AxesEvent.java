package org.axes.events;
import com.sk89q.worldguard.bukkit.WGBukkit;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import org.axes.Main;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class AxesEvent implements Listener {

    @EventHandler
    public void onAxeHit(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            boolean pvp_status = true;
            Player damager = (Player) e.getDamager();
            Player damaged = (Player) e.getEntity();
            RegionManager regionManager = WGBukkit.getRegionManager(damaged.getWorld());
            ApplicableRegionSet set = regionManager.getApplicableRegions(damaged.getLocation());
            for (ProtectedRegion region : set) {
                String a = String.valueOf(region.getFlags());
                if (a.indexOf("StateFlag{name='pvp'}=DENY") != -1) {
                    pvp_status = false;
                    continue;
                }
                Axes(damager, damaged, e);
            }
            if (pvp_status)
                Axes(damager, damaged, e);
        }
    }

    public void Axes(Player damager, Player damaged, EntityDamageByEntityEvent e) {
        if (damager.getItemInHand().getType().equals(Material.DIAMOND_AXE)) {
            String itemname = damager.getItemInHand().getItemMeta().getDisplayName();
            if (itemname.equals(Main.color("&7Blindness Axe"))) {
                damaged.addPotionEffect
                        (new PotionEffect(PotionEffectType.BLINDNESS, 140, 2, true));
                damaged.playEffect(damaged.getLocation(), Effect.POTION_BREAK, 1);
            }
            if (itemname.equals(Main.color("&9Wither Axe"))) {
                damaged.addPotionEffect
                        (new PotionEffect(PotionEffectType.WITHER, 200, 1, true));
                damaged.playEffect(damaged.getLocation(), Effect.POTION_BREAK, 1);
            }
            if (itemname.equals(Main.color("&bWeakness Axe"))) {
                damaged.addPotionEffect
                        (new PotionEffect(PotionEffectType.WEAKNESS, 120, 1, true));
                damaged.playEffect(damaged.getLocation(), Effect.POTION_BREAK, 1);
            }
            if (itemname.equals(Main.color("&cPoison Axe"))) {
                damaged.addPotionEffect
                        (new PotionEffect(PotionEffectType.POISON, 140, 1, true));
                damaged.playEffect(damaged.getLocation(), Effect.POTION_BREAK, 1);
            }
            if (itemname.equals(Main.color("&5Strength Axe"))) {
                damager.addPotionEffect
                        (new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 1, true));
                damaged.playEffect(damaged.getLocation(), Effect.POTION_BREAK, 1);
            }
        }
    }
}
