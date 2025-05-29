public class account {
    private double balance;
    private String accountBalance;

    public account(String number, double balance) {
        this.accountBalance = number;
        this.balance = balance;
    }
    // encapsulation, "data hiding"
    public void Deposit(double amount) {
        this.balance += amount;
    }
    public double withdraw(double amount) {
        if (amount > this.balance) {
            return 0;
        }

        // ok, deduct the amount and turn the new balance
            balance -= amount;
            return balance;
        }
    }

