package Commands;

import Service.CartService;
import Model.*;
import java.util.List;

public class DisplayCommand implements Commands {

    @Override
    public void execute(CartService cartService) {
        if (cartService.getCartItems().isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("=== Your Cart ===\n");
        List<CartItems> items = cartService.getCartItems(); // copies contents of cart items in getCartItems
        double total = 0;

        for (int i = 0; i < items.size(); i++) { // loop, goes through every item in list
            CartItems item = items.get(i); // retrieves index of item, storing item
            double itemTotal = item.price() * item.quantity();// calculate price
            total += itemTotal;

            System.out.printf("[%d]%n%s%n", i , item); // prints receipt
        }

        System.out.printf("%nTotal Amount: $%.2f%n", total); // final total

    }
}

