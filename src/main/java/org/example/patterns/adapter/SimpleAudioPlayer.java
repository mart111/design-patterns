package org.example.patterns.adapter;

public class SimpleAudioPlayer implements AudioPlayer {

    @Override
    public void playAudio() {
        System.out.println("Play MP3");
    }
}
