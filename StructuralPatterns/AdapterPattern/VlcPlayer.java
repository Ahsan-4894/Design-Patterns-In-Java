package StructuralPatterns.AdapterPattern;

public class VlcPlayer implements AdvanceMediaPlayer {
    public void playMp4(String fileName) {
        // empty lol
    }

    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }
}
