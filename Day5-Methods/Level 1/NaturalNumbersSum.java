import java.util.Scanner;

public class NaturalNumbersSum {
  static int sumOfN(int n){
    int sum = 0;
    for(int i = 1; i <= n; i++){
      sum += i;
    }
    return sum;
  } 
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number (n) to check if it a natural number and the sum of n natural numbers : ");
    int number = input.nextInt();
    if(number <= 0) {
      System.out.println("The number "+number+" is not a natural number");
    }
    else {
      int sum = sumOfN(number);
      System.out.println("The sum of "+number+" natural numbers is " + sum);
    }


    input.close();
  }
}
