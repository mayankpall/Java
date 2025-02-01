import java.util.Scanner;

public class UnitConvertor {

    public static double convertKmToMiles(double kilometers) {
        return kilometers * 0.621371; 
    }
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934; 
    }
    public static double convertMetersToFeet(double meters){
        return meters * 3.28084;
    }
    public static double convertFeetToMeters(double feet){
        return feet * 0.3048;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unit Converter: Choose a Conversion");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = input.nextInt();

        double value, convertedValue;

        switch (choice) {
            case 1:
                System.out.print("Enter distance in kilometers: ");
                value = input.nextDouble();
                convertedValue = convertKmToMiles(value);
                System.out.printf("Distance in miles: %.2f miles%n", convertedValue);
                break;

            case 2:
                System.out.print("Enter distance in miles: ");
                value = input.nextDouble();
                convertedValue = convertMilesToKm(value);
                System.out.printf("Distance in kilometers: %.2f km%n", convertedValue);
                break;

            case 3:
                System.out.print("Enter distance in meters: ");
                value = input.nextDouble();
                convertedValue = convertMetersToFeet(value);
                System.out.printf("Distance in feet: %.2f feet%n", convertedValue);
                break;

            case 4:
                System.out.print("Enter distance in feet: ");
                value = input.nextDouble();
                convertedValue = convertFeetToMeters(value);
                System.out.printf("Distance in meters: %.2f meters%n", convertedValue);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        input.close();
    }
}
