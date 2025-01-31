import java.util.Scanner;

public class DistanceConversion {
  static double convertFeetToYards(double feet) {
    return feet / 3.0;
}

static double convertFeetToMiles(double feet) {
    return feet / (3.0 * 1760);
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter distance in feet: ");
    double distanceInFeet = input.nextDouble();

    double distanceInYards = convertFeetToYards(distanceInFeet);
    double distanceInMiles = convertFeetToMiles(distanceInFeet);

    System.out.println("The distance in feet is " + distanceInFeet +
                       ", in yards is " + distanceInYards +
                       ", and in miles is " + distanceInMiles);

    input.close();
}
}
