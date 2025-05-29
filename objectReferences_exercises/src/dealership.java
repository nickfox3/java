public class dealership {
    public static void main(String[] args) {
        // 2 car objects
        car car1 = new car("Kia", "K5", 2024);
        car car2 = new car("GMC", "Sierra", 2025);

        // display their info
        car1.displayInfo(1);
        car2.displayInfo(2);
    }
}

