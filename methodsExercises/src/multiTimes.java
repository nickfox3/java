public class multiTimes {

    public static void printMultiTimes(String text, int times) {

        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        printMultiTimes("Hello", 3);
        printMultiTimes("Bye", 4);
        printMultiTimes("Hi again", 5);
    }
}
