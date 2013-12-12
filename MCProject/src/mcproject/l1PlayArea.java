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

		BufferedImage bgi = ImageCache.getImage("areas/mcs1.png");
		GSprite gs = new GSprite(bgi);
		setBackgroundSprite(gs);

		TimerListener tl = new TimerListener(30) {

			@Override
			public void invoke(GObject target, Context context) {
				addRandomEnemy();
			}
		};
	}

	public void addRandomEnemy() {
		int i = (int) Math.random() * 1;
		Enemy e = new Enemy1();
		// if(1 > i){
		// e = new Enemy1();
		// }
		add(e);
	}
}
