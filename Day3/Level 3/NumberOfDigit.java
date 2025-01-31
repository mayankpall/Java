import java.util.Scanner;

public class NumberOfDigit {
   static int countDigits(int number){
    int temp = number;
    int totalDigits = 0;
    while(temp > 0){
      totalDigits++;
      temp = temp / 10;
    }

    return totalDigits;

  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number to calcualte total digits : ");
    int number = input.nextInt();

    int totalDigits = countDigits(number);

    System.out.println(number + " have total "+ totalDigits +" digits");



    input.close();
  }
}
