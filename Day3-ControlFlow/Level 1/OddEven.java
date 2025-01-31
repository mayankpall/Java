import java.util.Scanner;

public class OddEven {
  static void printEvenAndOdd(int number){
    for (int i = 1; i <= number; i++) {
      if (i % 2 == 0) {
          System.out.println(i + " is even");
      } else {
          System.out.println(i + " is odd");
      }
  }
  }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            printEvenAndOdd(number);
        }

        input.close();
    }
}
