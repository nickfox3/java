package Commands;

import Service.CartService;
import Model.CartItems;

public class CheckoutCommand implements Commands {

    @Override
    public void execute(CartService cartService) {
        if (cartService.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
// receipt model
        System.out.println("======== Receipt ========");
        System.out.printf("%-20s %5s %10s %10s%n", "Item", "Qty", "Price", "Total");
        System.out.println("----------------------------------------------");

        double total = 0;
        for (CartItems item : cartService.getCartItems()) { // loops through each item
            double itemTotal = item.price() * item.quantity();
            total += itemTotal; // adds up all items
            System.out.printf("%-20s %5d %10.2f %10.2f%n",
                    item.name(), item.quantity(), item.price(), itemTotal);
        }

        System.out.println("----------------------------------------------");
        System.out.printf("%-20s %26.2f%n", "FINAL TOTAL:", total); // shows final total
        System.out.println("==========================");
        System.out.println("Thank you for shopping!");

        cartService.clear();
    }
}


