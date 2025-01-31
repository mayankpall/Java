import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0.0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        input.close();

        double mean = sum / 11;

        System.out.println("Mean height of the football team: " + String.format("%.2f", mean));
    }
}
