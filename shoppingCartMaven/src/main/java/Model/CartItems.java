package Model;

import Service.*;

public interface CartItems {
    String name();
    double price();
    int quantity();
    String description();
    double totalPrice();
    void show(CartService cartService);
}
