package StructuralPatterns.ProxyPattern;

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public Video getVideo(String videoName) {
        System.out.println("connecting to server and downloading video: " + videoName);
        return new Video(videoName);
    }
}
