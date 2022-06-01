package com.deengames.slaythespire.easymode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import basemod.BaseMod;
import basemod.interfaces.ISubscriber;
import basemod.interfaces.StartActSubscriber;
import basemod.interfaces.StartGameSubscriber;

import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;

@SpireInitializer
public class UnmuzzledMod implements ISubscriber, StartGameSubscriber, StartActSubscriber {

	public static void initialize() {
        new UnmuzzledMod();
    }
	
	public UnmuzzledMod() {
		BaseMod.subscribe(this);
	}

	@Override
	public void receiveStartGame() {
	}

	@Override
	public void receiveStartAct() {
	}
}
