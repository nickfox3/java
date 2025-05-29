import java.util.Scanner;

public class shoppingcartConsoleIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Are you tax-exempt?
        System.out.print("Are you tax-exempt? (yes/no): ");
        String taxExempt = input.nextLine();

        // Shipping?
        System.out.print("Do you need shipping? (yes/no): ");
        String needsShipping = input.nextLine();

        // Order quantity
        System.out.print("Enter order quantity: ");
        int quantity = input.nextInt();
        input.nextLine();  // Clear the newline

        // Promo code
        System.out.print("Enter promo code for free shipping (if any): ");
        String promoCode = input.nextLine();

        // Shopping cart logic
        System.out.println("\nWelcome to the shopping cart app!");

        int productId = 1;
        int productCategory = 2;
        double productCost = 2.56;
        double productPrice = 4.99;
        int productQuantity = quantity;

        double totalCost = productCost * productQuantity;
        double profitPerProduct = productPrice - productCost;
        double totalProfit = profitPerProduct * productQuantity;

        String businessName = "Walmart";
        String contactInfo = "Email: walmart@corps.com";
        String itemDescription = "Item: Flat screen TV";

        // Display receipt
        System.out.println("\n=== Receipt ===");
        System.out.println("Business: " + businessName);
        System.out.println("Contact: " + contactInfo);
        System.out.println("Product Info: " + itemDescription);
        System.out.println("Quantity Ordered: " + productQuantity);
        System.out.printf("Unit Price: $%.2f\n", productPrice);
        System.out.printf("Subtotal: $%.2f\n", totalCost);
        System.out.printf("Total Profit: $%.2f\n", totalProfit);
        System.out.println("Tax-Exempt: " + taxExempt);
        System.out.println("Shipping Needed: " + needsShipping);
        System.out.println("Promo Code: " + (promoCode.isEmpty() ? "None" : promoCode));
    }
}


