/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huntervsalien;

import GameBuilder.GameComponent;

/**
 *
 * @author freeman
 */
public class Alien extends GameComponent{
    
    public Alien() {
        super("Alien", "img/alien/", 5, 1000, 635, 30, 60, null, null);
        setGameComponentNoActionKey();
    }
    
    @Override
    public void GameComponentAction(int codAction) {
        float x = getGameComponentPositionHorizontal();
        x-=0.2;
        setGameComponentPositionHorizontal(x);
        int sprite = getGameComponentCurrentSprite();
        if(!GameComponentWait(100)) {
                sprite = ++sprite % 5;
                setGameComponentCurrentSprite(sprite);
            }
        if(x<=0)
            setGameComponentPositionHorizontal(1000);
    }    
}
