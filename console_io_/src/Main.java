import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
//        // type, name, initialize/assign
       Scanner io = new Scanner(System.in);
// static - can use it without assigning a object, and only 1
       System.out.print("Enter the party name");
       String name = io.nextLine();
// static members are accessed via the class name, not the object instance
       System.out.prijnt("Enter the party size: ");
       int size = Integer.parseInt(io.nextLine());

       reservation r1 = new reservation("Wise", 3);
       reservation r2 = new reservation("Female", 2);

       System.out.println(r1 == r2); // not equal, 2 different data points

       r1.printInfo();
//
//        System.out.println("Enter your favorite movie: ");
//        String movie = io.nextLine();
//        String name = io.nextLine();
//
//        System.out.println("Hello " + name);
//        System.out.println("Your favorite movie is:" + movie);
//        int age = Integer.parseInt(io.nextLine());
//
//        System.out.printf("%s, you are %d years old. Your favorite movie is $s.", name, age, movie);
//        // val = list(data) constructor

        // Enter your name:
        // nick
        // Hello nick

       // %d = integers (whole numbers)
       // %f floating point(double and float)
       // %s string
       // %c character
       // %b boolean
       // %x hexadecimal
       // %e scientific notation
       // %n adds a next line
//    System.out.print("Enter the price");
//    double price = Double.parseDouble(io.nextLine());
//
//    System.out.printf("The total price is in: $%.2f", price);
//    System.out.printf("Roses are red. %nViolets are blue.%n");
//
//    System.out.printf("|%10s|%n", "hello"); // writes a line where the %10 is - 10 spaces taken - right
//       System.out.printf("|%-10s|", "world"); // takes a lien where the %-10 is - 10 spaces left taken
//
//       int upc =  1283;
//       System.out.printf("Bar code: %05d%n" , upc); // adds zeros to the front
       // %010 10 digits in total, the remaining digits adds a zero in the front

       // STRINGS
//       String iceCream = "Mint chocolate chip";
//
//       String s2 = null;
//        if (s2 != null) {
//            System.out.println(s2.chars());
//        } else {
//            System.out.println(s2.toLowerCase());

       // string equality
//       String s1 = "house";
//       String s2 = "mouse";
//       String s3 = "house";
//       String s4 = new String("house");
//
//       // always use .equals for comparison, == will take up the string above
//       System.out.println(s1.equals(s3));
//       System.out.println(s1.equals(s2));
//       System.out.println(s1 == s4);
//       System.out.println(s1.equals(s4)); // notice it already had a string with that value, took up that string
//
//        String s1 = "Sprocket";
//
//        int length = s1.length(); // variables cant float, need to give a string a function
//       System.out.printf("The string %s has a length of %d.%n", s1, length); // tells length of string
//
//       int k = s1.index0f('k');
//       System.out.printf("We found an 'k' at %d.%n", k); // finds index

       // substring
//       String name = "Joe Somebody";
//
//       int space = name.index0f(' ');
//       String firstname = name.substring(5); // never includes the number
//       System.out.printf(firstname); // prints Joe
//
//       String csv = "red, green, blue";
//       String[] colors = csv.split(" ");
//
//       //    start index      condition       increment/decrement
//       for (int i=0; i < colors.length; i ++) {
//           System.out.println(colors[0]);

//       String s1 = "hello_there";
//
//       String s2 = s1.replace( "_", " ");
//
//       System.out.println(s2);
//       }

    }
}