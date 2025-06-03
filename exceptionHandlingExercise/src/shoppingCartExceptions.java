import java.util.Scanner;

public class shoppingCartExceptions {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        String[] addresses = {"123 Main St", "456 Main St", "789 Main St"};
        String[] sizes = {"small", "medium", "large"};
        String shipping = "";
        String promoCode = "";
        String address = null;
        String size = null;
        boolean taxExempt = false;
        int quantity = 0;
        boolean confirm = false;

        System.out.println("Welcome to the shopping cart app!");

        // Tax-exempt status
        System.out.print("Are you tax-exempt? (y/n): ");
        taxExempt = console.nextLine().trim().equalsIgnoreCase("y");

        // Shipping address selection
        while (address == null) {
            try {
                displayChoices(addresses);
                int index = promptUserForInt("Shipping address?") - 1;
                address = addresses[index];
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter a valid menu option.");
            }
        }

        // Shipping method
        System.out.print("Shipping? (standard/overnight/twoday): ");
        shipping = console.nextLine().trim();

        // Order quantity
        while (quantity <= 0) {
            try {
                quantity = promptUserForInt("Order quantity?");
                if (quantity <= 0) {
                    System.out.println("Quantity must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        // Size selection
        while (size == null) {
            try {
                displayChoices(sizes);
                int sizeIndex = promptUserForInt("Size?") - 1;
                size = sizes[sizeIndex];
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter a valid menu option.");
            }
        }

        // Promo Code
        System.out.print("Promo code for free shipping? ");
        promoCode = console.nextLine().trim();
        if (!promoCode.equalsIgnoreCase("freebie")) {
            promoCode = "none";
        }

        // Confirm order
        while (!confirm) {
            System.out.println("\nDetails:");
            System.out.println("Tax-exempt: " + (taxExempt ? "Yes" : "No"));
            System.out.println("Address: " + address);
            System.out.println("Shipping: " + shipping);
            System.out.println("Quantity: " + quantity);
            System.out.println("Size: " + size);
            System.out.println("Promo code: " + promoCode);

            System.out.print("Confirm Order? (y/n): ");
            confirm = console.nextLine().trim().equalsIgnoreCase("y");
        }

        System.out.println("Bye");
    }

    // Helper to prompt for int input with validation
    private static int promptUserForInt(String prompt) throws NumberFormatException {
        System.out.print(prompt + " ");
        return Integer.parseInt(console.nextLine());
    }

    // Helper to display options with index
    private static void displayChoices(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ": " + options[i]);
        }
    }
}
