import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = input.nextDouble();
        }

        input.close();

        int youngestIndex = 0, tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest Friend: " + friends[youngestIndex] + " Age: " + ages[youngestIndex] + " ");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " Height: " + heights[tallestIndex] + " ");
    }
}
