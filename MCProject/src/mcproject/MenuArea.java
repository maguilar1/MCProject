package mcproject;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class MenuArea extends GContainer {

	public MenuArea() {
		setSize(900, 700);
		this.setBackgroundColor(Color.black);

		BufferedImage bg1 = ImageCache.getImage("areas/menuarea.png");

		GSprite bgs = new GSprite(bg1);
		setBackgroundSprite(bgs);

		for (int i = 0; i < 5; i++) {
			setTile(i);
		}

	}

	List<Image> tileImages = ImageCache.getSequentialImages("turrets/d", 1, 5,
			".png");

	private void setTile(int i) {
		Tile tile = new Tile(tileImages.get(i), i);
		tile.setAnchorTopLeft();
		tile.setScale(0.9);
		tile.setX(4);
		tile.setY(110 * i + 15);
		add(tile);
		tile.setLocation(5, i * 115 + 25);
	}

	{

		/*
		 * if (settingTurret) { return; } settingTurret = true; // TurretOne t1
		 * = new // TurretOne(ImageCache.getImage("turrets/MCNote4.png"));
		 * Turret t = chooseTurret(tn); this.l1pa.addAtCenter(t); final
		 * MouseLocationController mlc = new MouseLocationController();
		 * t.addController(mlc); final LocalClickListener dropListener = new
		 * LocalClickListener() {
		 * 
		 * public void invoke(GObject target, Context context) {
		 * target.removeController(mlc); target.removeListener(this);
		 * settingTurret = false; } }; t.addListener(dropListener); }
		 * 
		 * public Turret chooseTurret(int turretNumber) { switch (turretNumber)
		 * { case 0: return new
		 * TurretOne(ImageCache.getImage("turrets/MCNote4.png")); case 1: return
		 * new TurretTwo(ImageCache.getImage("turrets/MCNote5.png")); case 2:
		 * return new TurretThree(ImageCache.getImage("turrets/MCNote6.png"));
		 * default: return null; }
		 */
	}
}