import java.util.Arrays;
import java.util.Random;

public class arraySorting {
    public static void main(String[] args) {
        // === Challenge 14: Sort an Array of Fruit Names ===
        String[] fruits = {"Banana", "Apple", "Grape", "Mango", "Cherry"};

        // Sort alphabetically
        Arrays.sort(fruits);

        System.out.println("Sorted fruit names:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();

        //  Sort an Array of Random Numbers ===
        int[] numbers = new int[10];
        Random rand = new Random();

        // Fill array with random numbers between 1–100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }

        // Print original array
        System.out.println("Original numbers:");
        System.out.println(Arrays.toString(numbers));
    }
}
