package Service;

import Model.CartItems;

import java.util.ArrayList;

public class CartService {
    private final ArrayList<CartItems> cartItems = new ArrayList<>(); // arraylist of cart items
//
    public void addItem(CartItems item) {
        if (item != null) {
            cartItems.add(item);
        }
    }

    public CartItems removeItem(int index) {
        if (index >= 0 && index < cartItems.size()) {
            return cartItems.remove(index);
        }
        return null;
    }

    public ArrayList<CartItems> getCartItems() {
        return new ArrayList<>(cartItems); // gives copy of list
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }

    public int size() {
        return cartItems.size(); // returns number of items
    }

    public void clear() {
        cartItems.clear(); // clears cart
    }

    public double getTotal() {
        double total = 0;
        for (CartItems item : cartItems) {
            total += item.price() * item.quantity();
        }
        return total;
    }

}

