import java.util.Scanner;
import java.util.Random;

public class guessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // generate random number
        int target = rand.nextInt(50) + 1;
        int guess;

        // guessing loop
        do {
            System.out.print("Guess a number between 1 and 50: ");
            guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Your guess is too low!");
            } else if (guess > target) {
                System.out.println("Your guess is too high!");
            }
        } while (guess != target);

        System.out.println("Correct! You guessed the number.");
    }
}
