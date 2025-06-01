import java.util.Scanner;

public class numReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask the user for num
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        // convert number to string
        String numStr = String.valueOf(num);

        // print word in reverse
        System.out.print("Reversed: ");
        for (int i = numStr.length() - 1; i >= 0; i--) {
            System.out.print(numStr.charAt(i));
        }
        System.out.println();
    }
}
