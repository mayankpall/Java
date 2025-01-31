import java.util.Scanner;

public class SmallestCheck {
  static boolean smallestNumber (int number1, int number2, int number3){

    if(number1 >= number2 && number1 >= number3) return false;
    return true;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter then numbers to check the smallest one ");

    System.out.print("Enter then numbers 1: ");
    int number1 = input.nextInt();

    System.out.print("Enter then numbers 2: ");
    int number2 = input.nextInt();

    System.out.print("Enter then numbers 3: ");
    int number3 = input.nextInt();

    boolean smallest = smallestNumber(number1, number2, number3);

    System.out.println("Is the first number " + number1 +" the smallest? " + smallest);

    input.close();
  }
}
