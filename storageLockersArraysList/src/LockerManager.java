import java.util.ArrayList;
import java.util.Scanner;

public class LockerManager {
    private final ArrayList<Locker> lockers = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
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
                    addLocker(id);
                    break;

                case "2":
                    System.out.print("Enter locker ID to remove: ");
                    String removeId = scanner.nextLine().toUpperCase();
                    removeLocker(removeId);
                    break;

                case "3":
                    System.out.print("Enter locker ID: ");
                    String storeId = scanner.nextLine().toUpperCase();
                    System.out.print("Enter item to store: ");
                    String item = scanner.nextLine();
                    storeItem(storeId, item);
                    break;

                case "4":
                    System.out.print("Enter locker ID: ");
                    String retrieveId = scanner.nextLine().toUpperCase();
                    retrieveItem(retrieveId);
                    break;

                case "5":
                    displayAllLockers();
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

    // add a new locker ========================================================
    public void addLocker(String userInputId) {
        String lockerID;

        // Ensure locker ID starts with 'L' - Fixed the logic
        if (userInputId.isEmpty()) {
            System.out.println("Locker ID cannot be empty.");
            return;
        } else if (!userInputId.toUpperCase().startsWith("L")) {
            lockerID = "L" + userInputId.toUpperCase();
        } else {
            lockerID = userInputId.toUpperCase();
        }

        // Check for duplicates
        for (Locker l : lockers) {
            if (l.getLockerID().equals(lockerID)) {
                System.out.println("Locker ID already exists.");
                return;
            }
        }

        lockers.add(new Locker(lockerID));
        System.out.println("Locker " + lockerID + " has been added.");
    }

    // remove a locker ==============================================
    public void removeLocker(String lockerID) {
        for (int i = 0; i < lockers.size(); i++) {
            if (lockers.get(i).getLockerID().equals(lockerID)) {
                lockers.remove(i);
                System.out.println("Locker " + lockerID + " has been removed.");
                return;
            }
        }
        System.out.println("Locker " + lockerID + " not found.");
    }

    // Get a locker by ID ====================================================
    public Locker getLocker(String lockerID) {
        for (Locker locker : lockers) {
            if (locker.getLockerID().equals(lockerID)) {
                return locker;
            }
        }
        return null;
    }

    // Display all lockers =====================================================
    public void displayAllLockers() {
        if (lockers.isEmpty()) {
            System.out.println("No lockers found.");
            return;
        }

        for (Locker locker : lockers) {
            System.out.println(locker);
        }
    }

    // Store an item in a locker ====================================================
    public void storeItem(String lockerID, String item) {
        Locker locker = getLocker(lockerID);
        if (locker == null) {
            System.out.println("Locker not found.");
            return;
        }

        if (locker.isOccupied()) {
            System.out.println("Locker is already occupied.");
            return;
        }

        locker.storeItem(item);
        System.out.println("Item stored in locker " + lockerID + ".");
    }

    // Retrieve (remove) an item from a locker ========================================
    public void retrieveItem(String lockerID) {
        Locker locker = getLocker(lockerID);
        if (locker == null) {
            System.out.println("Locker not found.");
            return;
        }

        if (!locker.isOccupied()) {
            System.out.println("Locker is already empty.");
            return;
        }

        locker.removeItem();
        System.out.println("Item removed from locker " + lockerID + ".");
    }


}
