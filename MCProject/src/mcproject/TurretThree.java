package mcproject;

import java.awt.Image;

import jgame.ImageCache;

public class TurretThree extends Turret {

	 public TurretThree(Image i) 
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
