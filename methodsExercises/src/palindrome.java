public class palindrome {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) != str.charAt(str.length()- 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word2 = "racecar";
        String word1 = "car";

        System.out.println(word1 + " is a palindrome? " + isPalindrome(word1));
        System.out.println(word2 + " is a palindrome? " + isPalindrome(word2));
    }
}
