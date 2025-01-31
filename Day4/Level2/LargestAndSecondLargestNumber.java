import java.util.Scanner;

public class LargestAndSecondLargestNumber {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number to find the largest and second largest element of the array : ");
    int number = input.nextInt();

    int maxDigit = 10;
    int index = 0;

    int[] digits = new int[maxDigit];

    while (number != 0 && index < maxDigit) {
      
        int digit = number % 10;
        number = number /10;
        digits[index] =digit;
        index++;
    }

    input.close();

    int largestNumber = -1;
    int secondLargestNumber = -1;

    for(int i = 0; i < digits.length; i++){
      if(largestNumber < digits[i]){
        secondLargestNumber = largestNumber;
        largestNumber = digits[i];
      }
      else if (digits[i] > secondLargestNumber && digits[i] != largestNumber) {
        secondLargestNumber = digits[i];
    }
    }

    System.out.println("Largest Number is : "+ largestNumber );
    System.out.println("Second Number is : "+ secondLargestNumber);

  }

}
