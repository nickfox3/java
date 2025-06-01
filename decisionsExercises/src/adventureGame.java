import java.util.Scanner;

public class adventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Adventure game!!");
        System.out.println("You stand before a dark, mysterious cavern");
        System.out.println("Would you like to play? (Y/N)");

        // get user input
        String choice = scanner.nextLine().toLowerCase();

        // validate input
        if (choice.equals("y")) {
            System.out.println("Welcome to the game, let the adventure begin!");
            System.out.println("Inside there are 2 paths. Do you go left or right?");

            String path = scanner.nextLine().toLowerCase();

            if (path.equals("left")) {
                System.out.println("You walk down the left pathway and encounter a sleeping dragon!");
                System.out.println("Fight or Flee?");
                String action = scanner.nextLine().toLowerCase();

                if (action.equals("fight")) {
                    System.out.println("You fought bravely and beat the dragon. Treasure is near.");
                } else if (action.equals("flee")) {
                    System.out.println("You ran back to entrance");
                } else {
                    System.out.println("Invalid action!");
                }

            } else if (path.equals("right")) {
                System.out.println("You walk down the right pathway and find a treasure chest.");
                System.out.println("You found 3 artifacts: a gem, a key, a book.");
                System.out.println("Which one do you choose???");
                String artifacts = scanner.nextLine().toLowerCase();

                switch (artifacts) {
                    case "gem":
                        System.out.println("The gem glows brightly and shows you your future");
                        break;
                    case "key":
                        System.out.println("This key unlocks a secret passage to greater riches");
                        break;
                    case "book":
                        System.out.println("You open an ancient book and gain the wisdom of the gods");
                        break;
                    default:
                        System.out.println("Invalid decision, a trap door opens and you DIE!");
                        break;
                }

            } else {
                System.out.println("Invalid path! Please choose left or right.");
            }

        } else if (choice.equals("n")) {
            System.out.println("Decided to stay safe, Good luck next time.");
        } else {
            System.out.println("Invalid input. Please type (Y/N)");
        }

        scanner.close();
    }
}
