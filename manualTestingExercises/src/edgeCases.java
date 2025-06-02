public class edgeCases {

        // 1. Method to select a drink based on user input
        public static String selectDrink(String choice) {
            choice = choice.toLowerCase();

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
                    "You selected soda",
                    "You selected juice",
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
        }
    }

