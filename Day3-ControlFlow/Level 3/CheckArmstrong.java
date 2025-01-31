import java.util.Scanner;

class CheckArmstrong {
  static boolean checkArmstrong(int number){
    int temp = number;
    int totalSum = 0;
    while(temp > 0){
      int digit = temp % 10;
      totalSum += Math.pow(digit, 3);
      temp = temp / 10;
    }

    return number == totalSum;

  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number to check if it's Armstrong or not : ");
    int number = input.nextInt();

    boolean isArmstrong = checkArmstrong(number);

    System.out.println(number + " is Armstrong ? "+isArmstrong);



    input.close();
  }
}