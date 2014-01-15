package mcproject;

import java.awt.Image;
import java.awt.Point;
import java.util.List;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.controller.ConstantRotationController;
import jgame.listener.BoundaryRemovalListener;
import jgame.listener.HitTestListener;

public class Bullet extends GSprite {
	public Bullet(Image image) {
		super(image);
		addListener(new BoundaryRemovalListener());
		
	}
}
	
/*
	public Bullet(Image image) {
		super(image);
		 addController(new ConstantRotationController(12));
         addListener(new BoundaryRemovalListener());
		
		HitTestListener htl = new HitTestListener(Enemy.class) {

			public void invoke(GObject target, Context context) {
				List<Enemy> enemies = context.hitTestClass(Enemy.class);
				
				for (Enemy e : enemies)
					e.changeHealthPoints(-10); // step 1
                if (e.getHealthPoints() <= 0) {
                        e.removeSelf(); // step 2
                        MCLevelOneView mclov = getFirstAncestorOf(MCLevelOneView.class);
                        mclov.changeMoneyBankValue(+50);
                }
            }
            target.removeSelf(); // step 3
    }
};
             addListener(htl);
             }
}

	public double getBd() {
		return bd;
	}

	public void setBd(double bd) {
		this.bd = bd;
	}

	public Point getInitialPosition() {
		return initialPosition;
	}

	public void setInitialPosition(Point initialPosition) {
		this.initialPosition = initialPosition;
	}

	}


*/


//public Bullet(Image image) {
	//super(image);
	//addListener(new BoundaryRemovalListener());