import java.util.Scanner;

public class ArrayInReverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = Math.abs(number);

        int digitCount = String.valueOf(temp).length();
        int[] digits = new int[digitCount];

        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        System.out.println("Reversed Number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}
