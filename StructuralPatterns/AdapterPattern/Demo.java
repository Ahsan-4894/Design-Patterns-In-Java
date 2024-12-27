package StructuralPatterns.AdapterPattern;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play("mp3", "abc.txt");
        ap.play("mp4", "abc.txt");
        ap.play("vlc", "abc.txt");

        ap.play("avi", "abc.txt"); // error
    }
}
