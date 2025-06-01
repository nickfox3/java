import java.util.Scanner;

public class shoppingcartArrays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the shopping cart app!");

        // Create arrays for addresses and sizes
        String[] addresses = { "123 Main St", "456 Main St", "789 Main St" };
        String[] sizes = { "small", "medium", "large" };

        int addressIndex = 0;
        int sizeIndex = 0;

        // Prompt for shipping address
        System.out.println("\nChoose a shipping address:");
        for (int i = 0; i < addresses.length; i++) {
            System.out.println((i + 1) + ". " + addresses[i]);
        }
        System.out.print("Shipping address? ");
        String address = console.nextLine();
        addressIndex = Integer.parseInt(address);

        // Prompt for size
        System.out.println("\nChoose a size:");
        for (int i = 0; i < sizes.length; i++) {
            System.out.println((i + 1) + ". " + sizes[i]);
        }
        System.out.print("Size? ");
        String size = console.nextLine();
        sizeIndex = Integer.parseInt(size);

        // Print details
        System.out.println("\nDetails:");
        System.out.println("Address: " + addresses[addressIndex - 1]);
        System.out.println("Size: " + sizes[sizeIndex - 1]);
        System.out.println("Bye");

        console.close();
    }
}
