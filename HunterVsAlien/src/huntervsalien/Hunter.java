/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huntervsalien;

import GameBuilder.GameComponent;
import java.util.Arrays;

/**
 *
 * @author freeman
 */
public class Hunter extends GameBuilder.GameComponent{
    
    private boolean pular;
    private boolean topo;
    
    public Hunter() {
        super("hunter", "img/hunter/", 10, 0, 643, 25, 55, null, null);
        setGameComponentAddActionKey(keyZ);
        setGameComponentAddActionKey(keyRight);
        setGameComponentAddActionKey(keyLeft);
        setGameComponentAddActionKey(keyUp);
        setGameComponentAddActionKey(keyNoPressed);
        setGameComponentNoActionKey();
        pular = false;
        topo = false;
    }
    
    public void gravidade()
    {
        float y = getGameComponentPositionVertical();
        if(y < 643) {
            y+=0.2;
            setGameComponentPositionVertical(y);
        }
    }
    
    public void pulando(float y) {
        if(!topo) {
            y-=0.2;
        }
        else {
            y+=0.2;
        }
        if(y<=503)
            topo = true;
    }
    
    @Override
    public void GameComponentAction(int codAction) {
        float x = getGameComponentPositionHorizontal();
        float y = getGameComponentPositionVertical();
        
        if(GameComponentColision(this, gameComponents.get(2)))
        {
            gameComponents.remove(this);
        }
        
        if(pular)
            pulando(y);
        
        if(codAction == keyRight) {
            x+=0.2;
            setGameComponentPositionHorizontal(x);
            int sprite = getGameComponentCurrentSprite();
            //if(!GameComponentWait(100)) {
            if(!GameComponentWait(1,100)) {
                sprite = ++sprite % 9;
                this.setGameComponentCurrentSprite(sprite);
            }
        }
        if(codAction == keyLeft) {
            x-=0.2;
            setGameComponentPositionHorizontal(x);
        }
        if(codAction == keyNoPressed) {
            setGameComponentCurrentSprite(0);
        }
        if(codAction == keyUp) {
            pular = true;
            topo = false;
            setGameComponentRemoveActionKey(keyUp);
        }
        if(pular) {
            if(!topo && y>=543) {
                y-=0.2;
                setGameComponentPositionVertical(y);
                if(y<=543)
                    topo=true;
            }
            if(topo && y<=643) {
                y+=0.2;
                setGameComponentPositionVertical(y);
                if(y>=643)
                    setGameComponentAddActionKey(keyUp);
            }
        }
        
        if(codAction == keyZ) {
            if(!GameComponentWait(0,1000))
                gameComponents.add(new Shoot(gameComponents));
        }        
    }
}
