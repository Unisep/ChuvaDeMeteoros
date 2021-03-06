package GameBuilder;

import GameBuilder.GameComponent;
import java.util.ArrayList;

public class ReadKeyboard implements Runnable {
    
    private final ArrayList<GameComponent> gameComponents;
    private final DrawPanel drawPanel;
    private final boolean[] onKeys = new boolean[256];
    
    
    public ReadKeyboard (ArrayList<GameComponent> gameComponents,DrawPanel drawPanel) {
        this.gameComponents = gameComponents;
        this.drawPanel = drawPanel;
    }

    public void run() {
        do {
            if (KeyBoard.EstaPressionada(222)) {                
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(222))
                        gameComponents.get(i).GameComponentAction(222);
            }
            if (KeyBoard.EstaPressionada(9)) {                
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(9))
                        gameComponents.get(i).GameComponentAction(9);
            }
            if (KeyBoard.EstaPressionada(16)) {                
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(16))
                        gameComponents.get(i).GameComponentAction(16);
            }
            if (KeyBoard.EstaPressionada(17)) {                
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(17))
                        gameComponents.get(i).GameComponentAction(17);
            }
            if (KeyBoard.EstaPressionada(18)) {                
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(18))
                        gameComponents.get(i).GameComponentAction(18);
            }
            if (KeyBoard.EstaPressionada(10)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(10))
                        gameComponents.get(i).GameComponentAction(10);
            }
            if (KeyBoard.EstaPressionada(61)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(61))
                        gameComponents.get(i).GameComponentAction(61);
            }
            if (KeyBoard.EstaPressionada(8)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(8))
                        gameComponents.get(i).GameComponentAction(8);
            }
            if (KeyBoard.EstaPressionada(109)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(109))
                        gameComponents.get(i).GameComponentAction(109);
            }
            if (KeyBoard.EstaPressionada(45)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(45))
                        gameComponents.get(i).GameComponentAction(45);
            }
            if (KeyBoard.EstaPressionada(20)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(20))
                        gameComponents.get(i).GameComponentAction(20);
            }
            if (KeyBoard.EstaPressionada(112)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(112))
                        gameComponents.get(i).GameComponentAction(112);
            }
            if (KeyBoard.EstaPressionada(113)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(113))
                        gameComponents.get(i).GameComponentAction(113);
            }
            if (KeyBoard.EstaPressionada(114)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(114))
                        gameComponents.get(i).GameComponentAction(114);
            }
            if (KeyBoard.EstaPressionada(115)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(115))
                        gameComponents.get(i).GameComponentAction(115);
            }
            if (KeyBoard.EstaPressionada(116)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(116))
                        gameComponents.get(i).GameComponentAction(116);
            }
            if (KeyBoard.EstaPressionada(117)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(117))
                        gameComponents.get(i).GameComponentAction(117);
            }
            if (KeyBoard.EstaPressionada(118)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(118))
                        gameComponents.get(i).GameComponentAction(118);
            }
            if (KeyBoard.EstaPressionada(119)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(119))
                        gameComponents.get(i).GameComponentAction(119);
            }
            if (KeyBoard.EstaPressionada(120)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(120))
                        gameComponents.get(i).GameComponentAction(120);
            }
            if (KeyBoard.EstaPressionada(121)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(121))
                        gameComponents.get(i).GameComponentAction(121);
            }
            if (KeyBoard.EstaPressionada(122)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(122))
                        gameComponents.get(i).GameComponentAction(122);
            }
            if (KeyBoard.EstaPressionada(123)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(123))
                        gameComponents.get(i).GameComponentAction(123);
            }
            if (KeyBoard.EstaPressionada(48)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(48))
                        gameComponents.get(i).GameComponentAction(48);
            }
            if (KeyBoard.EstaPressionada(49)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(49))
                        gameComponents.get(i).GameComponentAction(49);
            }
            if (KeyBoard.EstaPressionada(50)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(50))
                        gameComponents.get(i).GameComponentAction(50);
            }
            if (KeyBoard.EstaPressionada(51)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(51))
                        gameComponents.get(i).GameComponentAction(51);
            }
            if (KeyBoard.EstaPressionada(52)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(52))
                        gameComponents.get(i).GameComponentAction(52);
            }
            if (KeyBoard.EstaPressionada(53)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(53))
                        gameComponents.get(i).GameComponentAction(53);
            }
            if (KeyBoard.EstaPressionada(54)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(54))
                        gameComponents.get(i).GameComponentAction(54);
            }
            if (KeyBoard.EstaPressionada(55)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(55))
                        gameComponents.get(i).GameComponentAction(55);
            }
            if (KeyBoard.EstaPressionada(56)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(56))
                        gameComponents.get(i).GameComponentAction(56);
            }
            if (KeyBoard.EstaPressionada(57)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(57))
                        gameComponents.get(i).GameComponentAction(57);
            }
            if (KeyBoard.EstaPressionada(65)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(65))
                        gameComponents.get(i).GameComponentAction(65);
            }
            if (KeyBoard.EstaPressionada(66)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(66))
                        gameComponents.get(i).GameComponentAction(66);
            }
            if (KeyBoard.EstaPressionada(67)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(67))
                        gameComponents.get(i).GameComponentAction(67);
            }
            if (KeyBoard.EstaPressionada(68)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(68))
                        gameComponents.get(i).GameComponentAction(68);
            }
            if (KeyBoard.EstaPressionada(69)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(69))
                        gameComponents.get(i).GameComponentAction(69);
            }
            if (KeyBoard.EstaPressionada(70)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(70))
                        gameComponents.get(i).GameComponentAction(70);
            }
            if (KeyBoard.EstaPressionada(71)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(71))
                        gameComponents.get(i).GameComponentAction(71);
            }
            if (KeyBoard.EstaPressionada(72)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(72))
                        gameComponents.get(i).GameComponentAction(72);
            }
            if (KeyBoard.EstaPressionada(73)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(73))
                        gameComponents.get(i).GameComponentAction(73);
            }
            if (KeyBoard.EstaPressionada(74)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(74))
                        gameComponents.get(i).GameComponentAction(74);
            }
            if (KeyBoard.EstaPressionada(75)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(75))
                        gameComponents.get(i).GameComponentAction(75);
            }
            if (KeyBoard.EstaPressionada(76)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(76))
                        gameComponents.get(i).GameComponentAction(76);
            }
            if (KeyBoard.EstaPressionada(77)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(77))
                        gameComponents.get(i).GameComponentAction(77);
            }
            if (KeyBoard.EstaPressionada(78)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(78))
                        gameComponents.get(i).GameComponentAction(78);
            }
            if (KeyBoard.EstaPressionada(79)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(79))
                        gameComponents.get(i).GameComponentAction(79);
            }
            if (KeyBoard.EstaPressionada(80)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(80))
                        gameComponents.get(i).GameComponentAction(80);
            }
            if (KeyBoard.EstaPressionada(81)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(81))
                        gameComponents.get(i).GameComponentAction(81);
            }
            if (KeyBoard.EstaPressionada(82)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(82))
                        gameComponents.get(i).GameComponentAction(82);
            }
            if (KeyBoard.EstaPressionada(83)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(83))
                        gameComponents.get(i).GameComponentAction(83);
            }
            if (KeyBoard.EstaPressionada(84)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(84))
                        gameComponents.get(i).GameComponentAction(84);
            }
            if (KeyBoard.EstaPressionada(85)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(85))
                        gameComponents.get(i).GameComponentAction(85);
            }
            if (KeyBoard.EstaPressionada(86)) {
                for(int i=0; i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(86))
                            gameComponents.get(i).GameComponentAction(86);
            }
            if (KeyBoard.EstaPressionada(87)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(87))
                        gameComponents.get(i).GameComponentAction(87);
            }
            if (KeyBoard.EstaPressionada(88)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(88))
                        gameComponents.get(i).GameComponentAction(88);
            }
            if (KeyBoard.EstaPressionada(89)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(89))
                        gameComponents.get(i).GameComponentAction(89);
            }
            if (KeyBoard.EstaPressionada(90)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(90))
                        gameComponents.get(i).GameComponentAction(90);
            }
            if (KeyBoard.EstaPressionada(40)) {                
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(40))
                        gameComponents.get(i).GameComponentAction(40);
            }
            if (KeyBoard.EstaPressionada(39)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(39))
                        gameComponents.get(i).GameComponentAction(39);
            }
            if (KeyBoard.EstaPressionada(37)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(37))
                        gameComponents.get(i).GameComponentAction(37);
            }
            if (KeyBoard.EstaPressionada(38)) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(38))
                        gameComponents.get(i).GameComponentAction(38);              
            }
            if (KeyBoard.nenhumaPressionada()) {
                for(int i=0;i<gameComponents.size();i++)
                    if(gameComponents.get(i).getGameComponentKeyAction(0))
                        gameComponents.get(i).GameComponentAction(0);               
            }
            
            for(int i=0;i<gameComponents.size();i++)
                if(gameComponents.get(i).getGameComponentNoActionKey())
                    gameComponents.get(i).GameComponentAction(255); 
            
            drawPanel.repaint();
            
            try {
                Thread.sleep(1);
            } catch (Exception ex) {ex.printStackTrace();}
        } while (!KeyBoard.EstaPressionada(27));
        System.exit(0);
    }
}