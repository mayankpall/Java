import java.util.Scanner;

class BonusDistribution{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int numberOfEmployees = 10;

    double[] oldSalary = new double[numberOfEmployees];
    double[] yearOfService = new double[numberOfEmployees];
    double[] newSalary = new double[numberOfEmployees];
    double[] bonus = new double[numberOfEmployees];

    System.out.println("Enter employee salary and year of service. ");
    for(int i = 0; i < numberOfEmployees; i++){
      System.out.print("Enter employee "+ (i+1) +" salary and year of service : ");
      double salary = input.nextDouble();
      double serviceOfyear = input.nextDouble();
      if(salary <= 0 || serviceOfyear < 0){
        System.out.print("Input valid number for emloyee "+ (i+1)+" ");
        i--;
      }
      else{
      oldSalary[i] = salary;
      yearOfService[i] = serviceOfyear;
      }
    }

    double totalBonus = 0;
    for(int i = 0; i < numberOfEmployees; i++){
      if(yearOfService[i] > 5){
        bonus[i] = oldSalary[i] / 20.0;
        newSalary[i] = oldSalary[i] + bonus[i];
      }
      else{
        bonus[i] = oldSalary[i] / 50.0;
        newSalary[i] = oldSalary[i] + bonus[i];
      }
      totalBonus += bonus[i];
    }

    for(int i = 0; i < numberOfEmployees; i++){
      System.out.println("Employee " + (i+1) +" total bonus payout is : "+bonus[i]+" and old salary was : "+oldSalary[i]+" and new salary now is : "+ newSalary[i]);
    }

    System.out.println("Total Bonus Payout : " + totalBonus);

    input.close();
  }
}