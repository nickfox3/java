import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 500.00;
        int choice;

        do {
            // display menu
            System.out.println("\n==== ATM MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // withdraw
                    System.out.println("Enter amount to withdraw: $ ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= balance && withdrawAmount > 0) {
                        balance -= withdrawAmount;
                        System.out.println("Withdraw successful. Your balance is: " + balance);
                    } else {
                        System.out.println("Insufficient balance. Please try again.");
                    }
                    break;

                case 2: //  deposit
                    System.out.println("Enter amount to deposit: $ ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful. Your balance is: " + balance);
                    } else {
                        System.out.println("Insufficient balance. Please try again.");
                    }
                    break;

                case 3: // check balance
                    System.out.printf("Current balance: $%.2f\n ", balance);
                    break;

                case 4: // exit
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
            }while (choice != 4) ;
        }
    }
