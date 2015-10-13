/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

import sun.audio.AudioData;
import sun.audio.AudioDataStream;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class AudioPlayer {

    private AudioData audiodata;
    private AudioDataStream audiostream;
    private ContinuousAudioDataStream continuousaudiostream;

    public AudioPlayer(File wav) {
        try {
            FileInputStream fis = new FileInputStream(wav);
            AudioStream audioStream = new AudioStream(fis);
            audiodata = audioStream.getData();
            audiostream = null;
            continuousaudiostream = null;
        }catch(Exception ex) {ex.printStackTrace();}
    }
            
    public void playWav() {
        try {
            audiostream = new AudioDataStream(audiodata);
            sun.audio.AudioPlayer.player.start(audiostream);
        }catch(Exception ex) {ex.printStackTrace();}
    }
    
    public void loopWav() {
        try {
            continuousaudiostream = new ContinuousAudioDataStream(audiodata);
            sun.audio.AudioPlayer.player.start(continuousaudiostream);
        }catch(Exception ex) { ex.printStackTrace();}
    }

    public void stopWav() {
        try {
            if (audiostream != null)
                sun.audio.AudioPlayer.player.stop(audiostream);
            if (continuousaudiostream != null)
                sun.audio.AudioPlayer.player.stop(continuousaudiostream);
        }catch(Exception ex) {ex.printStackTrace();}
    }
}