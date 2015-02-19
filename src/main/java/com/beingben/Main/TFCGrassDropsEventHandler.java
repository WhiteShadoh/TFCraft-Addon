package com.beingben.Main;

import java.util.Random;

import com.bioxx.tfc.api.TFCBlocks;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class TFCGrassDropsEventHandler {
	@SubscribeEvent
	public void onBlockBreak(HarvestDropsEvent event) 
	{
		if (event.harvester != null) {
			// Stops Crash
			if (event.harvester.getHeldItem() != null) {
				event.harvester.addChatMessage(new ChatComponentText("Test"));
				if (event.block == TFCBlocks.TallGrass) {
					Random rnd = new Random();
					int chance = rnd.nextInt(100);

						// 3%
					if (chance <= 1 && chance >= 3) {
						event.drops.add(new ItemStack(Items.wheat_seeds));
						// 5%
					} else if (chance <= 9 && chance >= 5) {
						event.drops.add(new ItemStack(Items.string));
						// 9%
					} else if (chance <= 19 && chance >= 11) {
						event.drops.add(new ItemStack(Items.bucket));
						// 15%
					} else if (chance <= 35 && chance >= 100) {
						event.drops.add(new ItemStack(Items.bone));
					} else {
						chance = 0;
					}
				}
			}
		}
	}
}
