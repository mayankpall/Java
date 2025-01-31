import java.util.Scanner;

public class KmToMilesCalculate {
  static double calculateKmToMiles(double kilometers){
    double miles = kilometers / 1.6;
    return miles;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Distance in kilometers to convert it into miles : ");
    double kilometers = input.nextDouble();
    double miles = calculateKmToMiles(kilometers);
    System.out.println("The distance "+ kilometers + " km in miles is "+ miles +" miles");

    input.close();
  }
}
