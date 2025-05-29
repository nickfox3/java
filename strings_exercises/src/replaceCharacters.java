public class replaceCharacters {
    public static void main(String[] args) {
        String sentence = "The quick brown fox";

        // replace quick with slow
        sentence = sentence.replace("quick", "slow");
        // replace space with underscores
        sentence = sentence.replace(" ", "_");
        // print modified string
        System.out.println("Modified sentence: " + sentence);
    }
}
//Modified sentence: The_slow_brown_fox