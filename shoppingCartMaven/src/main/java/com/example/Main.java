package com.example;

import Commands.*;
import Service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CartService cart = new CartService();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            TerminalUtils.getMenuChoicePrompt();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> new DisplayCommand().execute(cart);

                case "2" -> new RemoveItemCommand().execute(cart);

                case "3" -> new AddItemCommand().execute(cart);

                case "4" -> new CheckoutCommand().execute(cart);

                case "5" -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
