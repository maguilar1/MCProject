package mcproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GMessage;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.FrameListener;

public class InfoArea extends GContainer {
	
	
    public InfoArea(){
    	
			setSize(800, 600);
			this.setBackgroundColor(Color.black);
			//get new picture
			BufferedImage bgi = ImageCache.getImage("areas/infoarea.png");
			GSprite gs = new GSprite(bgi);
			setBackgroundSprite(gs);
		}	
	}
	
    
