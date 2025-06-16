package mediaData;

import Media.MetadataProvider;

public record BookData(String author, String pageCount, String name) implements MetadataProvider {
    @Override
    public String getMetadata() {
        return String.format("Book: %s, Page Count: %s, Author: %s", name, pageCount, author);
    }
    }

