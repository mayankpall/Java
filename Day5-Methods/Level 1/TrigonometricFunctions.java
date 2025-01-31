import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); 
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);

        System.out.printf("\nTrigonometric Values for %.2f degrees:\n", angle);
        System.out.printf("Sine: %.3f\n", trigValues[0]);
        System.out.printf("Cosine: %.3f\n", trigValues[1]);
        System.out.printf("Tangent: %.3f\n", trigValues[2]);

        input.close();
    }
}
