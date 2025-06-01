public class numericArrays {
    public static void main(String[] args) {
        // Step 7: Create array of test scores
        int[] scores = {88, 92, 75, 100, 83};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        // Loop through scores to calculate sum, max, and min
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }
        }

        // Step 9: Calculate average
        double average = (double) sum / scores.length;

        // Print results
        System.out.println("Sum of test scores: " + sum);
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.println("Average score: " + average);
    }
}
