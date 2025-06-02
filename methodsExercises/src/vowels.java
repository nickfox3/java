public class vowels {

    // Method to count vowels in a given word
    public static void countVowels(String word) {
        int count = 0;
        word = word.toLowerCase(); // Make it case-insensitive

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels in \"" + word + "\": " + count);
    }

    public static void main(String[] args) {
        countVowels("Hello World");
        countVowels("Programming");
        countVowels("Java");
    }
}
