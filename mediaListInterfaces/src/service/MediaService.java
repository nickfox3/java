package service;

import Media.Media;

import java.util.ArrayList;

public class MediaService {
    private final ArrayList<Media> mediaList = new ArrayList<>();

    public void addMedia(Media media) {
        if (media != null) {
            mediaList.add(media);
        }
    }

    // method for removing by index
    public Media removeMedia(int index) {
        if (index >= 0 && index < mediaList.size()) {
            return mediaList.remove(index);
        }
        return null;
    }

    public Media playMedia(int index) {
        if (index >= 0 && index < mediaList.size()) {
            return mediaList.get(index);
        }
        return null;
    }

    public ArrayList<Media> getMediaList() {
        return new ArrayList<>(mediaList);}

    public boolean isEmpty() {
        return mediaList.isEmpty();
    }

    public int size() {
        return mediaList.size();
    }
    public Media getMedia(int index) {
        return mediaList.get(index);
    }

}