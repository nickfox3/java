import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask the user for word
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        // print word in reverse
        System.out.print("Reversed: ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
}
