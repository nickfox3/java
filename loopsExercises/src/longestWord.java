import java.util.Scanner;

public class longestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt user for sentence
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // split and loop through words in next step
        String[] words = sentence.trim().split(" ");

        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i].toLowerCase();
            }
        }
        // output result
                System.out.println("Your longest word is:" + longestWord);
            }
        }

