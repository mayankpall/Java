import java.util.Scanner;

public class SumUsingFormulaAndWhile {

    static int sumUsingFormula(int number){
        return number * (number + 1) / 2;
    }

    static int sumUsingWhile(int number){
        int sumLoop = 0, i = 1;
            while (i <= number) {
                sumLoop += i;
                i++;
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

            int sumLoop = sumUsingWhile(n);

            System.out.println("Sum computed using formula: " + sumFormula);
            System.out.println("Sum computed using while loop: " + sumLoop);

            if (sumFormula == sumLoop) {
                System.out.println("Both computations match! The sum is correct.");
            } else {
                System.out.println("There is a mismatch in the computations.");
            }
        }

        input.close();
    }
}

