import java.util.Scanner;

public class UnitConvertorWeight {



    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unit Converter: Choose a Conversion");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice (1-6): ");
        
        int choice = input.nextInt();
        double value, convertedValue;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                value = input.nextDouble();
                convertedValue = convertFahrenheitToCelsius(value);
                System.out.printf("Temperature in Celsius: %.2f°C%n", convertedValue);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                value = input.nextDouble();
                convertedValue = convertCelsiusToFahrenheit(value);
                System.out.printf("Temperature in Fahrenheit: %.2f°F%n", convertedValue);
                break;

            case 3:
                System.out.print("Enter weight in Pounds: ");
                value = input.nextDouble();
                convertedValue = convertPoundsToKilograms(value);
                System.out.printf("Weight in Kilograms: %.2f kg%n", convertedValue);
                break;

            case 4:
                System.out.print("Enter weight in Kilograms: ");
                value = input.nextDouble();
                convertedValue = convertKilogramsToPounds(value);
                System.out.printf("Weight in Pounds: %.2f lbs%n", convertedValue);
                break;

            case 5:
                System.out.print("Enter volume in Gallons: ");
                value = input.nextDouble();
                convertedValue = convertGallonsToLiters(value);
                System.out.printf("Volume in Liters: %.2f L%n", convertedValue);
                break;

            case 6:
                System.out.print("Enter volume in Liters: ");
                value = input.nextDouble();
                convertedValue = convertLitersToGallons(value);
                System.out.printf("Volume in Gallons: %.2f gal%n", convertedValue);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        input.close();
    }
}


