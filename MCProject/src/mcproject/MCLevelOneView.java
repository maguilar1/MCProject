package mcproject;

import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.ImageCache;
import jgame.controller.MouseLocationController;
import jgame.listener.LocalClickListener;

public class MCLevelOneView extends GContainer {

	private l1PlayArea pal1 = new l1PlayArea();
	private MenuArea ma = new MenuArea();
	private InfoArea ia = new InfoArea();

	private boolean settingTurret;

	public MCLevelOneView() {

		// Play Area
		setSize(900, 700);
		pal1.setAnchorTopLeft();
		pal1.setLocation(100, 0);
		add(pal1);

		// Menu Area
		ma.setAnchorTopLeft();
		ma.setLocation(0, 0);
		add(ma);

		// Info Area
		ia.setAnchorTopLeft();
		ia.setLocation(0, 600);
		add(ia);
	}

	public void initializeTurret(int tn) {
		if (settingTurret) {
			return;
		}
		settingTurret = true;
		TurretOne t1 = new TurretOne();
		Turret t = chooseTurret(tn);
		this.pal1.addAtCenter(t);
		final MouseLocationController mlc = new MouseLocationController();
		t.addController(mlc);
		final LocalClickListener dropListener = new LocalClickListener() {
			public void invoke(GObject target, Context context) {
				target.removeController(mlc);
				target.removeListener(this);
				settingTurret = false;
			}
		};
		t.addListener(dropListener);
	}

	public Turret chooseTurret(int turretNumber) {
		switch (turretNumber) {
		case 0:
			return new TurretOne();
		case 1:
			return new TurretTwo();
		case 2:
			return new TurretThree();
		case 3:
			return new TurretFour();
		case 4:
			return new TurretFive();
		default:
			return null;
		}

	}

}

