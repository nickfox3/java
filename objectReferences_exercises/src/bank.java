public class bank {
    public static void main(String[] args) {
        bankAccount account1 = new bankAccount("Nick", 1000.00);
        account1.displayInfo();

        account1.deposit(500);
        account1.displayInfo();
    }
}
