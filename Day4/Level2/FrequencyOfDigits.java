import java.util.Scanner;

public class FrequencyOfDigits {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number to find the frequency of digits : ");
    int number = input.nextInt();
    number = Math.abs(number);

    int numberOfDigits = String.valueOf(number).length();
    int[] digits = new int[numberOfDigits];

    for(int i = 0; i < numberOfDigits; i++){
      digits[i] = number % 10;
      number = number / 10;
    }

    int[] frequencyArray = new int[10];

    for(int i = 0; i < digits.length; i++){
      frequencyArray[digits[i]]++;
    }

    for(int i = 0; i < frequencyArray.length; i++){
      if(frequencyArray[i] != 0){
        System.out.println("Frequency of number " + i +" is " + frequencyArray[i]);
      }
    }

    input.close();
  }

}
