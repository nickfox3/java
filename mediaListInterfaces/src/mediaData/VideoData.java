package mediaData;

import Media.MetadataProvider;

public record VideoData(String name, int resolution, String duration) implements MetadataProvider {
    @Override
    public String getMetadata() {
        return String.format("Video: %s, \nResolution: %d mins, \nDuration: %s", name, resolution, duration);
    }
}
