import java.util.Scanner;

public class BonusCalculation {

  static double calculateBonus(int salary){
    return salary / 20.0;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your salary : ");
    int salary = input.nextInt();

    System.out.print("Enter your year of service : ");
    int yearOfService = input.nextInt();

    if(yearOfService <= 5){
      System.out.println("Sorry no bonus for you.");
    }
    else {
      double bonusAmount = calculateBonus(salary);
      System.out.println("Bonus Amount for you is " + bonusAmount);
    }


    input.close();
  }
}
