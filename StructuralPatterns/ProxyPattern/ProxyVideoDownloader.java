package StructuralPatterns.ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {

    private final Map<String, Video> videoCache = new HashMap<>();
    private final VideoDownloader realVideoDownloader = new RealVideoDownloader();

    @Override
    public Video getVideo(String videoName) {
        if (!videoCache.containsKey(videoName)) {
            videoCache.put(videoName, realVideoDownloader.getVideo(videoName));
        }

        return videoCache.get(videoName);

    }
}
