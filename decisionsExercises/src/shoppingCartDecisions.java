import java.util.Scanner;

public class shoppingCartDecisions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the shopping cart app!");

        // Example product details (could later be made dynamic)
        double productPrice = 4.99;
        int productQuantity = 78;
        double totalCost = productPrice * productQuantity;

        System.out.println("Product Price: $" + productPrice);
        System.out.println("Product Quantity: " + productQuantity);
        System.out.println("Total Cost: $" + totalCost);

        // Constants
        final double taxRate = 0.07;
        final double standardShipping = 2.00;
        final double twoDayShipping = 5.00;
        final double overnightShipping = 10.00;

        // Get user inputs
        System.out.print("Enter the order total: $");
        double orderTotal = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Are you tax exempt? (yes/no): ");
        String taxExempt = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter shipping type (standard/two-day/overnight): ");
        String shippingType = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter promo code (leave blank if none): ");
        String promoCode = scanner.nextLine().trim().toLowerCase();

        // Calculate discount
        double discount = 0;
        if (orderTotal > 500) {
            discount = orderTotal * 0.10;
        } else if (orderTotal > 100) {
            discount = orderTotal * 0.05;
        }

        // Apply discount
        double discountedTotal = orderTotal - discount;

        // Calculate tax
        double tax = 0;
        if (!taxExempt.equals("yes")) {
            tax = discountedTotal * taxRate;
        }

        // Determine shipping cost
        double shippingCost = 0;
        switch (shippingType) {
            case "standard":
                shippingCost = standardShipping;
                break;
            case "two-day":
                shippingCost = twoDayShipping;
                break;
            case "overnight":
                shippingCost = overnightShipping;
                break;
            default:
                System.out.println("Invalid shipping type. Using standard shipping.");
                shippingCost = standardShipping;
                break;
        }

        // Apply promo code for free shipping (only on standard)
        if (promoCode.equals("freeship")) {
            shippingCost = 0;
        }

        // Final total
        double finalTotal = discountedTotal + tax + shippingCost;

        // Output summary
        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.printf("Order Total:     $%.2f\n", orderTotal);
        System.out.printf("Discount:       -$%.2f\n", discount);
        System.out.printf("Tax:             $%.2f\n", tax);
        System.out.printf("Shipping:        $%.2f\n", shippingCost);
        System.out.printf("Final Total:     $%.2f\n", finalTotal);
        System.out.println("==========================");

        scanner.close();
    }
}


