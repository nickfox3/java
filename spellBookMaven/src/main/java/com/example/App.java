package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        SpellBook spellBook = new SpellBook();

        System.out.println("Welcome to the Spell Book!");

        while (true) {
            System.out.print("\nRecite a spell: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("help")) {
                spellBook.help();
            } else {
                spellBook.tryIncantation(input);
            }
        }

    }
}
