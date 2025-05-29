import java.util.Scanner;
public class exercise_consoleIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user for name
        System.out.println("Enter your name: ");
        String customerName = input.nextLine();

        // get product details
        System.out.println("Enter product name: ");
        String productName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        // total price
        double subtotal = quantity * unitPrice;
        double tax = subtotal * 0.07;
        double grandTotal = subtotal + tax;

        // formatted receipt
        System.out.println("\n==== RECEIPT ====");
        System.out.println("Customer name: " + customerName);
        System.out.println("Product name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit price: $" + unitPrice);
        System.out.println("Subtotal: $" + subtotal);
        System.out.printf("Price: $%.2f\n", tax);
        System.out.println("Grand Total: $ " + grandTotal);
    }
}
