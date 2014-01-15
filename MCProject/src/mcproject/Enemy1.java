package mcproject;

import jgame.ImageCache;

public class Enemy1 extends Enemy {

	public Enemy1() {
		super(ImageCache.getImage("notes/note1.png"));
		
	}
	   public double getSlowness() {
           
          return 3.5;
   }
	

}