public class substring {
    public static void main(String[] args) {
    String sentence = "Learning Java is fun!";

    // extract substrings
    String w1 = sentence.substring(0,8);
    String w2 = sentence.substring(9, 13);
    String w3 = sentence.substring(17);

    System.out.println("First word: " + w1);
    System.out.println("Second word: " + w2);
    System.out.println("Third word: " + w3);
}
}
//First word: Learning
//Second word: Java
//Third word: fun!