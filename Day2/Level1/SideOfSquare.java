import java.util.Scanner;

public class SideOfSquare {
  static double calculateSide(double perimeter){
    return perimeter/4.0;
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Perimeter of the Square : ");
    double perimeter = input.nextDouble();

    double sideOfSquare = calculateSide(perimeter);

    System.out.println("The length of the side is "+ sideOfSquare + " whose perimeter is "+ perimeter);
    input.close();
  }
}
