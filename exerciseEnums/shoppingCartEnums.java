public class shoppingCartEnums {

    // Enums must be declared outside of the main method
    enum OrderStatus {
        PENDING,
        PROCESSING,
        SHIPPED,
        DELIVERED
    }

    enum ShippingStatus {
        STANDARD,
        TWO_DAY,
        OVERNIGHT
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the shopping cart app!");

        // 1. Assign variables
        int productId = 1;
        int productCategory = 2;
        double productCost = 2.56;
        double productPrice = 4.99;
        int productQuantity = 78;

        // 2. Total cost
        double totalCost = productCost * productQuantity;
        System.out.println("Total Cost: $" + totalCost);

        // 3. Profit per product
        double profitPerProduct = productPrice - productCost;
        System.out.println("Profit per product: $" + profitPerProduct);

        // 4. Total potential profit
        double totalProfit = profitPerProduct * productQuantity;
        System.out.println("Total Profit: $" + totalProfit);

        // 5. Use enums
        OrderStatus status = OrderStatus.PROCESSING;
        ShippingStatus shipStatus = ShippingStatus.TWO_DAY;

        // Print all shipping statuses
        System.out.println(ShippingStatus.STANDARD);
        System.out.println(ShippingStatus.TWO_DAY);
        System.out.println(ShippingStatus.OVERNIGHT);

        // Declare and print order status
        OrderStatus orderStatus = OrderStatus.PROCESSING;
        System.out.println(OrderStatus.PENDING);
        System.out.println(OrderStatus.PROCESSING);
        System.out.println(OrderStatus.SHIPPED);
        System.out.println(OrderStatus.DELIVERED);

        // Declare and print shipping status
        ShippingStatus shippingStatus = ShippingStatus.TWO_DAY;
        System.out.println("Bye");
    }
}

