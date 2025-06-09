import java.util.Scanner;

public class LockerUtils {
    private final Locker[] lockers;
    private int lockerCount;
    private final Scanner scanner;

// constructor = sets how many lockers the system can handle
    public LockerUtils(int maxLockers) {
        lockers = new Locker[maxLockers];
        lockerCount = 0;
        scanner = new Scanner(System.in);
    }
// =====================================================================================

// method to rent
    public Result rentLocker() {
        if (lockerCount >= lockers.length) {
            return new Result(false, "No lockers available.");
        }

        int lockerNumber = (int) (Math.random() * 1000); // makes random 4-digit locker number
        String pin = String.format("%04d", (int) (Math.random() * 100)); // 2-digit PIN with 2 leading zeros

        lockers[lockerCount] = new Locker(lockerNumber, pin);
        lockerCount++;

        return new Result(true, "Locker #" + lockerNumber + " rented with PIN: " + pin);
    }

// ====================================================================================

    // method to access
    public Result accessLocker() {
        try {
            System.out.print("Enter your locker number: ");
            int inputLocker = Integer.parseInt(scanner.nextLine());

            Locker foundLocker = findLocker(inputLocker);
            if (foundLocker == null) {
                return new Result(false, "Locker not found.");
            }

            System.out.print("Enter your 4-digit PIN: ");
            String inputPin = scanner.nextLine();

            if (foundLocker.getPin().equals(inputPin)) {
                return new Result(true, "Access granted. Your locker is now open.");
            } else {
                return new Result(false, "Access denied. Incorrect PIN.");
            }
        } catch (NumberFormatException e) {
            return new Result(false, "Invalid input. Please enter numbers only.");
        }
    }
// ==================================================================================

// method to release
    public Result releaseLocker() {
        try {
            System.out.print("Enter your locker number: ");
            int inputLocker = Integer.parseInt(scanner.nextLine());

            Locker foundLocker = findLocker(inputLocker);
            if (foundLocker == null) {
                return new Result(false, "Locker not found.");
            }

            System.out.print("Enter your 4-digit PIN: ");
            String inputPin = scanner.nextLine();

            if (!foundLocker.getPin().equals(inputPin)) {
                return new Result(false, "Access denied. Incorrect PIN.");
            }

            System.out.print("Are you sure? (Y/N): ");
            String confirm = scanner.nextLine();

            if (confirm.equalsIgnoreCase("y")) {
                removeLocker(inputLocker);
                return new Result(true, "Your locker has been released.");
            } else {
                return new Result(false, "The locker has not been released.");
            }

        } catch (NumberFormatException e) {
            return new Result(false, "Invalid input. Please enter numbers only.");
        }
    }
// ====================================================================================

// method to exit
    public Result goodBye() {
        return new Result(true, "Goodbye!");
    }
// =====================================================================================

    // ========== Private Helpers ========== \\
    // searches locker array to find locker that matches locker number
    private Locker findLocker(int lockerNumber) {
        for (int i = 0; i < lockerCount; i++) {
            if (lockers[i].getLockerNumber() == lockerNumber) {
                return lockers[i];
            }
        }
        return null;
    }
// removes locker from the array when a user releases it
    private void removeLocker(int lockerNumber) {
        for (int i = 0; i < lockerCount; i++) {
            if (lockers[i].getLockerNumber() == lockerNumber) {
                lockers[lockerCount - 1] = null;
                lockerCount--;
                break;
            }
        }
    }
}


