public class bookClass extends Media {
    private String author;
    private int pageCount;

    public bookClass(String name, String author, int pageCount) {
        super(name);
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public void play() {
        System.out.println("Opening book '" + getName() + "' using e-reader software");
    }

    @Override
    public String getDescription() {
        return "Book: " + getName() +
                "\nAuthor: " + author +
                "\nPage Count: " + pageCount;
    }
}

