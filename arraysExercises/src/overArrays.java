import java.util.Scanner;

public class overArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Declare array
        String[] cities = { "New York", "Chicago", "Los Angeles", "Phoenix", "Miami" };

        // Step 4: Print elements using a for loop
        System.out.println("All cities:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        // Step 5: Print cities in reverse order
        System.out.println("\nCities in reverse order:");
        for (int i = cities.length - 1; i >= 0; i--) {
            System.out.println(cities[i]);
        }

        // Step 6: Search for a specific city
        System.out.print("\nEnter a city name to search: ");
        String userInput = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equalsIgnoreCase(userInput)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("City found!");
        } else {
            System.out.println("City not found!");
        }

        scanner.close();
    }
}


