import java.util.Scanner;

public class wordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask for sentence
        System.out.print("Enter a sentence: ");
        String word = scanner.nextLine();

        // split sentence into words using space
        String[] words = word.split(" ");

        // count and print
        System.out.println("The number of words is " + words.length);
    }
}
