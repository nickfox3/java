import java.util.Scanner;

public class TerminalUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getMenuChoice() {
        print("""
                === Media Menu Application ===
                1. Add media
                2. Remove media
                3. Play Media
                4. List all media
                5. Quit
                """);
        System.out.print("Choose an option: ");
        return scanner.nextLine().trim();
    }

    public static String getIndexToPlay() {
        System.out.print("Enter index of media to play: ");
        return scanner.nextLine().trim();
    }

    public static String getIndexToRemove() {
        System.out.print("Enter index of media to remove: ");
        return scanner.nextLine().trim();
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static Media addMedia() {
        try {
            return promptMediaInput();
        } catch (NumberFormatException e) {
            print("Invalid input. Please enter valid numbers for numeric fields.");
            return null;
        } catch (Exception e) {
            print("An error occurred while adding media: " + e.getMessage());
            return null;
        }
    }

    public static Media promptMediaInput() {
        print("""
                Select Media Type:
                1. Video
                2. Audio
                3. Image
                4. Book
                """);

        String type = scanner.nextLine().trim();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        switch (type) {
            case "1" -> {
                System.out.print("Enter duration (minutes): ");
                int duration = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter resolution (e.g., 1080p): ");
                String res = scanner.nextLine();
                return new videoClass(name, duration, res) {

                };
            }
            case "2" -> {
                System.out.print("Enter duration (minutes): ");
                int duration = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter artist name: ");
                String artist = scanner.nextLine();
                return new audioClass(name, duration, artist) {

                };
            }
            case "3" -> {
                System.out.print("Enter dimensions (e.g., 1920x1080): ");
                String dim = scanner.nextLine();
                System.out.print("Enter file format (e.g., PNG): ");
                String format = scanner.nextLine();
                return new imageClass(name, dim, format) {
                };
            }
            case "4" -> {
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter page count: ");
                int pages = Integer.parseInt(scanner.nextLine());
                return new bookClass(name, author, pages) {
                };
            }
            default -> {
                print("Invalid media type.");
                return null;
            }
        }
    }
}
