package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class level_1 implements Screen {
    private MyGdxGame game;
    private OrthographicCamera camera;
    private int screenWidth, screenHeight;
    private Viewport viewport;
    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer maprenderer;








    public void update(float delta) {}
    private void handleInput(float delta) {}
    public level_1 (MyGdxGame game){}

    public void getScreenWidth() {
        screenWidth = 1024;
        screenHeight = 768;


        screenWidth = Gdx.graphics.getWidth();
        screenHeight = Gdx.graphics.getHeight();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, MyGdxGame.G_WIDTH, MyGdxGame.G_HEIGHT);
        viewport = new FitViewport(screenWidth, screenHeight);

        mapLoader = new TmxMapLoader();
        map = mapLoader.load("map1");
        maprenderer = new OrthogonalTiledMapRenderer(map);
        camera.position.set(viewport.getWorldWidth() / 2, viewport.getWorldHeight() / 2, 0);

    }


    @Override public void show(){
        //show your screen here
    }
    public void render(float delta) {
        //draw screen here. delta is the last time screen is refreshed in seconds
        update(delta);
        ScreenUtils.clear(1f, 1f, 1f , 1);//refreshes the screen
        maprenderer.render();

    }
    @Override public void resize(int width, int height){
        //resizes the game
    }
    @Override public void pause(){
        //this method pauses the game
    }
    @Override public void resume(){
        //this method is called when the game resumes after being paused
    }
    @Override public void hide(){
        //this method is called when another screen replaces this
    }
    @Override public void dispose(){
        //Destroy screen assets here
    }

}
