/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freemanproject;

import GameBuilder.GameComponent;

/**
 *
 * @author freeman
 */
public class BackGround extends GameComponent {
    
    public BackGround() {
        super("espaco", "img/background/", 3, 0, 0, 1024, 768, null, null);
        setGameComponentNoActionKey();
    }
    
    @Override
    public void GameComponentAction(int codAction) {
        GameComponentPlaySound(gameSounds.get(1), true);
    }
}
