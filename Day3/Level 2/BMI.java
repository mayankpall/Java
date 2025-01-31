import java.util.Scanner;

public class BMI {


    static double calculateBMI(double weight, double heightInCm) {
        double heightInMeters = heightInCm / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    static String BMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in cm: ");
        double height = input.nextDouble();

        double bmi = calculateBMI(weight, height);
        String status = BMIStatus(bmi);

        System.out.println("Your BMI: " + String.format("%.2f", bmi));
        System.out.println("Weight Status: " + status);

        input.close();
    }
}


