import java.util.Scanner;

public class CountdownUsingFor {
  static void countDown(int number){
    for(int i = number; i > 0 ; i--){
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
