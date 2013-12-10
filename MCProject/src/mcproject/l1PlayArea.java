package mcproject;

import java.awt.Color;
import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class l1PlayArea extends GContainer {

	public l1PlayArea() {

		setSize(900, 700);
		this.setBackgroundColor(Color.black);
		
		BufferedImage bgi = ImageCache.getImage("areas/mcs1.png");
		GSprite gs = new GSprite(bgi);
		setBackgroundSprite(gs);

	}
}
