import java.util.Scanner;

public class FindingFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to find factors: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Error! Please enter a positive number.");
            input.close();
            return;
        }

        int maxFactor = 10;
        int index = 0;
        int[] array = new int[maxFactor];

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(array, 0, temp, 0, array.length);
                    array = temp;
                }
                array[index++] = i;
            }
        }

        input.close();

        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
