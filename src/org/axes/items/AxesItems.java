package org.axes.items;
import org.axes.Main;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AxesItems {

    public static ItemStack Blindness() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
        meta.setDisplayName(Main.color("&7Blindness Axe"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack Wither() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
        meta.setDisplayName(Main.color("&9Wither Axe"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack Weakness() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
        meta.setDisplayName(Main.color("&bWeakness Axe"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack Poison() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
        meta.setDisplayName(Main.color("&cPoison Axe"));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack Strength() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
        meta.setDisplayName(Main.color("&5Strength Axe"));
        item.setItemMeta(meta);
        return item;
    }
}
