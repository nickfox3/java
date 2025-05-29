public class car {
    // Fields
    String brand;
    String model;
    int year;

    // Constructor
    public car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car info
    public void displayInfo(int carNumber) {
        System.out.println("Car " + carNumber + ": " + brand + " " + model + " (" + year + ")");
    }
}
