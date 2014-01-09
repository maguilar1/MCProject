package mcproject;

import jgame.ButtonState;
import jgame.Context;
import jgame.GButton;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ButtonListener;
import mcproject.MusicConductor.View;

public class MCMenuView extends GContainer {

	public MCMenuView() {
		setSize(900, 700);

		MenuBackground bg = new MenuBackground();
		addAtCenter(bg);

		GSprite none_img = new GSprite(ImageCache.getImage("buttons/none1.png"));
		GSprite hover_img = new GSprite(ImageCache.getImage("buttons/hover1.png"));
		GSprite pressed_img = new GSprite(ImageCache.getImage("buttons/pressed1.png"));

		GSprite none_imgs = new GSprite(ImageCache.getImage("buttons/none2.png"));
		GSprite hover_imgs = new GSprite(ImageCache.getImage("buttons/hover2.png"));
		GSprite pressed_imgs = new GSprite(ImageCache.getImage("buttons/pressed2.png"));

		GSprite none_imge = new GSprite(ImageCache.getImage("buttons/none3.png"));
		GSprite hover_imge = new GSprite(ImageCache.getImage("buttons/hover3.png"));
		GSprite pressed_imge = new GSprite(ImageCache.getImage("buttons/pressed3.png"));
	

		GButton play_btn = new GButton();
		play_btn.setStateSprite(ButtonState.NONE, none_img);
		play_btn.setStateSprite(ButtonState.HOVERED, hover_img);
		play_btn.setStateSprite(ButtonState.PRESSED, pressed_img);
		addAt(play_btn, 100, 150);

		GButton play_btns = new GButton();
		play_btns.setStateSprite(ButtonState.NONE, none_imgs);
		play_btns.setStateSprite(ButtonState.HOVERED, hover_imgs);
		play_btns.setStateSprite(ButtonState.PRESSED, pressed_imgs);
		addAt(play_btns, 100, 300);
		
		GButton play_btne = new GButton();
		play_btne.setStateSprite(ButtonState.NONE, none_imge);
		play_btne.setStateSprite(ButtonState.HOVERED, hover_imge);
		play_btne.setStateSprite(ButtonState.PRESSED, pressed_imge);
		addAt(play_btne, 100, 450);

		ButtonListener play_btnlist = new ButtonListener() {

			public void mouseClicked(Context context) {
				super.mouseClicked(context);
				context.setCurrentGameView(View.LEVEL_ONE);
			}
		};
		play_btn.addListener(play_btnlist);
	}
	public void instructions(){
	}
	ButtonListener play_btnlist = new ButtonListener() {
	public void mouseClicked(Context context){
		super.mouseClicked(context);
		context.setCurrentGameView(View.MENU);
	}
	};
	//play_btn.addListener(play_btnlist);
}
