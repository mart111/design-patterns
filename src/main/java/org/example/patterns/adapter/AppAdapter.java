package org.example.patterns.adapter;


// Adapter is a design pattern used as a bridge for two incompatible interfaces.
public class AppAdapter {

    public static void main(String[] args) {

        AudioPlayer player = new SimpleAudioPlayer();
        AudioPlayer wmaPlayer = new FormatAdapter(new WmaAudioPlayerImpl());
        player.playAudio();
        wmaPlayer.playAudio();
    }
}
