package mcproject;

import jgame.ImageCache;

public class TurretFive extends Turret {

	public TurretFive() {
		super(ImageCache.getImage("turrets/d5.png"));
	}

	public Bullet createBullet() {
		return new Bullet(ImageCache.getImage("bullets/b1.png"));
	}

	public double getBulletSpeed() {
		return 1;
	}
}