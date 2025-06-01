import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parallel arrays
        String[] names = {"Alice", "Bob", "Charlie"};
        String[] phoneNumbers = {"123-456-7890", "555-123-4567", "999-888-7777"};
        String[] emails = {"alice@example.com", "bob@example.com", "charlie@example.com"};

        // Ask the user for a name
        System.out.print("Enter a name to look up: ");
        String searchName = scanner.nextLine();

        boolean found = false;

        // Search through the names array
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("\nContact Found:");
                System.out.println("Name: " + names[i]);
                System.out.println("Phone: " + phoneNumbers[i]);
                System.out.println("Email: " + emails[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }

        scanner.close();
    }
}
