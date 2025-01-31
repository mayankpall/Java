import java.util.Scanner;

public class FToC {
  static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsiusResult = convertFahrenheitToCelsius(fahrenheit);

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

        input.close();
    }
}
