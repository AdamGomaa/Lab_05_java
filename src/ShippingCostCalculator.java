import java.util.Scanner;

import static java.lang.System.in;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        double price = 100;
        System.out.print("Enter the item price: $");
        double itemPrice = scanner.nextDouble();
        double shippingFee = 0;
        double totalCost;
        if (itemPrice >= price) {
            System.out.print("Your shipping price is free ");
        } else {
            totalCost = itemPrice + shippingFee;
            shippingFee = itemPrice * 0.02;
            System.out.printf("Shipping Cost: $" + shippingFee);
        }
        totalCost = itemPrice + shippingFee;
        System.out.printf(" Total Price: $" + totalCost);
    }
}

