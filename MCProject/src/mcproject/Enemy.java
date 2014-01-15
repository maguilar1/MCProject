package mcproject;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.image.BufferedImage;

import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.controller.PolygonController;
import jgame.controller.PulsateController;
import jgame.listener.BoundaryRemovalListener;
import jgame.listener.FrameListener;

public abstract class Enemy extends GSprite {

	
	public Enemy(Image image) {

		super(image);
		int[] x = new int[] { 454, 475, 501, 527, 553, 579, 606, 632, 658, 685,
				711, 736, 760, 777, 770, 748, 723, 697, 671, 644, 617, 591,
				564, 538, 512, 485, 460, 435, 408, 383, 358, 333, 307, 282,
				257, 231, 204, 176, 150, 125, 99, 74, 50, 55, 81, 107, 133,
				158, 183, 209, 234, 247, 262, 288, 315, 340, 358, 383, 409,
				435, 462, 478, 490, 503, 515, 529, 540, 548, 554, 561, 564 };
		int[] y = new int[] { 343, 358, 359, 362, 362, 362, 362, 362, 361, 359,
				359, 362, 370, 389, 414, 426, 430, 433, 433, 433, 433, 433,
				433, 433, 429, 419, 410, 405, 402, 398, 394, 391, 384, 379,
				374, 370, 370, 370, 367, 365, 365, 368, 377, 402, 411, 415,
				419, 421, 425, 425, 432, 455, 476, 476, 472, 469, 489, 495,
				495, 495, 495, 515, 538, 560, 582, 606, 632, 657, 683, 708, 733 };
		Polygon p = new Polygon(x, y, 71);
		PolygonController pc = new PolygonController(p);
		pc.goToStart(this);
		addController(pc);
		BoundaryRemovalListener bd = new BoundaryRemovalListener();
		PulsateController pc1 = new PulsateController(0.8, 0.2, 30);
		pc1.setProperties(PulsateController.SCALE, PulsateController.ALPHA);
		addListener(bd);
		addController(pc1);
		
		  //BoundaryRemovalListener brl = new BoundaryRemovalListener();
          
         // addListener(brl);
		}
	
}
	
	
	/*
    public abstract double getSlowness();

    @Override
    public void preparePaint(Graphics2D g) {
            super.preparePaint(g);
            GObject.antialias(g);
            goodImageTransforms(g);
    }

    public double getCurrentHealth() {
            return getCurrentHealth();
    }
/*
    public void setCurrentHealth(double currentHealth) {
            
            this.currentHealth = currentHealth;
            hb.setHealthPercentage(this.currentHealth / maxHealth);
            if (currentHealth <= 0) {
                    Bank.addMoney(kPs);
                    this.removeSelf();
            

            }
           

    }
	
/*
    private double maxHealthPoints = 100;
    private double currentHealth;
    HealthBar hb = new HealthBar();
	
    
    
    public Enemy(double maxHealthPoints) {
        super(ImageCache.getSequentialImages("notes/note", 1, 5,
                ".png" ));


        hb.setWidth(getWidth());
        addAtCenter(hb);
        hb.setY(this.getHeight() - hb.getHeight() / 2);
        hb.setHealthPercentage(1);

        
       
		int[] x = new int[] { 454, 475, 501, 527, 553, 579, 606, 632, 658, 685,
				711, 736, 760, 777, 770, 748, 723, 697, 671, 644, 617, 591,
				564, 538, 512, 485, 460, 435, 408, 383, 358, 333, 307, 282,
				257, 231, 204, 176, 150, 125, 99, 74, 50, 55, 81, 107, 133,
				158, 183, 209, 234, 247, 262, 288, 315, 340, 358, 383, 409,
				435, 462, 478, 490, 503, 515, 529, 540, 548, 554, 561, 564 };
		int[] y = new int[] { 343, 358, 359, 362, 362, 362, 362, 362, 361, 359,
				359, 362, 370, 389, 414, 426, 430, 433, 433, 433, 433, 433,
				433, 433, 429, 419, 410, 405, 402, 398, 394, 391, 384, 379,
				374, 370, 370, 370, 367, 365, 365, 368, 377, 402, 411, 415,
				419, 421, 425, 425, 432, 455, 476, 476, 472, 469, 489, 495,
				495, 495, 495, 515, 538, 560, 582, 606, 632, 657, 683, 708, 733 };
		Polygon p = new Polygon(x, y, 71);
		PolygonController pc = new PolygonController(p);
		pc.goToStart(this);
		addController(pc);
		BoundaryRemovalListener bd = new BoundaryRemovalListener();
		PulsateController pc1 = new PulsateController(0.8, 0.2, 30);
		pc1.setProperties(PulsateController.SCALE, PulsateController.ALPHA);
		addListener(bd);
		addController(pc1);
       
		FrameListener flCheckBounds = new FrameListener() {
                @Override
                public void invoke(GObject target, Context context) {
                        if (target.distanceTo(97, 296 + 250) < 3) {
                                getFirstAncestorOf(MCLevelOneView.class)
                                                .changeLifeBankValue(-10);
                                target.removeSelf();
                        }
                }
        };
        addListener(flCheckBounds);

        pc.goToStart(this);
        pc.setRotateToFollow(false);

        double slowness = getSlowness();
        pc.setMaxSpeed(slowness * 3);
        this.addController(pc);

        BoundaryRemovalListener brl = new BoundaryRemovalListener();
        this.addListener(brl);

}


 

		
	}
	/*
    public abstract double getSlowness();

    @Override
    public void preparePaint(Graphics2D g) {
            super.preparePaint(g);
            GObject.antialias(g);
            goodImageTransforms(g);
    }

    public double getCurrentHealth() {
            return getCurrentHealth();
    }
/*
    public void setCurrentHealth(double currentHealth) {
            
            this.currentHealth = currentHealth;
            hb.setHealthPercentage(this.currentHealth / maxHealth);
            if (currentHealth <= 0) {
                    Bank.addMoney(kPs);
                    this.removeSelf();
            

            }
           

    }
	
	
*/
