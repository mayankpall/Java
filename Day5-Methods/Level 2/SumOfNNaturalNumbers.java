import java.util.Scanner;

public class SumOfNNaturalNumbers {

    static int getSumUsingFormula(int number) {
        return number * (number + 1) / 2;
    }

    static int getSumUsingRecursion(int number) {
        if (number == 0) return 0;
        return number + getSumUsingRecursion(number - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer to find the sum of natural numbers: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Error: Please enter a positive integer.");
        } else {
            int sumUsingFormula = getSumUsingFormula(number);
            int sumUsingRecursion = getSumUsingRecursion(number);

            boolean isEqualSum = sumUsingFormula == sumUsingRecursion;

            System.out.println("\nSum Calculation:");
            System.out.println("Using Formula: " + sumUsingFormula);
            System.out.println("Using Recursion: " + sumUsingRecursion);
            System.out.println("Are both sums equal ? " + isEqualSum);
        }

        input.close();
    }
}
