package org.example.patterns.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FormatAdapter implements AudioPlayer {

    private final WmaAudioPlayer wmaAudioPlayer;


    @Override
    public void playAudio() {
        wmaAudioPlayer.playAudio();
    }
}
