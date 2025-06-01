import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask for number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        // loop to find prime
        if (number <= 1) {
            isPrime = false;
        } else {
            // check divisibility from 2 to number -1
            for (int i = 2; i <= number /2; i++) {
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
