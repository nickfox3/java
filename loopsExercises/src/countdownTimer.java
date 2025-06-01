import java.util.Scanner;

public class countdownTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // starting number
        System.out.print ("Enter a number to start the countdown: ");
        int number = scanner.nextInt();

        // countdown using while
        while (number > 0) {
            System.out.println (number);
            number--; // going down from input value
        }
        // final message
        System.out.println ("Blast off!!!");
    }
}
