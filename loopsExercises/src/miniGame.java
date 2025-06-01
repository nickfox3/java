import java.util.Scanner;
import java.util.Random;

public class miniGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] randomList = {"apple", "banana", "cherry", "watermelon."};

        Random rand = new Random();
        String correctWord = randomList[rand.nextInt(randomList.length)];

        // keep asking until correct
        System.out.println("Guess a fruit: ");
        String userInput = scanner.nextLine();

        if (userInput.equals(correctWord)) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("Invalid choice!");

            while (!userInput.equalsIgnoreCase(correctWord)) {
                System.out.println("Your guess was incorrect, Try again.");

                StringBuilder hint = new StringBuilder();

                int maxIndex;
                if (userInput.length() < correctWord.length()) {
                    maxIndex = userInput.length();
                } else {
                    maxIndex = correctWord.length();
                }

// Build the hint string
                for (int i = 0; i < maxIndex; i++) {
                    if (userInput.charAt(i) == correctWord.charAt(i)) {
                        hint.append(correctWord.charAt(i)); // correct letter in correct spot
                    } else {
                        hint.append("_"); // incorrect letter
                    }
                }

// Fill remaining with underscores if guess is shorter than the word
                while (hint.length() < correctWord.length()) {
                    hint.append("_");
                }

                System.out.println("Hint: " + hint.toString());
                System.out.println("Please guess again: ");
                userInput = scanner.nextLine();
            }
            System.out.println("Guessed it right!");

        }
    }
}
