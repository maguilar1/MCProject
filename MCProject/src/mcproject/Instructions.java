package mcproject;

import java.awt.Color;
import java.awt.image.BufferedImage;

import mcproject.MusicConductor.View;
import jgame.ButtonState;
import jgame.Context;
import jgame.GButton;
import jgame.GContainer;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ButtonListener;

public class Instructions extends GContainer {

	public Instructions(){
	
	}

        public Instructions(Color color)
        {
                super(color);

        }

        public Instructions(GSprite sprite) 
        {
                super(sprite);

        }

        public Instructions(Color color, GSprite sprite) 
        {
                super(color, sprite);

        }
	
	}
