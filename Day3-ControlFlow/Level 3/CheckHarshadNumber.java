import java.util.Scanner;

class CheckHarshadNumber{
  static boolean checkHarshadNumber(int number){
    int temp = number;
    int totalSum = 0;
    while(temp > 0){
      int digit = temp % 10;
      totalSum += digit;
      temp = temp / 10;
    }

    return  number % totalSum == 0;

  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number to check if it's Harshad Number or not : ");
    int number = input.nextInt();

    boolean isHarshadNumber = checkHarshadNumber(number);

    if(isHarshadNumber){
    System.out.println(number + " is a Harshad Number ");
    }
    else{
      System.out.println(number + " is not a Harshad Number ");

    }



    input.close();
  }
}