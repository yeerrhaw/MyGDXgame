package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends Game {
	SpriteBatch batch;
	Texture img;
	static final int G_WIDTH = 1024, G_HEIGHT= 768;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		setScreen(new level_1(this));
	}

	@Override
	public void render () {
		ScreenUtils.clear(1f, 1f, 1f , 1);


	}
	
	@Override
	public void dispose () {
		super.render();

	}
}
