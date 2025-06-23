package Commands;

import Service.*;
import Model.CartItems;

import java.util.List;
import java.util.Scanner;

public class RemoveItemCommand implements Commands {

    @Override
    public void execute(CartService cartService) {
        List<CartItems> items = cartService.getCartItems();

        if (items.isEmpty()) {
            System.out.println("No items in your cart.");
            return;
        }

        // Display items with index starting at 1
        for (int i = 0; i < items.size(); i++) {
            CartItems item = items.get(i); // starts indexing
            System.out.printf("[%d] %s (Qty: %d)%n", i, item.name(), item.quantity());
        }

        // select item index to remove
        String indexStr = TerminalUtils.getIndexToRemovePrompt();
        int index;

        try {
            index = Integer.parseInt(indexStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid index number.");
            return;
        }

        if (index < 0 || index >= items.size()) {
            System.out.println("Invalid choice.");
            return;
        }

        CartItems selectedItem = items.get(index);
// ================================================================================================
        // quantity to remove
        System.out.printf("How many '%s' do you want to remove? ", selectedItem.name());
        Scanner scanner = new Scanner(System.in);
        int qtyToRemove;

        //  ====== handles invalidation ========
        try {
            qtyToRemove = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity.");
            return;
        }

        if (qtyToRemove >= selectedItem.quantity()) { // checks how much the user wants to remove
            CartItems removed = cartService.removeItem(index); // removes whole item
            System.out.println("Removed: " + removed.name());
        } else {
            int newQty = selectedItem.quantity() - qtyToRemove; // removes partial amount
            CartItems updatedItem = new Model.Product(
                    selectedItem.name(), // keep name
                    selectedItem.price(), // keep price
                    newQty, // updated quantity
                    selectedItem.description() // keep description
            );
            items.set(index, updatedItem);
            System.out.printf("Updated '%s' quantity to %d%n", updatedItem.name(), updatedItem.quantity());
        }
    }
}

