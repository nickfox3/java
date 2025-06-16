package mediaImpl;

import Media.Media;
import mediaData.ImageData;

public class imageClass implements Media {
    private final ImageData data;

    public imageClass(ImageData data) {
        this.data = data;
    }

    @Override
    public void play() {
        System.out.println("Displaying image: " + getName() + " using image viewer software");
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

