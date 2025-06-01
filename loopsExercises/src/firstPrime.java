public class firstPrime {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("First prime number found:" + number);
                break;
            }
        }
    }
}


