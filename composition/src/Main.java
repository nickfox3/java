import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // name of artifact
        System.out.print("Enter the name of the artifact: ");
        String name = scanner.nextLine();

        // year of discovery
        System.out.print("Enter the year of discovery: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        // name of discoverer
        System.out.print("Enter the first name of the discoverer: ");
        String dFirst = scanner.nextLine();
        System.out.print("Enter the last name of the discoverer: ");
        String dLast = scanner.nextLine();
        System.out.print("Enter the primary specialty of the discoverer: ");
        String dSpecialty = scanner.nextLine();

        Person discoverer = new Person(dFirst, dLast, dSpecialty);

        // curator == discoverer || curator != discoverer
        System.out.print("Is the discoverer also the curator (Y/N)? ");
        String response = scanner.nextLine();

        // curator info if else
        Person curator;
        if (response.equalsIgnoreCase("Y")) {
            curator = discoverer;
        } else {
            System.out.print("Enter the first name of the curator: ");
            String cFirst = scanner.nextLine();
            System.out.print("Enter the last name of the curator: ");
            String cLast = scanner.nextLine();
            System.out.print("Enter the primary specialty of the curator: ");
            String cSpecialty = scanner.nextLine();

            // creates curator as a new file
            curator = new Person(cFirst, cLast, cSpecialty);
        }

        // artifact file
        Artifact artifact = new Artifact(name, year, discoverer, curator);

        // output results
        System.out.println("\n==== Artifact Report ====");
        System.out.println(artifact.toString());
    }
}
