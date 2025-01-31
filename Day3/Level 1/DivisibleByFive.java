import java.util.Scanner;

class DivisibleByFive{
  public static void main(String[] str){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number to check if its divisible by 5 : ");
    int number = input.nextInt();
    String check = "True";
    if(number % 5 != 0) {
      check = "False";
    }

    System.out.println("Is the number "+ number+" divisible by 5? "+ check);

    input.close();
  }
}