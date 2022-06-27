package org.axes.commands;
import org.axes.Main;
import org.axes.items.AxesItems;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AxesCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length == 0) {
                if (p.hasPermission("redstonepvp.admin")) {
                    p.sendMessage(Main.color("&c[!] &7Correct usage: &c/axe <player> <type>"));
                }
                return true;
            }
            if (args.length == 1) {
                if (!args[0].equalsIgnoreCase(p.getName())) {
                    String target = args[0];
                    Player tar = Bukkit.getPlayer(target);
                    if (p.hasPermission("redstonepvp.admin")) {
                        if (tar != null) {
                            p.sendMessage(Main.color("&c[!] &7Correct usage: &c/axe <player> <type>"));
                        } else {
                            p.sendMessage(Main.color("&c[!] &7Player is not online."));
                        }
                    }
                    return true;
                } else {
                    p.sendMessage(Main.color("&c[!] &7Correct usage: &c/axe <player> <type>"));
                }
            }
            if (args.length == 2) {
                if (!args[0].equalsIgnoreCase(p.getName())) {
                    String target = args[0];
                    Player tar = Bukkit.getPlayer(target);
                    if (args[1].equalsIgnoreCase("blindness")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            if (tar != null) {
                                p.sendMessage(Main.color
                                        ("&c[!] &7Player successfully received a blindness axe."));
                                tar.getInventory().addItem(AxesItems.Blindness());
                            } else {
                                p.sendMessage(Main.color("&c[!] &7Player is not online."));
                            }
                        }
                    } if (args[1].equalsIgnoreCase("wither")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            if (tar != null) {
                                p.sendMessage(Main.color
                                        ("&c[!] &7Player successfully received a wither axe."));
                                tar.getInventory().addItem(AxesItems.Wither());
                            } else {
                                p.sendMessage(Main.color("&c[!] &7Player is not online."));
                            }
                        }
                    } if (args[1].equalsIgnoreCase("weakness")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            if (tar != null) {
                                p.sendMessage(Main.color
                                        ("&c[!] &7Player successfully received a weakness axe."));
                                tar.getInventory().addItem(AxesItems.Weakness());
                            } else {
                                p.sendMessage(Main.color("&c[!] &7Player is not online."));
                            }
                        }
                    } if (args[1].equalsIgnoreCase("poison")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            if (tar != null) {
                                p.sendMessage(Main.color
                                        ("&c[!] &7Player successfully received a poison axe."));
                                tar.getInventory().addItem(AxesItems.Poison());
                            } else {
                                p.sendMessage(Main.color("&c[!] &7Player is not online."));
                            }
                        }
                    } if (args[1].equalsIgnoreCase("strength")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            if (tar != null) {
                                p.sendMessage(Main.color
                                        ("&c[!] &7Player successfully received a strength axe."));
                                tar.getInventory().addItem(AxesItems.Strength());
                            } else {
                                p.sendMessage(Main.color("&c[!] &7Player is not online."));
                            }
                        }
                    } if (args[1].equalsIgnoreCase("all")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            if (tar != null) {
                                p.sendMessage(Main.color
                                        ("&c[!] &7Player successfully received all special axes."));
                                tar.getInventory().addItem(AxesItems.Blindness());
                                tar.getInventory().addItem(AxesItems.Wither());
                                tar.getInventory().addItem(AxesItems.Weakness());
                                tar.getInventory().addItem(AxesItems.Poison());
                                tar.getInventory().addItem(AxesItems.Strength());
                            } else {
                                p.sendMessage(Main.color("&c[!] &7Player is not online."));
                            }
                        }
                    }
                } else {
                    if (args[1].equalsIgnoreCase("blindness")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            p.sendMessage(Main.color
                                    ("&c[!] &7Successfully received a blindness axe."));
                            p.getInventory().addItem(AxesItems.Blindness());
                        }
                    } if (args[1].equalsIgnoreCase("wither")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            p.sendMessage(Main.color
                                    ("&c[!] &7Successfully received a wither axe."));
                            p.getInventory().addItem(AxesItems.Wither());
                        }
                    } if (args[1].equalsIgnoreCase("weakness")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            p.sendMessage(Main.color
                                    ("&c[!] &7Successfully received a weakness axe."));
                            p.getInventory().addItem(AxesItems.Weakness());
                        }
                    } if (args[1].equalsIgnoreCase("poison")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            p.sendMessage(Main.color
                                    ("&c[!] &7Successfully received a poison axe."));
                            p.getInventory().addItem(AxesItems.Poison());
                        }
                    } if (args[1].equalsIgnoreCase("strength")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            p.sendMessage(Main.color
                                    ("&c[!] &7Successfully received a strength axe."));
                            p.getInventory().addItem(AxesItems.Strength());
                        }
                    } if (args[1].equalsIgnoreCase("all")) {
                        if (p.hasPermission("redstonepvp.admin")) {
                            p.sendMessage(Main.color
                                    ("&c[!] &7Successfully received all special axes."));
                            p.getInventory().addItem(AxesItems.Blindness());
                            p.getInventory().addItem(AxesItems.Wither());
                            p.getInventory().addItem(AxesItems.Weakness());
                            p.getInventory().addItem(AxesItems.Poison());
                            p.getInventory().addItem(AxesItems.Strength());
                        }
                    }
                }
            }
            if (args.length > 2) {
                return true;
            }
        } else {
            sender.sendMessage("Only in-game command.");
            return true;
        }
        return true;
    }
}
