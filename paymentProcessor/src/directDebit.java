public class directDebit extends Payment {
    public long routingNumber;
    public long accountNumber;
    public String bankName;
    public double processingFee;

    // constructor
    public directDebit(double processingFee, String bankName) {
        this.processingFee = processingFee;
        this.bankName = bankName;
    }
    // setters for account and routing
    public void setAccountDetails(long routingNumber, long accountNumber) {
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
    }

    // override
    @Override
    public boolean processPayment(double amountToProcess) {
        System.out.println("Direct debit processing fee: $" + processingFee);
        System.out.println("Sending transaction to bank: " + bankName + "...");
        return true;
    }
    @Override
    public String toString() {
        return "Direct Debit - Bank: " + bankName + ",Processing Fee: $" + processingFee;
    }

}
