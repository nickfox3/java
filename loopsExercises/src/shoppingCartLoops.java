import java.util.Scanner;
public class shoppingCartLoops {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Welcome to the shopping cart app!");

            // Declare variables outside the loop to maintain scope
            boolean isConfirmed = false;
            String taxExempt = "";
            String shipping = "";
            String promoCode = "";
            int orderQuantity = 0;

            // Input loop until confirmation
            while (!isConfirmed) {
                System.out.println("Are you tax-exempt? (y/n)");
                taxExempt = console.nextLine();

                System.out.println("Shipping? (standard/overnight/twoday)");
                shipping = console.nextLine();

                System.out.println("Order quantity?");
                orderQuantity = Integer.parseInt(console.nextLine());

                System.out.println("Promo code for free shipping?");
                promoCode = console.nextLine();

                System.out.println("Confirm Order y/n");
                isConfirmed = "y".equals(console.nextLine());
            }

            // Print final order details
            System.out.println("\nDetails:");
            System.out.println("Tax-exempt: " + taxExempt);
            System.out.println("Shipping: " + shipping);
            System.out.println("Order quantity: " + orderQuantity);
            System.out.println("Promo code: " + promoCode);
            System.out.println("Bye");

            console.close();
        }
    }


