package mcproject;

import jgame.ImageCache;

public class Enemy2 extends Enemy {

	public Enemy2() {
		super(ImageCache.getImage("notes/note2.png"));
		
	}
    public double getSlowness() {
        
        return 4.5;
    }
}


