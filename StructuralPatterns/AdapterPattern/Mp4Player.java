package StructuralPatterns.AdapterPattern;

public class Mp4Player implements AdvanceMediaPlayer {
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }

    public void playVlc(String fileName) {
        // empty lol
    }
}
