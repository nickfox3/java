package mediaData;

import Media.MetadataProvider;

public record BookData(String name, String pageCount, String author) implements MetadataProvider {
    @Override
    public String getMetadata() {
        return String.format("Book: %s, Page Count: %s, Author: %s", name, pageCount, author);
    }
    }

