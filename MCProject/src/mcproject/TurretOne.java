package mcproject;

import java.awt.Image;

import jgame.ImageCache;

public class TurretOne extends Turret {

	
		 public TurretOne(Image image) 
		 {
		  super(image);
		 }
		
		 public Bullet createBullet() 
		 {
		  return new Bullet(ImageCache.getImage("bullets/.png"));
		 }
		
		 public double getBulletSpeed() 
		 {
		  return 30;
		 }
	}