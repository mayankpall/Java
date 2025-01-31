import java.util.Scanner;

public class LargestNumberCheck {

  static boolean largestNumber (int number1, int number2, int number3){

    if(number1 >= number2 && number1 >= number3) return true;
    return false;
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

    boolean checkNumber1 = largestNumber(number1, number2, number3);
    boolean checkNumber2 = largestNumber(number2, number1, number3);
    boolean checkNumber3 = largestNumber(number3, number2, number1);

    System.out.println("Is the first number " + number1 +" the largest? " + checkNumber1);
    System.out.println("Is the second number " + number2 +" the largest? " + checkNumber2);
    System.out.println("Is the third number " + number3 +" the largest? " + checkNumber3);

    input.close();
  }
}


