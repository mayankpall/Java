import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers up to 10. Enter 0 or a negative number to stop:");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double num = input.nextDouble();

            if (num <= 0) {
                System.out.println("Stopping...");
                break;
            }

            numbers[index] = num;
            index++;

            if (index == 10) {
                System.out.println("Maximum limit of 10 ");
                break;
            }
        }

        input.close();

        System.out.println("Entered Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal Sum of Numbers: " + total);
    }
}


