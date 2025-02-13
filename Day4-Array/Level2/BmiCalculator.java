import java.util.Scanner;

public class BmiCalculator {
  static String determineBMIStatus(double bmi) {
    if (bmi <= 18.4) return "Underweight";
    else if (bmi <= 24.9) return "Normal";
    else if (bmi <= 39.9) return "Overweight";
    else return "Obese";
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = input.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmiValues = new double[n];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter weight kg for person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();

            System.out.print("Enter height in cm for person " + (i + 1) + ": ");
            heights[i] = input.nextDouble() / 100; 

            bmiValues[i] = weights[i] / (heights[i] * heights[i]);
            weightStatus[i] = determineBMIStatus(bmiValues[i]);
        }

        System.out.println("\nBMI Report:");
        
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight ", "Height ", "BMI", "Status");
       

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", weights[i], heights[i], bmiValues[i], weightStatus[i]);
        }

        input.close();
    }

   
}
