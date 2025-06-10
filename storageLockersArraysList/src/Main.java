import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LockerManager manager = new LockerManager();
        boolean running = true;

        while (running) {
            System.out.println("\n==== LOCKER MENU ====");
            System.out.println("1. Add a locker");
            System.out.println("2. Remove a locker");
            System.out.println("3. Store item in a locker");
            System.out.println("4. Retrieve item from a locker");
            System.out.println("5. Display all lockers");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter locker ID: ");
                    String id = scanner.nextLine();
                    manager.addLocker(id);
                    break;

                case "2":
                    System.out.print("Enter locker ID to remove: ");
                    String removeId = scanner.nextLine().toUpperCase();
                    manager.removeLocker(removeId);
                    break;

                case "3":
                    System.out.print("Enter locker ID: ");
                    String storeId = scanner.nextLine().toUpperCase();
                    System.out.print("Enter item to store: ");
                    String item = scanner.nextLine();
                    manager.storeItem(storeId, item);
                    break;

                case "4":
                    System.out.print("Enter locker ID: ");
                    String retrieveId = scanner.nextLine().toUpperCase();
                    manager.retrieveItem(retrieveId);
                    break;

                case "5":
                    manager.displayAllLockers();
                    break;

                case "6":
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
