import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpellBook spellBook = new SpellBook();

        System.out.println("Welcome to the Spell Caster!");
        System.out.println("Type your spell incantation, 'help' for info, or 'quit' to exit.");

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


