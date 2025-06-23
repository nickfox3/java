package Commands;

import Service.*;
import Model.CartItems;

import java.util.Scanner;

public class AddItemCommand implements Commands {

    @Override
    public void execute(CartService cartService) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter description: ");
        String desc = scanner.nextLine();

        CartItems item = TerminalUtils.createItem(name, price, qty, desc); // creates item

        cartService.addItem(item); // adds to list

        System.out.println("Added: " + item.name());
        double total = cartService.getTotal(); // getTotal, quantity * price
        System.out.printf("Current Cart Total: $%.2f", total);
    }
}


