import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class multiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user for number
        System.out.println("Enter a number to print its multiplication tables: ");
        int number = scanner.nextInt();

        //multi table from 1 to 10
        System.out.println("Multiplication table for" + number + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
