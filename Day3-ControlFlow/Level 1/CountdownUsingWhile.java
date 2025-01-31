import java.util.Scanner;

public class CountdownUsingWhile {
  static void countDown(int number){
    while(number > 0){
      System.out.println(number);
      number--;
    }
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number to begin count down from that number : ");
    int number = input.nextInt();
    
    countDown(number);

    input.close();
  }
}
