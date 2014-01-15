package mcproject;

import jgame.ImageCache;

public class Enemy4 extends Enemy {


	public Enemy4() {
		super(ImageCache.getImage("notes/note4.png"));
		
	}
	  public double getSlowness() {
          
         return 3;
	  }
}


