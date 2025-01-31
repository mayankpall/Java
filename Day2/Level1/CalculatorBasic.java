import java.util.Scanner;

public class CalculatorBasic {

  static double addition(double numberOne, double numberTwo) {
    return numberOne + numberTwo;
  }

  static double multiplication(double numberOne, double numberTwo) {
    return numberOne * numberTwo;
  }

  static double subtraction(double numberOne, double numberTwo) {
    return numberOne - numberTwo;
  }

  static double division(double numberOne, double numberTwo) {
    return numberOne / numberTwo;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers to perform Basic Calculations :- ");

    System.out.print("Enter First number : ");
    double numberOne = input.nextDouble();

    System.out.print("Enter Second number : ");
    double numberTwo = input.nextDouble();

    double addResult = addition(numberOne, numberTwo);
    double subResult = subtraction(numberOne, numberTwo);
    double mulResult = multiplication(numberOne, numberTwo);

    if (numberTwo != 0) {
      double divResult = division(numberOne, numberTwo);
      System.out.println("The addition, subtraction, multiplication, and division of the 2 numbers " + numberOne
          + " and " + numberTwo + " is " + addResult + ", " + subResult + ", " + mulResult + ", and " + divResult);
    } else {
      System.out.println("The addition, subtraction, and multiplication of the 2 numbers " +
          numberOne + " and " + numberTwo + " is " +
          addResult + ", " + subResult + ", and " + mulResult +
          ". denominator cannot be zero.");
    }

    input.close();
  }
}
