public class happyPath {
    public static String selectDrink(String choice) {
        choice = choice.toLowerCase();

        if (choice.equals("water")) {
            return "You selected Water";
        } else if (choice.equals("juice")) {
            return "You selected juice";
        } else if (choice.equals("soda")) {
            return "You selected soda";
        } else {
            return "invalid choice";
        }
    }

    private static void runTests() {
        String[] inputs = {"water", "juice", "soda", "coffee"};
        String []expected = {
                "You selected Water",
                "You selected Soda",
                "You selected Juice",
                "You selected Coffee"
        };

        for(int i =0; i < inputs.length; i++) {
            String input = inputs[i];
            String actual = selectDrink(input);
            System.out.print("Testing \"" + input + "\" ....");
            if (actual.equals(expected[i])) {
                System.out.println(" PASSED");
            } else {
                System.out.println(" FAILED!");
            }
        }
    }
    public static void main(String[] args) {
    runTests();}
}
