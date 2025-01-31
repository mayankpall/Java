import java.util.Scanner;

public class BMIMultidimensionalArray {
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

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter weight kg for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height in cm for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble() / 100; 

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            weightStatus[i] = determineBMIStatus(personData[i][2]);
        }

        System.out.println("\nBMI Report:");
        
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight ", "Height ", "BMI", "Status");
       

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        input.close();
    }

}
