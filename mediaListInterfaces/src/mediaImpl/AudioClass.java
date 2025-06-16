package mediaImpl;

import Media.Media;
import mediaData.AudioData;

public class AudioClass implements Media {
    private final AudioData data;

    public AudioClass(AudioData data) {
        this.data = data;
    }

    @Override
    public void play() {
        System.out.println("Playing audio '" + getName() + "' using audio player software");
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


