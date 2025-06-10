import java.util.ArrayList;

public class LockerManager {
    ArrayList<Locker> lockers = new ArrayList<>();

    // Constructor (start empty, user will add lockers)
    public LockerManager() {}
// ===================================================================
    // Add a new locker
    public void addLocker(String userInputId) {
        String lockerID;

        // Ensure locker ID starts with 'L'
        if (userInputId.isEmpty()) {
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
// ========================================================================
    // Remove a locker by ID
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
// ==================================================================================
    // Get a locker by ID
    public Locker getLocker(String lockerID) {
        for (Locker locker : lockers) {
            if (locker.getLockerID().equals(lockerID)) {
                return locker;
            }
        }
        return null;
    }
// ==================================================================================
    // Display all lockers
    public void displayAllLockers() {
        if (lockers.isEmpty()) {
            System.out.println("No lockers found.");
            return;
        }

        for (Locker locker : lockers) {
            System.out.println(locker);
        }
    }
// ==============================================================================
    // Store an item in a locker
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
// =========================================================================
    // Retrieve (remove) an item from a locker
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


