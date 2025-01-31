import java.util.Scanner;

public class DoubleOperation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter value for a: ");
    double a = input.nextInt();

    System.out.print("Enter value for b: ");
    double b = input.nextInt();

    System.out.print("Enter value for c: ");
    double c = input.nextInt();

    double outputOne = a + b * c; 
    double outputTwo = a * b + c; 
    double outputThree = c + a / b; 
    double outputFour = a % b + c; 

   
    System.out.println("a + b * c = " + outputOne);
    System.out.println("a * b + c = " + outputTwo);
    System.out.println("c + a / b = " + outputThree);
    System.out.println("a % b + c = " + outputFour);

    input.close();
 }
}
