package mcproject;

import jgame.ImageCache;

public class TurretFour extends Turret {

		public TurretFour() {
			super(ImageCache.getImage("turrets/d4.png"));
		}

		public Bullet createBullet() {
			return new Bullet(ImageCache.getImage("bullets/b4.png"));
		}

		public double getBulletSpeed() {
			return 30;
		}
	}

