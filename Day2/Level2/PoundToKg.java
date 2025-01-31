import java.util.Scanner;

public class PoundToKg {
  static double poundsToKgs(double pounds) {
        return pounds / 2.2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds : ");
        double weightInPounds = input.nextDouble();

        double weightInKgs = poundsToKgs(weightInPounds);

        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKgs);

        input.close();
    }
}
