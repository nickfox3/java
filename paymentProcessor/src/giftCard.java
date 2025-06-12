public class giftCard extends Payment {
    private final String accountNumber;
    private double balance;
    private int loyaltyPoints;

    public giftCard(String accountNumber, double balance, int loyaltyPoints) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.loyaltyPoints = loyaltyPoints;
    }

    public boolean processPayment(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            balance -= amount;
            loyaltyPoints += 10;
            System.out.println("Gift Card payment successful. Remaining balance: " + balance);
            return true;
        }
    }

    public boolean loyaltyPointsChanged(double amount) {
        loyaltyPoints += (int) (amount * 100);
        System.out.println("Loyalty Points: " + loyaltyPoints);
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "GiftCard [Account Number: " + accountNumber +
                ", Balance: $" + balance +
                ", Loyalty Points: " + loyaltyPoints + "]";
    }
}

