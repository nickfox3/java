public class convertToFahrenheit {
    public static double convert (double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        double result = convert (27);
        System.out.println("Fahrenheit: " + result);
    }
    }

