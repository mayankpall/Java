import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers to find the smallest and largest:");

        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        System.out.print("Enter number 3: ");
        int number3 = input.nextInt();

        int[] result = findSmallestAndLargest(number1, number2, number3);

        System.out.println("Smallest number is: " + result[0]);
        System.out.println("Largest number is: " + result[1]);

        input.close();
    }
}
