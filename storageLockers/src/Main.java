import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask how many lockers are available
        System.out.print("How many lockers would you like to set up? ");
        int totalLockers = Integer.parseInt(input.nextLine());

        // creates new locker utils
        LockerUtils lockerSystem = new LockerUtils(totalLockers);

        // Call the menu loop from LockerUtils
        lockerSystem.showMenu();
    }
}


