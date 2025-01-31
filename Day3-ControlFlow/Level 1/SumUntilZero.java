import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter number: ");
            double currentNumber = input.nextDouble();

            if (currentNumber == 0) {
                System.out.println("You have entered 0. Exiting...");
                break;
            }

            total += currentNumber;
        }

        System.out.println("Your total is: " + total);

        input.close();
    }
}
