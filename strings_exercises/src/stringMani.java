public class stringMani {
    public static void main(String[] args) {
        // 1. Declare and assign string variables
        String firstName = "Harry";
        String lastName = "Potter";
        String fullName = firstName + " " + lastName;

        // 2. Print full name
        System.out.println("Full name: " + fullName);

        // 3. Print length of full name
        System.out.println("Length: " + fullName.length());

        // 4. Print first character
        System.out.println("First character: " + fullName.charAt(0));

        // 5. Print index of letter 'r'
        System.out.println("Index of 'r': " + fullName.indexOf('r'));
    }
}

//Full name: Harry Potter
//Length: 12
//First character: H
//Index of 'r': 2
