import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Payment> payments = new ArrayList<>();

        payments.add(new creditCard(12345, "Navy Federal"));
        payments.add(new directDebit(0.015, "United"));
        payments.add(new giftCard("0987654", 1000.0, 50));

        double amountToProcess = 200.0; // example

        for (Payment p : payments) {
            System.out.println(p); // print the current payment's toString
            boolean result = p.processPayment(amountToProcess); // process actual amount
            System.out.println("Payment processed: " + result);
        }
    }
}
