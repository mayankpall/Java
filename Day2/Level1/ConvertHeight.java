import java.util.Scanner;

public class ConvertHeight {
  static double calculateCmToInch(double cm){
    return cm / 2.54 ;
  }

  static double calculateInchTofeet(double inch){
    return inch / 12.0;
  }
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Your Height in cm : ");
    double heightInCm = input.nextDouble();

    double heightInInch = calculateCmToInch(heightInCm);
    double heightInFeet = calculateInchTofeet(heightInInch);

    int feet = (int) heightInFeet; 
    double remainingInches = (heightInFeet - feet) * 12; 

    System.out.println("Your Height in cm is " + heightInCm +" while in feet is " + feet + " and inches is " + remainingInches + " inches");

    input.close();

  }


}
