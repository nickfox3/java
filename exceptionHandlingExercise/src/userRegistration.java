import java.util.Scanner;

public class userRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String email = "";
        int pin = 0;

        // Get valid age
        while (true) {
            try {
                System.out.print("Enter your age: ");
                age = Integer.parseInt(scanner.nextLine());

                if (age < 0) {
                    System.out.println("Please enter a valid (non-negative) age.");
                } else {
                    System.out.println("You entered age: " + age);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for age.");
            }
        }

        // Get valid email
        while (true) {
            try {
                System.out.print("Enter your email: ");
                email = scanner.nextLine();

                if (email.isEmpty()) {
                    throw new IllegalArgumentException("Email cannot be empty.");
                }

                System.out.println("You entered email: " + email);
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input.");
            }
        }

        // Get valid 4-digit PIN
        while (true) {
            try {
                System.out.print("Enter your 4-digit PIN: ");
                pin = Integer.parseInt(scanner.nextLine());

                if (pin < 1000 || pin > 9999) {
                    System.out.println("PIN must be a 4-digit number (1000–9999).");
                } else {
                    System.out.println("You entered PIN: " + pin);
                    break; // valid input
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers only.");
            }
        }

        System.out.println("Registration complete.");
    }
}
