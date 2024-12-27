package StructuralPatterns.AdapterPattern;

public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer ad = null;

    public void play(String trimmedAudioType, String fileName) {
        if (trimmedAudioType.equalsIgnoreCase("mp4")) {
            ad = new Mp4Player();
            ad.playMp4(fileName);
        } else if (trimmedAudioType.equalsIgnoreCase("vlc")) {
            ad = new VlcPlayer();
            ad.playVlc(fileName);
        } else {
            System.out.println("WRONG FORMAT FILE!");
        }
    }
}
