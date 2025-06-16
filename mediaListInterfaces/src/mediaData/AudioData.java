package mediaData;

import Media.MetadataProvider;

public record AudioData(String duration, int artist, String name) implements MetadataProvider {
    @Override
    public String getMetadata() {
        return String.format("Audio: %s, Duration: %s mins, Artist: %s", name, duration, artist);
    }
}
