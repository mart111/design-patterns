package org.example.patterns.adapter;

public class WmaAudioPlayerImpl implements WmaAudioPlayer {

    @Override
    public void playAudio() {
        System.out.println("Playing WMA Audio");
    }
}
