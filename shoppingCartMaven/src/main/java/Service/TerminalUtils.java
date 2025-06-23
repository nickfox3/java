package Service;

import Model.Product;

import java.util.Scanner;

public class TerminalUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static void getMenuChoicePrompt() {
        print("""
                \n
                === Shopping Cart Menu ===
                1. Display Cart
                2. Remove an Item
                3. Add an Item
                4. Checkout
                5. Exit
                Choose an option:""");
    }

    public static String getIndexToRemovePrompt() {
        System.out.println("Enter the index to remove.");
        return scanner.nextLine();
    }

    public static Product createItem(String name, double price, int qty, String desc) {
        return new Product(name, price, qty, desc); // creates item, then returns new item
    }

    public static void print(String message) {
        System.out.println(message);
    }
}

