public class creditCard extends Payment {
    private final long accountNumber;
    private final String cardVendor;

    public creditCard(long accountNumber, String cardVendor) {
        this.accountNumber = accountNumber;
        this.cardVendor = cardVendor;
    }

    // getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getCardVendor() {
        return cardVendor;
    }

    // override
    @Override
    public String toString() {
        return "Credit Card - Vendor: " + cardVendor + ", Account Number: " + accountNumber;
    }
}
