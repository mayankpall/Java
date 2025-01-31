import java.util.Scanner;

public class MultiplicationTable6to9 {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table from 6 to 9: ");
        int number = input.nextInt();

        int[] multiplicationResult = new int[4]; 

        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6); 
        }

        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        input.close();
    }
}


