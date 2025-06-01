import java.util.Scanner;

public class basicArrays {
    public static void main(String[] args) {
        String[] cities = { "New York", "Chicago", "Houston", "Phoenix", "Miami" };
        Scanner input = new Scanner(System.in);

            // Step 2: Modify the 3rd city (index 2)
            cities[2] = "Los Angeles";

            // Print updated array
            System.out.println("Updated list of cities:");
        for (String city : cities) {
            System.out.println(city);
        }

            // Step 3: Print length of array
            System.out.println("\nTotal number of cities: " + cities.length);
        }


    }
