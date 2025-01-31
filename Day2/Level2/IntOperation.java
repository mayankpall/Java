import java.util.Scanner;

public class IntOperation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter value for a: ");
    int a = input.nextInt();

    System.out.print("Enter value for b: ");
    int b = input.nextInt();

    System.out.print("Enter value for c: ");
    int c = input.nextInt();

    int outputOne = a + b * c; 
    int outputTwo = a * b + c; 
    int outputThree = c + a / b; 
    int outputFour = a % b + c; 

   
    System.out.println("a + b * c = " + outputOne);
    System.out.println("a * b + c = " + outputTwo);
    System.out.println("c + a / b = " + outputThree);
    System.out.println("a % b + c = " + outputFour);

    input.close();
}
}
