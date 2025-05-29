public class splittingStrings {
    public static void main(String[] args) {
        String csvData = "Apple, banana, grape, banana";
// splits strings into separate lines
        String [] fruits = csvData.split(",");

        // loop through
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit " + (i +1) + ": " + fruits[i]);
        }

    }
}

//Fruit 1: Apple
//Fruit 2:  banana
//Fruit 3:  grape
//Fruit 4:  banana
