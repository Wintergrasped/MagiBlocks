package net.chair.wmcsn.winter;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MainClass extends JavaPlugin implements Listener {

	public boolean ST = false;
	public boolean TT = false;
	public boolean TTS = false;
	public Location loc = new Location(Bukkit.getWorld("world"), 5640, 27, 1846);

	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onMove(PlayerMoveEvent e) {

		double Y = e.getPlayer().getLocation().getY() - 1;

		Location loc = e.getPlayer().getLocation();

		Location N = loc.add(0, -1, 0);
		if (e.getPlayer().isOp()) {

		} else {
			if (N.getBlock().getType().equals(Material.GOLD_BLOCK)) {
				if (ST == false) {
					if (TT == false) {
						e.getPlayer().playEffect(e.getPlayer().getLocation(),
								Effect.POTION_BREAK, 0);
						e.getPlayer().setGameMode(GameMode.SURVIVAL);
						e.getPlayer().addPotionEffect(
								new PotionEffect(PotionEffectType.BLINDNESS,
										10, 10000));
						e.getPlayer().addPotionEffect(
								new PotionEffect(PotionEffectType.CONFUSION,
										10, 10000));
						e.getPlayer().addPotionEffect(
								new PotionEffect(PotionEffectType.HUNGER, 10,
										100000));
						e.getPlayer().damage(19);
						e.getPlayer().sendMessage(
								ChatColor.GOLD + "" + ChatColor.BOLD
										+ "GET OFF MY CHAIR! NOW!");
						TT = true;
						// Bukkit.broadcastMessage(ChatColor.GREEN + "" +
						// e.getPlayer().getName() + "" + ChatColor.AQUA + "" +
						// " Stepped on an Admin block (Retard)");
						setTT();
					}
				} else {
					if (ST == true) {
						ST = false;
					}
				}
			} else {
				if (ST == true) {
					ST = false;
				}
				if (N.getBlock().getType().equals(Material.ENDER_STONE)) {
					loc = new Location(Bukkit.getWorld("world"), 5640, 27, 1846);
					if (ST == false) {
						if (TTS == false) {
							e.getPlayer().playEffect(
									e.getPlayer().getLocation(),
									Effect.POTION_BREAK, 0);
							e.getPlayer().teleport(loc);
							Bukkit.dispatchCommand(Bukkit.getServer()
									.getConsoleSender(), "tokengive "
									+ e.getPlayer().getName() + " 5");
							Bukkit.dispatchCommand(Bukkit.getServer()
									.getConsoleSender(), "spawn "
									+ e.getPlayer().getName());
							e.getPlayer().teleport(loc);
							TTS = true;
							e.getPlayer().teleport(loc);
							Bukkit.broadcastMessage(ChatColor.GREEN
									+ ""
									+ e.getPlayer().getName()
									+ ""
									+ ChatColor.AQUA
									+ ""
									+ " Completed The Parkour And Recived 5 Tokens!");
							e.getPlayer().teleport(loc);
							setTTS();
							e.getPlayer().teleport(loc);
						}
					} else {
						if (ST == true) {
							ST = false;
						}
					}
				} else {
					if (ST == true) {
						ST = false;
					}
				}
			}
			if (ST == true) {
				ST = false;
			}
		}
		if (N.getBlock().getType().equals(Material.DIAMOND_BLOCK)) {
			if (ST == false) {
				if (ST == false) {
					e.getPlayer().setHealth(20);
					e.getPlayer().setSaturation(50);
					e.getPlayer().playEffect(e.getPlayer().getLocation(),
							Effect.POTION_BREAK, 0);
				}
			} else {
				if (ST == true) {
					ST = false;
				}
			}
		} else {
			if (ST == true) {
				ST = false;
			}
		}

		if (N.getBlock().getType().equals(Material.BEDROCK)) {
			if (ST == false) {
				if (ST == false) {
					ST = true;
					if (e.getPlayer().getName().equals("Wintergrasped")) {
						e.getPlayer().setHealth(20.0);
					} else {
						e.getPlayer().setHealth(0);
						e.getPlayer().playEffect(e.getPlayer().getLocation(),
								Effect.POTION_BREAK, 0);
					}
				}
			} else {
				if (ST == true) {
					ST = false;
				}
			}
		} else {
			if (ST == true) {
				ST = false;
			}
		}

		if (N.getBlock().getType().equals(Material.BED_BLOCK)) {
			if (ST == false) {
				if (ST == false) {
					e.getPlayer().setSaturation(50);
					e.getPlayer().playEffect(e.getPlayer().getLocation(),
							Effect.POTION_BREAK, 0);
				}
			} else {
				if (ST == true) {
					ST = false;
				}
			}
		} else {
			if (ST == true) {
				ST = false;
			}
		}

		if (N.getBlock().getType().equals(Material.EMERALD_ORE)) {
			if (ST == false) {
				if (ST == false) {
					e.getPlayer().playSound(e.getPlayer().getLocation(),
							Sound.AMBIENCE_THUNDER, 10, 10);
					e.getPlayer().playEffect(e.getPlayer().getLocation(),
							Effect.POTION_BREAK, 0);
					e.getPlayer().addPotionEffect(
							new PotionEffect(PotionEffectType.JUMP, 10, 200));
				}
			} else {
				if (ST == true) {
					ST = false;
				}
			}

			if (N.getBlock().getType().equals(Material.REDSTONE_BLOCK)) {
				if (ST == false) {
					if (ST == false) {
						e.getPlayer().playSound(e.getPlayer().getLocation(),
								Sound.AMBIENCE_THUNDER, 100, 100);
						Bukkit.getServer().dispatchCommand(
								Bukkit.getConsoleSender(),
								"smite " + e.getPlayer().getName());
						e.getPlayer()
								.addPotionEffect(
										new PotionEffect(PotionEffectType.HEAL,
												200, 1));
						e.getPlayer().addPotionEffect(
								new PotionEffect(PotionEffectType.REGENERATION,
										200, 1));
						e.getPlayer()
								.addPotionEffect(
										new PotionEffect(PotionEffectType.JUMP,
												200, 1));
						e.getPlayer().addPotionEffect(
								new PotionEffect(PotionEffectType.SPEED, 200,
										10));
						e.getPlayer().addPotionEffect(
								new PotionEffect(
										PotionEffectType.INCREASE_DAMAGE, 200,
										1));
						e.getPlayer().sendMessage("You Fela DA POWER!");

					}
				} else {
					if (ST == true) {
						ST = false;
					}
				}
			} else {
				if (ST == true) {
					ST = false;
				}
			}
		}
	}

	public void setTT() {
		Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
			public void run() {
				TT = false;
				TTS = false;
			}
		}, 40);
	}

	public void setTTS() {
		Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
			public void run() {
				TTS = false;
			}
		}, 180);
	}
}
