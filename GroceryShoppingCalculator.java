import java.util.Scanner;

public class GroceryShoppingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        double price1 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = scanner.nextInt();

        System.out.print("Enter the price of item 2: ");
        double price2 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = scanner.nextInt();

        System.out.print("Enter the price of item 3: ");
        double price3 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = scanner.nextInt();

        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double discount = 0.05 * subtotal;
        double discountedTotal = subtotal - discount;

        double tax = 0.12 * discountedTotal;
        double finalTotal = discountedTotal + tax;

        System.out.printf("Subtotal       : PHP %.2f%n", subtotal);
        System.out.printf("Discount       : PHP %.2f%n", discount);
        System.out.printf("Sales Tax      : PHP %.2f%n", tax);
        System.out.printf("Final Total    : PHP %.2f%n", finalTotal);
        
        scanner.close();
    }
}
