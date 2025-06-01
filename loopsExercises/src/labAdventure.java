import java.util.Scanner;

public class labAdventure {
    public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            // Welcome message and variable setup
            System.out.println("Welcome to the Text Adventure Game!\n");

            boolean keepRunning = true;
            boolean key1 = false;
            boolean key2 = false;

            // Room descriptions
            String mainMenu = "\nYou find yourself in a room with 3 doors. Which one do you enter?" +
                    "\n1. The unpainted wooden door" +
                    "\n2. The black metal door" +
                    "\n3. The blue painted wooden door" +
                    "\nDoor Selection: ";

            String room1 = "You've entered a room lit with candles. You see a desk with half of a key!";
            String room1_visited = "You've entered a room lit with candles. You've been here before. The desk is empty.";

            String room2 = "You've entered a room cold and wet. You see a hole in the far wall. Something sparkles—it's half of a key!";
            String room2_visited = "You've entered a room cold and wet. You've been here before. Nothing new here.";

            String room3_locked = "You've found a room with a red door... it's locked. You need both halves of the key.";
            String room3_unlocked = "You've found a room with a red door... you use the full key and escape!";

            // Personalization
            System.out.print("Hello, please enter your name: ");
            String name = console.nextLine();
            System.out.println("Your name is: " + name);

            // Game loop
            while (keepRunning) {
                System.out.print(mainMenu);
                String direction = console.nextLine();

                switch (direction) {
                    case "1":
                        if (key1) {
                            System.out.println(room1_visited);
                        } else {
                            key1 = true;
                            System.out.println(room1);
                        }
                        break;

                    case "2":
                        if (key2) {
                            System.out.println(room2_visited);
                        } else {
                            key2 = true;
                            System.out.println(room2);
                        }
                        break;

                    case "3":
                        if (key1 && key2) {
                            System.out.println(room3_unlocked);
                            keepRunning = false;
                        } else {
                            System.out.println(room3_locked);
                        }
                        break;

                    default:
                        System.out.println("Unable to find the door you're looking for. Try again.");
                        break;
                }
            }

            // Exit message
            System.out.println("\nBye, " + name + "!");
            console.close();
        }
    }


