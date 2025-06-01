import java.util.Scanner;

public class bankWithdraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;
        int choice;

        while (true) {
            System.out.println("How much do you want to withdraw? ");
            double withdrawAmount = scanner.nextDouble();

            if (withdrawAmount > balance) {
                System.out.println("Denied transaction");
            } else if (withdrawAmount <= balance) {
                balance -= withdrawAmount;
                System.out.println("Withdraw successful. Your balance is: " + balance);
            } else if (balance == 0) {
                System.out.println("No more funds to withdraw");
                break;
            } else {
                System.out.println("Goodbye!");
            }

        }
    }
}
