public class task3 {

    // 1. Method to select a drink based on user input
    public static String selectDrink(String choice) {
        choice = choice.toLowerCase(); // make case-insensitive

        if (choice.equals("water")) {
            return "You selected Water";
        } else if (choice.equals("soda")) {
            return "You selected Soda";
        } else if (choice.equals("juice")) {
            return "You selected Juice";
        } else {
            return "Invalid selection";
        }
    }

    // 2. Method to automatically test selectDrink
    private static void runTests() {
        String[] inputs = {"water", "juice", "soda", "coffee"};
        String[] expected = {
                "You selected Water",
                "You selected Juice",
                "You selected Soda",
                "Invalid selection"
        };

        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            String actual = selectDrink(input);
            System.out.print("Testing \"" + input + "\"... ");
            if (actual.equals(expected[i])) {
                System.out.println("Passed!");
            } else {
                System.out.println("FAILED! Expected: \"" + expected[i] + "\", got: \"" + actual + "\"");
            }
        }
    }

    // 3. Main method to start testing
    public static void main(String[] args) {
        runTests();

        // Example user input test
        String choice = "Juice";
        String result = selectDrink(choice);
        System.out.println("Received Input: " + choice);
        System.out.println("Lowercased input: " + choice.toLowerCase());
        System.out.println("Selected:" + result);
    }
}
