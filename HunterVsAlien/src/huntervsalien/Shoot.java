/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huntervsalien;

import GameBuilder.GameComponent;
import java.util.ArrayList;

/**
 *
 * @author freeman
 */
public class Shoot extends GameComponent{
    
    public Shoot(ArrayList<GameComponent> gameComponents) {
        super("shoot", "img/shoot/", 1,
                gameComponents.get(1).getGameComponentPositionHorizontal()+30,
                gameComponents.get(1).getGameComponentPositionVertical()+20,
                50, 11, gameComponents, null);
        setGameComponentNoActionKey();
    }
    
    public void GameComponentAction(int codAction) {
        float x = getGameComponentPositionHorizontal();
        x+=0.4;
        setGameComponentPositionHorizontal(x);
    }
    
}
