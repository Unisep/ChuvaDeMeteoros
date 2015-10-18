/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GameBuilder;

import java.io.File;

/**
 *
 * @author Administrador
 */
public class GameSound {
    private String path;
    private boolean soundEnable;
    private AudioPlayer audioPlayer;
    
    
    public GameSound(String path) {
        this.path = path;
        soundEnable = true;
        //audioPlayer = new AudioPlayer(new File(path));
        audioPlayer = new AudioPlayer(path);
    }
    
    public String getGameSoundPath() {
        return path;
    }    
    
    public boolean getGameSoundEnable() {
        return soundEnable;
    }
    
    public AudioPlayer getAudioPlayer() 
    {
        return audioPlayer;
    }
    
    public void setGameSoundPath(String path) {
        this.path = path;
    }
    
    public void setGameEnableSound(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }
    
    public void setAudioPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }
    
    public void GameSoundPlayWav() {
        audioPlayer.play();
    }
    
    public void GameSoundLoopWav() {
        audioPlayer.loop();
    }
    
    public void GameSoundStopWav() {
        audioPlayer.stop();
    }
}