package mediaImpl;

import Media.Media;
import mediaData.BookData;

public class BookClass implements Media {
    private final BookData data;

    public BookClass(BookData data) {
        this.data = data;
    }

    @Override
    public void play() {
        System.out.println("Opening book: " + getName() + " using e-reader software");
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
