import java.util.Scanner;

public class GroceryStoreDiscountCalculator {
    public static void main(String[] args) {
                
         Scanner scanner = new Scanner(System.in);
       
        
        System.out.print("Enter the total purchase amount: PHP ");
        double totalAmount = scanner.nextDouble();
       
        
        double discount = 0.0;
        double finalPrice = totalAmount;
       
        
        if (totalAmount < 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (totalAmount < 1000) {
            discount = 0;
            System.out.println("No discount applied.");
        } else if (totalAmount <= 5000) {
            discount = 5;
        } else if (totalAmount <= 10000) {
            discount = 10;
        } else {
            discount = 15;
        }
       
        
        if (discount > 0) {
            double discountAmount = totalAmount * (discount / 100);
            finalPrice = totalAmount - discountAmount;
        }
       
        
        if (totalAmount >= 0) {
            System.out.println("Discount applied: " + discount + "%");
            System.out.println("Final price after discount: PHP " + finalPrice);
        }
       
        
        scanner.close();
    }
}
