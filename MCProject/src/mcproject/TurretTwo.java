package mcproject;

import java.awt.Image;

import jgame.ImageCache;

public class TurretTwo extends Turret {

	
		 public TurretTwo(Image i) 
		 {
		  super(i);
		 }
	
		 public Bullet createBullet() 
		 {
		  return new Bullet(ImageCache.getImage("bullets/.png"));
		 }
		
		 public double getBulletSpeed() 
		 {
		  return 0;
		 
		}
		
}
