import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String LOG_FILE = "user_log.txt";
    private static String name;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Perform an action");
            System.out.println("2. View log");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addLogEntry(scanner);
                    break;
                case "2":
                    viewLogEntries();
                    break;
                case "3":
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addLogEntry(Scanner scanner) {
        System.out.print("Enter the action performed: ");
        String action = scanner.nextLine();

        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            // the true -- appends to file without overwriting it
            writer.write(name + " --- " + action + "\n");
            System.out.println("Entry added.");
        } catch (IOException e) {
            System.out.println("Error adding entry");
        }
    }

    private static void viewLogEntries() {
        System.out.println("\n--- Log Contents ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading log file ");
        }
    }
}
