import java.util.Scanner;

public class AreaOfTriangle {

  static double calculateArea(double base, double height){
    return 0.5 * base * height;
  }

  static double SquareInchesToSquareCm(double areaInInches) {
    return areaInInches * 6.4516; 
}

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter base value of triangle in inches : ");
    double base = input.nextDouble();

    System.out.print("Enter height value of triangle in inches : ");
    double height = input.nextDouble();

    double areaInSquareInches = calculateArea(base, height);
    double areaInSquareCm = SquareInchesToSquareCm(areaInSquareInches);

    System.out.println("The area of the triangle in square inches is " + areaInSquareInches + " and in square centimeters is " + areaInSquareCm);

    input.close();
  }
}
