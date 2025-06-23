import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// checks if file exists
        System.out.println("Working directory: " + System.getProperty("user.dir"));
        File file = new File("student_data.txt");

        System.out.println(file.exists());

// writes and append to file
        try {
            FileWriter writer = new FileWriter("student_data.txt");
            writer.write("Alice, A\n");
            writer.write("Bob, B\n");
            writer.write("Charlie, A+\n");
            writer.append("David, B+\n");
            writer.append("Eva, A\n");
            writer.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

// reads file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student_data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        // creates, deletes, and sends message if the file was deleted
        File file2 = new File("data2.txt");
        try {
            boolean created = file2.createNewFile();
            System.out.println("Absolute Path" + file2.getAbsolutePath());
            boolean deleted = file2.delete();
        } catch (IOException e) {
            System.out.println("Couldn't delete file");
        }
    }
}

