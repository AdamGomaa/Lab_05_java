import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class ShippingCostCalculator {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(in);
        double price = 100;
        System.out.print("Enter the item price: $");
        double itemPrice = scanner.nextDouble();
        double shippingFee = 0;
        if (itemPrice > price) {
            System.out.print("Your shipping price is free ");
        } else {
            shippingFee = itemPrice * 0.02;
        }
        double totalCost = itemPrice + shippingFee;
        System.out.printf("Shipping Cost: $" + shippingFee);
        System.out.printf(" Total Price: $" + totalCost);
    }
}

