package com.example;

import Model.*;
import Service.CartService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {

    private CartService cart;

    @BeforeEach
    void setUp() {
        cart = new CartService();
        cart.clear();
    }

    @Test
    void AddProductToCart() {
        CartItems item = new Product("Milk", 2.5, 2, "Whole Milk");
        cart.addItem(item);
        assertEquals(1, cart.size());
        assertEquals("Milk", cart.getCartItems().get(0).name());
    }

    @Test
    void RemoveProductFromCart() {
        CartItems item = new Product("Milk", 2.5, 2, "Whole Milk");
        cart.addItem(item); // adds item
        CartItems removed = cart.removeItem(0);
        assertNotNull(removed); // then removes item
        assertEquals("Milk", removed.name());
        assertEquals(0, cart.size());
    }
    @Test
    void CartSizeAfterRemoval() {
        cart.addItem(new Product("chips", 2.5, 2, "salted"));
        cart.removeItem(0);
        assertEquals(0, cart.size());
    }

    @Test
    void RemoveInvalidIndex() {
        CartItems removed = cart.removeItem(99);
        assertNull(removed);
    }

    @Test
    void CartIsEmpty() {
        assertTrue(cart.isEmpty());
        cart.addItem(new Product("Bread", 1.5, 2, "Whole wheat"));
        assertFalse(cart.isEmpty());
    }

    @Test
    void GetTotalPrice() {
        cart.addItem(new Product("Juice", 4.0, 2, "Orange Juice"));
        cart.addItem(new Product("Chips", 1.5, 3, "Salt and Vinegar"));
        double total = cart.getTotal();
        assertEquals(4.0 * 2 + 1.5 * 3, total);

    }
    }

