public class isEven {

    // Method that uses an if statement to check evenness
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = isEven(10);
        System.out.println("Is 10 even? " + result);
    }
}
