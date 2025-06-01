import java.util.Scanner;

public class negativeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask for number
        System.out.println("Enter a number: (type 0 to quit):");

        while(true) {
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Negative number");
                continue;
            }
            if (number == 0) {
                break;
            }
            System.out.println("You entered " + number);
        }
        System.out.println("Program ended");
    }
}
