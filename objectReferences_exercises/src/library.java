public class library {
    public static void main(String[] args) {
        // 2 book objects
        book book1 = new book("IT", "Stephen King", true);
        book book2 = new book("THE RED DOOR", "Stephen King", true);

        // display availability before borrowing
        book1.displayInfo();
        System.out.println("Borrowing a book....");
        book1.borrowBook();
        book1.displayInfo();

        System.out.println(); // space it out

        // display availability of second book
        book2.displayInfo();
        System.out.println("Borrowing a book....");
        book2.borrowBook(); // Borrow second book
        book2.displayInfo();
    }
}
