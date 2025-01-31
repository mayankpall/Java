import java.util.Scanner;

public class QuotientAndReminder {

    static double division(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    static double modulo(double numberOne, double numberTwo) {
        return numberOne % numberTwo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First number: ");
        double numberOne = input.nextDouble();

        System.out.print("Enter Second number: ");
        double numberTwo = input.nextDouble();

        if (numberTwo != 0) {
            double divResult = division(numberOne, numberTwo);
            double modResult = modulo(numberOne, numberTwo);
            System.out.println("The Quotient is " + divResult + " and the Remainder is " + modResult + " for the two numbers " + numberOne + " and " + numberTwo);
        } else {
            System.out.println("Division by zero is not defined. Cannot calculate quotient and remainder.");
        }

        input.close();
    }
}
