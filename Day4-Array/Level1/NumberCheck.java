import java.util.Scanner;

public class NumberCheck {
  public static void main(String[] args){
    int[] numbers = new int[5];

    int size = numbers.length;

    Scanner input = new Scanner(System.in);
    

    for(int i = 0; i < size; i++){
      System.out.print("Enter number "+(i+1) + " : ");
      int number = input.nextInt();
      numbers[i] = number;
    }

    input.close();

    for(int i = 0; i < size; i++){
      int number = numbers[i];
      if(number == 0){
        System.out.println("Zero");
      }
      else if(number < 0){
        System.out.println("Negative");
      }
      else{
        System.out.print("Positive and ");
        if(number % 2 == 0){
          System.out.println("Even");
        }
        else {
          System.out.println("Odd");
        }
      }
    }

    int firstNumber = numbers[0];
    int lastNumber = numbers[size-1];
    if(firstNumber > lastNumber){
      System.out.println("First Number "+firstNumber +" is greater than last Number " + lastNumber);
    }
    else if(firstNumber < lastNumber){
      System.out.println("First Number "+firstNumber +" is less than last Number " + lastNumber);
    }
    else {
      System.out.println("First Number "+firstNumber +" is equal to last Number " + lastNumber);
    }

  }
}
