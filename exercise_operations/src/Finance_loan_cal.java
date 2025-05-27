public class Finance_loan_cal {
    public static void main(String[] args) {
        double loanAmount = 25000.000; // in dollars
        double annualInterestRate = 5.5; // as a percentage
        int loanTermYears = 5;
        double monthlyPayment;

        // 1. Use Assignment Operators
        loanAmount += 5000; // Increase by $5,000
        annualInterestRate -= 1.0; // Reduce by 1%
        loanTermYears++; // Increase loan term by 1 year

        // Calculate monthly payment
        monthlyPayment = (loanAmount * (annualInterestRate / 100)) / 12;

        // Display results
        System.out.println("Updated Loan Amount: $" + loanAmount);
        System.out.println("Updated Interest Rate: " + annualInterestRate + "%");
        System.out.println("Updated Loan Term (Years): " + loanTermYears);
        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);

        // 2. Use Comparison Operators
        boolean isLoanAbove30k = loanAmount > 30000;
        boolean isPaymentAbove500 = monthlyPayment > 500;

        System.out.println("Is the loan amount above $30,000? " + isLoanAbove30k);
        System.out.println("Is the monthly payment above $500? " + isPaymentAbove500);

        // 3. Use Logical Operators
        if (isLoanAbove30k && isPaymentAbove500) {
            System.out.println("This is a high-value and high-payment loan.");
        } else if (isLoanAbove30k || isPaymentAbove500) {
            System.out.println("This loan meets at least one high threshold.");
        } else {
            System.out.println("This is a moderate loan.");
        }
    }
}
