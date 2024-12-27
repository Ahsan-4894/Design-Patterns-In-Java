package StructuralPatterns.AdapterPattern;

public class AudioPlayer implements MediaPlayer {

    public void play(String audioType, String fileName) {
        String trimmedAudioType = audioType.trim();

        if (trimmedAudioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        } else if (trimmedAudioType.equalsIgnoreCase("mp4") || trimmedAudioType.equalsIgnoreCase("vlc")) {
            MediaAdapter md = new MediaAdapter();
            md.play(trimmedAudioType, fileName);
        } else {
            System.out.println("WRONG FORMAT FILE!");
        }

    }

}
