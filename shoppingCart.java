public class shoppingCart { public static void main(String[] args) {
    System.out.println("Welcome to the shopping cart app!");
    //1. Assign variables to each of the elements above.
    int productId = 1;
    int productCategory = 2;
    double productCost = 2.56;
    double productPrice = 4.99;
    int productQuantity = 78;

    // 2. total cost of the product based on the inventory.
    double totalCost = productCost * productQuantity;
    System.out.println("Total Cost: " + totalCost);

    // 3.the profit in dollars of the product,
    double profitPerProduct = productPrice - productCost;
    System.out.println("Profit in dollars: " +
            profitPerProduct);

    //4. the total potential profit.
// total profit = profitPerProduct * productQuantity
    double totalProfit = profitPerProduct * productQuantity;
    System.out.println("Total Profit: " + totalProfit);
}
}
