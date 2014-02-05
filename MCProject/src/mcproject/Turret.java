package mcproject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.controller.ConstantMovementController;
import jgame.listener.FrameListener;

public abstract class Turret extends GSprite {
	
	
		int FireDelay = 20;

	private int counter = 5;

		public Turret(Image image) {
			super(image);
			setScale(1.0);
			this.setPlaying(false);
			this.addListener(new FrameListener() {

				public void invoke(GObject target, Context context) {

					FireDelay --;

					//target.face(getParent().getWidth() / 2,
						//	getParent().getHeight() / 2);
					//target.setRotation(target.getRotation());
					
					

					if(FireDelay <0){

					 fireBullet(FireDelay);

					FireDelay = 30;
					}
			}
			
			});
		}
		
	
	
	
	public abstract Bullet createBullet();

    public abstract double getBulletSpeed();

  

    public void fireBullet(double ate) {
            final Bullet b = createBullet();
            b.setRotation(ate);

            final ConstantMovementController c = ConstantMovementController
                            .createPolar(getBulletSpeed(), ate); // ate = angle to enemy
            b.addController(c);
            snapAnchor(b);
            b.moveAtAngle(getScaleX() * (getWidth() / 2) + 3, ate);
            b.setScale(.8);
            this.addSibling(b);
    }

} 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
 * 	
	int FireDelay = 20;

private int counter = 5;

	public Turret(Image image) {
		super(image);
		setScale(1.0);
		this.setPlaying(false);
		this.addListener(new FrameListener() {

			public void invoke(GObject target, Context context) {

				FireDelay --;

				//target.face(getParent().getWidth() / 2,
					//	getParent().getHeight() / 2);
				//target.setRotation(target.getRotation());
				
				

				if(FireDelay <0){

				 fireBullet(FireDelay);

				FireDelay = 30;
				}
		}
		
		});
	}
	

	public abstract Bullet createBullet();

	public abstract double getBulletSpeed();


	public void fireBullet(){
		
		final Bullet b = createBullet();
		b.setRotation(this.getRotation());

		final ConstantMovementController c = ConstantMovementController
				.createPolar(getBulletSpeed(), getRotation());
		b.addController(c);
		snapAnchor(b);
		b.moveAtAngle(getWidth() / 2 + 50, getRotation());
		this.addSibling(b);

	}
		
		
}*/