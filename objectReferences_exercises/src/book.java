public class book {
    // fields
    String title;
    String author;
    boolean isAvailable;

    // constructor
    public book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
        // method to borrow book
        public void borrowBook() {
            isAvailable = false;
        }
        // method to display book info
            public void displayInfo() {
        System.out.println(" book:" + title + " by:" + author + "(Is available?" + isAvailable );
    }
}
