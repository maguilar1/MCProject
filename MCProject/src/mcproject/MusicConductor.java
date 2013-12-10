package mcproject;

import java.awt.Color;
import java.awt.image.BufferedImage;


//import javax.swing.text.View;
import jgame.GRootContainer;
import jgame.GSprite;
import jgame.Game;
import jgame.ImageCache;
import jgame.SoundManager;
import jgame.listener.ButtonListener;

public class MusicConductor extends Game {

	public static void main(String[] args) {
		ImageCache.create(MusicConductor.class, "/mcproject/mcimages/");
		SoundManager.create(MusicConductor.class, "/mcproject/mcrsc/mcsounds/");
		MusicConductor mc = new MusicConductor();
		mc.startGame();
	}

	public MusicConductor() {
		GRootContainer root = new GRootContainer(Color.BLACK);
		setRootContainer(root);

		MCMenuView mcmv = new  MCMenuView();
		root.addView(View.MENU, mcmv);
		
		
		
		//MCLevelOneView mcl1v = new MCLevelOneView();
		//root.addView(View.LEVEL_ONE, mcl1v);

	}

	public enum View {
		MENU, LEVEL_ONE, GAME;
	}

	public static void addListener(ButtonListener play_btnlist) {
		
		
	}

}


