package io.av13hm.ravenstein

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.scenes.scene2d.Actor

class Bob extends Actor{
    private Texture texture

    Bob() {
        texture = new Texture(Gdx.files.internal('bob.png'))

        setName('Bob')
        setVisible(true)
        setPosition(150,150)
    }

    private float i = 1f
    @Override
    void draw(Batch batch, float parentAlpha) {
        batch.draw(texture,getX(),getY(),128,128)
        i+=1
        setX(i)
        setY(i)
    }
}
