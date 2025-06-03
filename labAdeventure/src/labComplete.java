import java.util.Scanner;

public class labComplete {
    public static void main(String[] args) {
        System.out.println("Welcome to the Text Adventure Game!\n");

        boolean keepRunning = true;
        boolean[] keys = new boolean[4]; // Track keys for doors 1–4

        // Room messages
        String[] rooms = new String[5];
        rooms[0] = "You've entered a room lit with candles. You see a desk and find part of a key!";
        rooms[1] = "You've entered a room cold and wet. You see a sparkle in the wall — it's part of a key!";
        rooms[2] = "You've entered a dry, warm room with a rug. Under it you find a piece of a key!";
        rooms[3] = "You've entered a room with armor. One holds a key piece around its neck!";
        rooms[4] = "You've entered a red room with a black door... it's locked. Do you have all the key pieces?";

        String[] unlockedRooms = new String[5];
        unlockedRooms[0] = "You're back in the candle room. Nothing left here.";
        unlockedRooms[1] = "You're back in the cold room. It's still empty.";
        unlockedRooms[2] = "You're back in the warm room. The rug is undisturbed.";
        unlockedRooms[3] = "You're back in the armor room. It's quiet now.";
        unlockedRooms[4] = "The final black door unlocks with your keys! You escape!";

        // Prompt for name
        String name = "";
        try {
            name = promptString("Please enter your name:");
            System.out.println("Hello, " + name + "!");
        } catch (Exception e) {
            System.out.println("Error reading name. Defaulting to 'Player'.");
            name = "Player";
        }

        Scanner scanner = new Scanner(System.in);

        while (keepRunning) {
            // Show menu
            System.out.println("\nYou find yourself in a room with 5 doors. Which one do you enter?");
            System.out.println("1. The unpainted wooden door");
            System.out.println("2. The black metal door");
            System.out.println("3. The blue painted wooden door");
            System.out.println("4. The yellow painted wooden door");
            System.out.println("5. The green painted wooden door");

            System.out.print("Door selection (1–5): ");
            String input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        findKeyAndDisplayRoomText(rooms, unlockedRooms, keys, choice - 1);
                        break;

                    case 5:
                        boolean allKeys = true;
                        for (boolean key : keys) {
                            if (!key) {
                                allKeys = false;
                                break;
                            }
                        }
                        if (allKeys) {
                            System.out.println(unlockedRooms[4]);
                            keepRunning = false;
                        } else {
                            System.out.println(rooms[4]);
                        }
                        break;

                    default:
                        System.out.println("Please choose a door between 1 and 5.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number (1–5).");
            }
        }

        System.out.println("\nBye, " + name + "! Thanks for playing.");
    }

    public static String promptString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message + " ");
        return scanner.nextLine();
    }

    public static void findKeyAndDisplayRoomText(String[] rooms, String[] unlockedRooms, boolean[] keys, int index) {
        if (keys[index]) {
            System.out.println(unlockedRooms[index]);
        } else {
            System.out.println(rooms[index]);
            keys[index] = true;
        }
    }
}


