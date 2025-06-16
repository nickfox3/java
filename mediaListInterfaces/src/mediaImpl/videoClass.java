package mediaImpl;

import Media.Media;
import mediaData.VideoData;

public class videoClass implements Media {
    private final VideoData data;

    public videoClass(VideoData data) {
        this.data = data;
    }

    @Override
    public void play() {
        System.out.println("Playing video " + getName() + " using video player software");
    }

    @Override
    public String getDescription() {
        return data.getMetadata();
    }

    @Override
    public String getName() {
        return data.name();
    }
}
