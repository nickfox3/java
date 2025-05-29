public class employee {
    // fields
    String name;
    static int totalEmployee = 0;

    // constructor
    public employee(String name) {
        this.name = name;
        totalEmployee++; // starts from 1
    }
}
