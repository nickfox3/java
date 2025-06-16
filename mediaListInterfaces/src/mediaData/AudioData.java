package mediaData;

import Media.MetadataProvider;

public record AudioData(String name, int duration, String artist) implements MetadataProvider {
    @Override
    public String getMetadata() {
        return String.format("Audio: %s, Duration: %d mins, Artist: %s", name, duration, artist);
    }
}
