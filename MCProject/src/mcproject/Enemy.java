package mcproject;

import java.awt.Image;
import java.awt.Polygon;

import jgame.GSprite;
import jgame.controller.PolygonController;
import jgame.controller.PulsateController;
import jgame.listener.BoundaryRemovalListener;

public abstract class Enemy extends GSprite {

	public Enemy(Image image) {
		
		super(image);
		int[] x = new int[] { 458, 480, 506, 532, 557, 582, 608, 634, 660, 686,
				712, 738, 763, 788, 814, 839, 862, 843, 818, 793, 766, 740,
				715, 688, 662, 636, 611, 585, 558, 533, 506, 482, 457, 432,
				407, 382, 357, 332, 307, 281, 256, 230, 204, 179, 153, 128,
				102, 77, 52, 57, 83, 108, 134, 159, 184, 210, 235, 252, 275,
				300, 326, 351, 361, 386, 411, 437, 462, 474, 488, 502, 510,
				520, 526, 532, 535, 533, 546 };
		int[] y = new int[] { 343, 356, 356, 357, 360, 361, 362, 364, 364, 366,
				366, 366, 373, 379, 381, 384, 396, 413, 419, 423, 423, 426,
				431, 432, 432, 432, 433, 433, 432, 428, 421, 412, 406, 399,
				392, 385, 378, 371, 368, 366, 365, 365, 365, 366, 369, 372,
				376, 382, 388, 413, 413, 416, 417, 423, 431, 435, 441, 460,
				470, 468, 468, 475, 498, 497, 494, 494, 498, 520, 541, 563,
				587, 611, 636, 661, 687, 712, 734 };
		
		Polygon p = new Polygon(x, y, 77);
		PolygonController pc = new PolygonController(p);
		pc.goToStart(this);
		addController(pc);
		BoundaryRemovalListener bd = new BoundaryRemovalListener();
		PulsateController pc1 = new PulsateController(0.8, 0.2, 30);
		pc1.setProperties(PulsateController.SCALE, PulsateController.ALPHA);
		addListener(bd);
		addController(pc1);
	}

}
