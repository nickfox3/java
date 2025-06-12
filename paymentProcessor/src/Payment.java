public class Payment {
    protected double amount;

    public Payment() {
        this.amount = 0;
    }

    public Payment(double amount) {
        this.amount = amount;
    }
    public boolean processPayment(double amountToProcess) {
        System.out.println("Processing payment of $" + amount);
        return true;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}