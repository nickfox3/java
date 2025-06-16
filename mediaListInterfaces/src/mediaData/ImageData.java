package mediaData;

import Media.MetadataProvider;

public record ImageData(String dimensions, String fileFormat, String name) implements MetadataProvider {
    @Override
    public String getMetadata() {
        return String.format("Image: %s, Dimensions: %s mins, Format: %s", name, dimensions, fileFormat);
    }
}
