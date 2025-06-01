import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String correctPassword = "letmein";
        String userInput;

        // keep asking until correct
        System.out.println("Please enter your password: ");
        userInput = scanner.nextLine();

        while (!userInput.equals(correctPassword)) {
            System.out.println("Your password is incorrect, Try again.");
            System.out.println("Please enter your password: ");
            userInput = scanner.nextLine();
        }
        System.out.println("Access granted.");
    }
}
