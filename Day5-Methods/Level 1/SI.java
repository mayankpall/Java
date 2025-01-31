import java.util.Scanner;

public class SI {

  public static double calculation(double principal, double rate, double time){
    double ans = (principal * rate * time)/100.0;
    return ans;
  }
  

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the inputs to calculate Simple Interest : ");

    System.out.print("Enter Principal value : ");
    double principal = input.nextDouble();

    System.out.print("Enter Rate value : ");
    double rate = input.nextDouble();

    System.out.print("Enter Time value : ");
    double time = input.nextDouble();

    double ans = calculation(principal, rate, time);
    System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f \n ", ans , principal, rate,time );

    input.close();

  }
}
