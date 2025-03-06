package io.av13hm.ravenstein

import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.scenes.scene2d.Actor

import static io.av13hm.ravenstein.Main.batch

class Simple implements Screen{
    private Actor actor

    @Override
    void show() {
        batch = new SpriteBatch()
        actor = new Bob()
    }

    @Override
    void render(float delta) {
        batch.begin()

        actor.draw(batch,delta)

        batch.end()
    }

    @Override
    void resize(int width, int height) {

    }

    @Override
    void pause() {

    }

    @Override
    void resume() {

    }

    @Override
    void hide() {

    }

    @Override
    void dispose() {
        batch.dispose()
    }
}
