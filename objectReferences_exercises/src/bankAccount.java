public class bankAccount {
    // fields
    String owner;
    double balance;

    // constructor
    public bankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + "into" + owner + " s account.");
        } else {
            System.out.println("Deposit must be positive");
        }
    }

    // method to display acc info
    public void displayInfo() {
        System.out.println("Owner: " + owner + " | Balance $: " + balance);
    }
}
