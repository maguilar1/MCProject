package mcproject;

import java.awt.Image;

import jgame.ImageCache;

public  class TurretTwo extends Turret {

	
		 public TurretTwo() 
		 {
		  super(ImageCache.getImage("turrets/d2.png"));
		 }
	
		 public Bullet createBullet() 
		 {
		  return new Bullet(ImageCache.getImage("bullets/b2.png"));
		 }
		
		 public double getBulletSpeed() 
		 {
		  return 30;
		 
		}

		
}
