package StructuralPatterns.ProxyPattern;

public class Client {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("mrbeast");

        // now it will not download again as it is cached
        videoDownloader.getVideo("mrbeast");
        videoDownloader.getVideo("mrbeast");

        // now download it as it is not cached
        videoDownloader.getVideo("mrbeast2");

    }
}
// proxy pattern is not just used for cache but also for security too