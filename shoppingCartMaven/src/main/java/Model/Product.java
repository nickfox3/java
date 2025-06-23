package Model;

import Service.CartService;
// holds all the data
public record Product(String name, double price, int quantity, String description) implements CartItems {

    @Override
        public String toString() {
            return String.format(
                    "Item:        %s%n" +
                            "Price:       $%.2f%n" +
                            "Quantity:    %d%n" +
                            "Description: %s%n" +
                            "Total:       $%.2f%n" +
                            "-------------------------",
                    name, price, quantity, description, totalPrice()
            );
        }

    public double totalPrice() {
        return price * quantity;
    }

    @Override
    public void show(CartService cartService) {
        System.out.println(this); // toString
    }
}



