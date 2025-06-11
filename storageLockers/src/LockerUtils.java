import java.util.Scanner;

public class LockerUtils {
    private final Locker[] lockers;
    private int lockerCount;
    private final Scanner scanner;

    public LockerUtils(int maxLockers) {
        lockers = new Locker[maxLockers];
        lockerCount = 0;
        scanner = new Scanner(System.in);
    }

    // ========================== show menu ==========================
    public void showMenu() {
        while (true) {
            System.out.println("\n==== LOCKER MENU ====");
            System.out.println("1. Rent a locker");
            System.out.println("2. Access a locker");
            System.out.println("3. Release a locker");
            System.out.println("4. Exit");

            System.out.print("Choose an option (1-4): ");
            String option = scanner.nextLine();

            Result result;
            switch (option) {
                case "1":
                    result = rentLocker();
                    break;
                case "2":
                    result = accessLocker();
                    break;
                case "3":
                    result = releaseLocker();
                    break;
                case "4":
                    result = goodBye();
                    System.out.println(result.getMessage());
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    continue;
            }

            System.out.println(result.getMessage());
        }
    }

    // ========================== rent locker ==========================
    public Result rentLocker() {
        if (lockerCount >= lockers.length) {
            return new Result(false, "No lockers available.");
        }

        int lockerNumber;
        do {
            lockerNumber = 1000 + (int) (Math.random() * 9000); // 1000–9999
        } while (findLocker(lockerNumber) != null);

        String pin = String.format("%04d", (int) (Math.random() * 10000)); // 0000–9999

        lockers[lockerCount] = new Locker(lockerNumber, pin);
        lockerCount++;

        return new Result(true, "Locker #" + lockerNumber + " rented with PIN: " + pin);
    }

    // ========================== access locker ==========================
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

    // ========================== release locker ==========================
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

    // ========================== exit ==========================
    public Result goodBye() {
        return new Result(true, "Goodbye!");
    }

    // ========================== private helpers ==========================
    private Locker findLocker(int lockerNumber) {
        for (int i = 0; i < lockerCount; i++) {
            if (lockers[i].getLockerNumber() == lockerNumber) {
                return lockers[i];
            }
        }
        return null;
    }

    private void removeLocker(int lockerNumber) {
        for (int i = 0; i < lockerCount; i++) {
            if (lockers[i].getLockerNumber() == lockerNumber) {
                for (int j = i; j < lockerCount - 1; j++) {
                    lockers[j] = lockers[j + 1];
                }
                lockers[lockerCount - 1] = null;
                lockerCount--;
                break;
            }
        }
    }
}




