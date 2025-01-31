import java.util.Scanner;

public class SumUntilZeroUsingFor {
  static int sumUsingFormula(int number){
        return number * (number + 1) / 2;
    }

    static int sumUsingFor(int number){
        int sumLoop = 0;
        for(int i = 1; i <= number; i++){
          sumLoop += i;
        }
        return sumLoop;
    }
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (n) to compute the sum of natural numbers: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number. Please enter a positive integer.");
        } else {
            int sumFormula = sumUsingFormula(n);

            int sumLoop = sumUsingFor(n);

            System.out.println("Sum computed using formula: " + sumFormula);
            System.out.println("Sum computed using For loop: " + sumLoop);

            if (sumFormula == sumLoop) {
                System.out.println("Both computations match! The sum is correct.");
            } else {
                System.out.println("There is a mismatch in the computations.");
            }
        }

        input.close();
    }
}
