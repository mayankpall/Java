import java.util.Scanner;

public class FactorsCalculation {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int findProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int findSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find factors: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Error: Enter a positive integer.");
        } else {
            int[] factors = findFactors(number);

            System.out.print("\nFactors of " + number + ": ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }

            int sum = findSum(factors);
            int product = findProduct(factors);
            int sumOfSquares = findSumOfSquares(factors);

            System.out.println("\nSum of Factors: " + sum);
            System.out.println("Product of Factors: " + product);
            System.out.println("Sum of Squares of Factors: " + sumOfSquares);
        }

        input.close();
    }
}
