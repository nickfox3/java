import java.util.Scanner;
public class shoppingCartMethods {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            String[] addresses = {"123 Main St", "456 Main St", "789 Main St"};
            String[] sizes = {"small", "medium", "large"};

            System.out.println("Welcome to the shopping cart app!");

            // Prompt for tax-exempt status
            String taxExempt = promptUserForString("Are you tax-exempt? (y/n): ");

            // Prompt for shipping address
            displayChoices(addresses);
            int addressIndex = promptUserForInt("Shipping address?");
            String address = addresses[addressIndex - 1];

            // Prompt for shipping method
            String shipping = promptUserForString("Shipping? (standard/overnight/twoday)");

            // Prompt for order quantity
            int quantity = promptUserForInt("Order quantity?");

            // Prompt for size
            displayChoices(sizes);
            int sizeIndex = promptUserForInt("Size?");
            String size = sizes[sizeIndex - 1];

            // Prompt for promo code
            String promoCode = promptUserForString("Promo code for free shipping?");
            boolean freeShipping = false;
            
            if (promoCode.equals("freebie")) {
                freeShipping = true;
                System.out.println("Shipping free successfully!");
            } else {
                System.out.println("Shipping not free successfully!");
            }

            // Summary
            System.out.println("\nDetails:");
            System.out.println("Tax-exempt: " + taxExempt);
            System.out.println("Address: " + address);
            System.out.println("Shipping: " + shipping);
            System.out.println("Size: " + size);
            System.out.println("Order quantity: " + quantity);
            System.out.println("Promo code: " + promoCode);

            // Confirm
            String confirm = promptUserForString("Confirm Order y/n");
            if (confirm.equalsIgnoreCase("y")) {
                System.out.println("Order confirmed. Bye!");
            } else {
                System.out.println("Order cancelled.");
            }
        }

        // Display choices from an array
        private static void displayChoices(String[] choices) {
            for (int i = 0; i < choices.length; i++) {
                System.out.println((i + 1) + ": " + choices[i]);
            }
        }

        // Prompt user for integer input
        private static int promptUserForInt(String prompt) {
            Scanner console = new Scanner(System.in);
            System.out.println(prompt);
            return Integer.parseInt(console.nextLine());
        }

        // Prompt user for string input
        private static String promptUserForString(String prompt) {
            Scanner console = new Scanner(System.in);
            System.out.println(prompt);
            return console.nextLine();
        }
    }


