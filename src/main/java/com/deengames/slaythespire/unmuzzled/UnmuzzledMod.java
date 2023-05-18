package com.deengames.slaythespire.unmuzzledmod;

import basemod.BaseMod;
import basemod.interfaces.ISubscriber;
import basemod.interfaces.StartActSubscriber;
import basemod.interfaces.StartGameSubscriber;

import com.megacrit.cardcrawl.blights.AbstractBlight;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;

@SpireInitializer
public class UnmuzzledMod implements ISubscriber, StartGameSubscriber, StartActSubscriber {

	private final String MUZZLED_BLIGHT_ID = "FullBelly";

	public static void initialize() {
        new UnmuzzledMod();
    }
	
	public UnmuzzledMod() {
		BaseMod.subscribe(this);
	}

	@Override
	public void receiveStartGame() {
		this.removeBlight(MUZZLED_BLIGHT_ID);
	}

	@Override
	public void receiveStartAct() {
		this.removeBlight(MUZZLED_BLIGHT_ID);
	}

	private void removeBlight(String blightId)
	{
		AbstractPlayer player = AbstractDungeon.player;
		player.blights.removeIf(blight -> blight.blightID.equals(blightId));
	}
}
