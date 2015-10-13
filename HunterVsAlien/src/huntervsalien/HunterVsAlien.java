/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huntervsalien;

import GameBuilder.*;
import java.util.ArrayList;

/**
 *
 * @author freeman
 */
public class HunterVsAlien {

    static ArrayList<GameComponent> gameComponent;
    static ArrayList<GameSound> gameSound;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gameComponent = new ArrayList<GameComponent>();
        gameSound = new ArrayList<GameSound>();
        
        gameComponent.add(new BackGround());
        gameComponent.add(new Hunter());
        gameComponent.add(new Alien());
        
        new GameBuilder.NewGame().buildGame("Hunter vs Alien", gameComponent, gameSound);
    }
    
}
