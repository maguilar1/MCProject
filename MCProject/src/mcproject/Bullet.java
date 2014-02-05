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
		addController(new ConstantRotationController(12));
		
		
		addListener(new BoundaryRemovalListener());

        HitTestListener htl = new HitTestListener(Enemy.class) {

			@Override
			public void invoke(GObject target, Context context) {
				// TODO Auto-generated method stub
				  List<Enemy> pl = context.hitTestClass(Enemy.class);
				  target.removeSelf(); 
			}
	

	};
	 addListener(htl);
	}
}