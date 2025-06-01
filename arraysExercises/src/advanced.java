import java.util.Random;

public class advanced {
    public static void main(String[] args) {
        Random rand = new Random();

        // === 10. Count Occurrences of the number 3 ===
        int[] numbers = new int[10];
        int count3s = 0;

        System.out.print("Random numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(5) + 1; // range 1 to 5
            System.out.print(numbers[i] + " ");
            if (numbers[i] == 3) {
                count3s++;
            }
        }
        System.out.println("\nNumber 3 appears " + count3s + " times.\n");

        // === 11. Shift Elements in an Array ===
        int[] shiftArray = {1, 2, 3, 4, 5};
        int first = shiftArray[0];

        for (int i = 0; i < shiftArray.length - 1; i++) {
            shiftArray[i] = shiftArray[i + 1]; // shift left
        }
        shiftArray[shiftArray.length - 1] = first; // move first to last

        System.out.print("Shifted array: ");
        for (int num : shiftArray) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // === 12. Check for Duplicates in Student Names ===
        String[] students = {"Alice", "Bob", "Charlie", "Diana", "Alice", "Eve"};
        boolean hasDuplicates = false;

        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].equalsIgnoreCase(students[j])) {
                    hasDuplicates = true;
                    break;
                }
            }
            if (hasDuplicates) break;
        }

        if (hasDuplicates) {
            System.out.println("Duplicates found!");
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
