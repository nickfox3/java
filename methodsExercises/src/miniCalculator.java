public class miniCalculator {
    public static void calculator(int num1, int num2, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operator" + operator);
        }
    }
    public static void main(String[] args) {
        calculator (10, 5, '+');
        calculator (10, 5, '*');
        calculator (10, 5, '/');
        calculator (10, 0, '/');
        calculator (10, 5, '%');

    }
}
