import java.util.Scanner;

public class LargestAndSecondLargestDynamic {
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number to find the largest and second largest element of the array : ");
    int number = input.nextInt();

    int maxDigit = 10;
    int index = 0;

    int[] digits = new int[maxDigit];

    while (number != 0 ) {
      if(index == maxDigit){
        maxDigit += 10;
        int[] temp = new int[maxDigit];
        System.arraycopy(digits, 0, temp, 0, digits.length);
        digits = temp;
      }
        int digit = number % 10;
        number = number /10;
        digits[index] =digit;
        index++;
       
    }

    input.close();

    int largestNumber = -1;
    int secondLargestNumber = -1;

    for(int i = 0; i < index; i++){
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
