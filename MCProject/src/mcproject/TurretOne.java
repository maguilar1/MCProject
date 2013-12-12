package mcproject;

import java.awt.Image;

import jgame.ImageCache;

public class TurretOne extends Turret {

	public TurretOne() {
		super(ImageCache.getImage("turrets/d1.png"));
	}

	public Bullet createBullet() {
		return new Bullet(ImageCache.getImage("bullets/b1.png"));
	}

	public double getBulletSpeed() {
		return 50; 
	}
}