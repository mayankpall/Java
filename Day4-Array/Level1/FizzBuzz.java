import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number to begin fizz buzz : ");
    int number = input.nextInt();
    
    if(number <= 0){
      System.out.println("Error, Enter positive number only");
      input.close();
      return;
    }

    String[] numbers = new String[number];
    int numberIndex = 0;

    for(int i = 1; i <= number; i++){
      if(i % 3 == 0 && i % 5 == 0){
      numbers[numberIndex] = "FizzBuzz";
      }else if(i % 3 == 0){
        numbers[numberIndex] = "Fizz";
      }
      else if(i % 5 == 0) {
        numbers[numberIndex] = "Buzz";
      }
      else {
        int index = i;
        numbers[numberIndex] = Integer.toString(index);
      }
      numberIndex++;
    }


    for(int i = 0; i < numbers.length; i++){
      System.out.println("Position "+( i+1 )+ " = " + numbers[i]);
    }

    input.close();
  }
}
