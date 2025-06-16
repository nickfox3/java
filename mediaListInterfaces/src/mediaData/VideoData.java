package mediaData;

import Media.MetadataProvider;

public record VideoData(String duration, int resolution, String name) implements MetadataProvider {
    @Override
    public String getMetadata() {
        return String.format("Book: %s, \nResolution: %d mins, \nDuration: %d", name, resolution, duration);
    }
}
