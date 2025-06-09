import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask how many lockers are available
        System.out.print("How many lockers would you like to set up? ");
        int totalLockers = Integer.parseInt(input.nextLine());

        // Creates LockerUtils with the given number of lockers
        LockerUtils lockerSystem = new LockerUtils(totalLockers);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n==== LOCKER MENU ====");
            System.out.println("1. Rent a locker");
            System.out.println("2. Access a locker");
            System.out.println("3. Release a locker");
            System.out.println("4. Exit");

            System.out.print("Choose an option (1-4): ");
            String option = input.nextLine();

            Result result;
            switch (option) {
                case "1":
                    result = lockerSystem.rentLocker();
                    System.out.println(result.getMessage());
                    break;
                case "2":
                    result = lockerSystem.accessLocker();
                    System.out.println(result.getMessage());
                    break;
                case "3":
                    result = lockerSystem.releaseLocker();
                    System.out.println(result.getMessage());
                    break;
                case "4":
                    result = lockerSystem.goodBye();
                    System.out.println(result.getMessage());
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid option! Please choose between 1-4.");
                    break;
            }
        }
    }
}


