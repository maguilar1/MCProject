package mcproject;

import java.awt.Color;
import java.awt.image.BufferedImage;

import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.TimerListener;

public class l1PlayArea extends GContainer {

	public l1PlayArea() {

		setSize(900, 700);
		this.setBackgroundColor(Color.black);

		BufferedImage bgi = ImageCache.getImage("areas/mcs3.png");
		GSprite gs = new GSprite(bgi);
		setBackgroundSprite(gs);

		
		final TimerListener tl = new TimerListener(30) {

			
			public void invoke(GObject target, Context context) {
				addRandomEnemy();
			}
		};
		
		addListener(tl);
	}

	public void addRandomEnemy() {
		double num = Math.random()*5 + 1;
		int i = (int)num;
		//Enemy e = Enemy2();
		//System.out.println(" i = " + i);
		if(i==1){
			Enemy e = new Enemy1();
			add(e);
		 	}
		if(i==2){
			Enemy e = new Enemy2();
			add(e);
			 }
		if(i==3){
			Enemy e = new Enemy3();
			add(e);
			 }
		if(i==4){
			Enemy e = new Enemy4();
			add(e);
			 }
		if(i==5){
			Enemy e = new Enemy5();
			add(e);
			 }
		
		
		
	}
}
