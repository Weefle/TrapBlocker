package fr.weefle.trapblocker;

import org.bukkit.Material;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class TrapBlockerListener implements Listener {
	
	@EventHandler
	public void onBlockClick(PlayerInteractEvent e) {
		
		if(!e.getPlayer().isOp()) {
			
		if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			
		
		if(e.getClickedBlock().getType().equals(Material.TRAP_DOOR)
				|| e.getClickedBlock().getType().equals(Material.ACACIA_DOOR) 
				|| e.getClickedBlock().getType().equals(Material.SPRUCE_DOOR) 
				|| e.getClickedBlock().getType().equals(Material.JUNGLE_DOOR)
				|| e.getClickedBlock().getType().equals(Material.BIRCH_DOOR) 
				|| e.getClickedBlock().getType().equals(Material.DARK_OAK_DOOR)
				|| e.getClickedBlock().getType().equals(Material.WOOD_BUTTON)
				|| e.getClickedBlock().getType().equals(Material.WOODEN_DOOR)
				|| e.getClickedBlock().getType().equals(Material.STONE_BUTTON)
				|| e.getClickedBlock().getType().equals(Material.ACACIA_FENCE_GATE)
				|| e.getClickedBlock().getType().equals(Material.SPRUCE_FENCE_GATE)
				|| e.getClickedBlock().getType().equals(Material.JUNGLE_FENCE_GATE)
				|| e.getClickedBlock().getType().equals(Material.BIRCH_FENCE_GATE)
				|| e.getClickedBlock().getType().equals(Material.DARK_OAK_FENCE_GATE)
				|| e.getClickedBlock().getType().equals(Material.FENCE_GATE)
				|| e.getClickedBlock().getType().equals(Material.LEVER)){
			e.setCancelled(true);
		}else {
			return;
		}
			}
		}
		
		
	}
	
	@EventHandler
	public void onEntityClick(PlayerInteractEntityEvent e) {
		
		if(!e.getPlayer().isOp()) {
				
			
			if(e.getRightClicked() instanceof ItemFrame) {
				e.setCancelled(true);
			}else {
				return;
			}
			}
		
	}
	
	@EventHandler
	public void onEntityHanging(HangingBreakByEntityEvent e) {
		
if(!e.getRemover().isOp()) {
				
			
			if(e.getEntity() instanceof ItemFrame) {
				e.setCancelled(true);
			}else {
				return;
			}
			}
		
	}
	
	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent e) {
		
if(!e.getDamager().isOp()) {
				
			
			if(e.getEntity() instanceof ItemFrame) {
				e.setCancelled(true);
			}else {
				return;
			}
			}
		
	}
		
	}