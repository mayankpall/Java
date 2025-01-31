import java.util.Scanner;

public class TotalPriceCalculator {

    static double calculateTotalPrice(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price of the item in INR : ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity bought: ");
        int quantity = input.nextInt();

        double totalPrice = calculateTotalPrice(unitPrice, quantity);

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and the unit price is INR " + unitPrice);

        input.close();
    }
}
