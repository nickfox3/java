import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Connectable[] devices = new Connectable[5 + 1];

        devices[1] = new TV("Living Room");
        devices[2] = new TV("Kids Bedroom");
        devices[3] = new Toaster("Kitchen toaster");
        devices[4] = new Fridge("Kitchen fridge");
        devices[5] = new TV("Master Bedroom");

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Device Control ===");
        for (Connectable device : devices) {
            if (device != null) {
                System.out.println(device.getStatus());
                System.out.print("Turn this device ON or OFF? (YES/NO): ");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("YES")) {
                    device.turnOn();
                } else if (input.equalsIgnoreCase("NO")) {
                    device.turnOff();
                } else {
                    System.out.println("Invalid input. Skipping...");
                }
            }
        }

        System.out.println("\n===  Device Status ===");
        for (Connectable device : devices) {
            if (device != null) {
                System.out.println(device.getStatus());
            }
        }
    }
}

