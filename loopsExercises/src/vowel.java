import java.util.Locale;
import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask for word
        System.out.println("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        boolean vowelFound = false;

        // loop to find vowel
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(" First vowel " + ch + " found at position " + i);
                vowelFound = true;
                break;
            }
        }

        if (!vowelFound) {
            System.out.println("No vowel found");
        }
    }
}
