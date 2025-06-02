public class recursion {

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

        public static void main (String[]args){
            System.out.println("Factorial of 5: " + factorial(5));
            System.out.println("Factorial of 6: " + factorial(6));
            System.out.println("Factorial of 10: " + factorial(7));
        }
    }

