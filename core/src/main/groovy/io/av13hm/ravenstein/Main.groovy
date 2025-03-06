package io.av13hm.ravenstein;

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

class Main extends Game {
    static SpriteBatch batch

    @Override
    void create() {
        setScreen(new Simple());
    }

    @Override
    void render() {
        Gdx.gl20.glViewport( 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight() );
        Gdx.gl20.glClearColor( 0f, 0.45f, 0.45f, 1f );
        Gdx.gl20.glClear( Gdx.gl20.GL_COLOR_BUFFER_BIT | Gdx.gl20.GL_DEPTH_BUFFER_BIT );

        super.render()
    }
}
