import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100;
        return weight / (heightMeters * heightMeters);
    }

    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPersons = 10;
        double[][] bmiData = new double[numPersons][3];
        String[] bmiStatus = new String[numPersons];

        System.out.println("Enter Weight (kg) and Height (cm) for " + numPersons + " persons:");

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            bmiData[i][0] = input.nextDouble();

            System.out.print("Person " + (i + 1) + " Height (cm): ");
            bmiData[i][1] = input.nextDouble();

            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
            bmiStatus[i] = determineBMIStatus(bmiData[i][2]);
        }

        System.out.printf("%-10s %-10s %-10s %-15s\n3", "Weight", "Height", "BMI", "Status");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiStatus[i]);
        }

        input.close();
    }
}
