import java.util.Scanner;

public class DiscountedFeeCalculate {
 
    static double calculateDiscountedAmount(int fee, int discountPercent){
  
      double discountedPrice = fee * (discountPercent/100.0);
      
      return discountedPrice;
    }
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.print("Enter fee : ");
      int fee = input.nextInt();

      System.out.print("Enter discountPercent : ");
      int discountPercent = input.nextInt();
  
      double discountAmount = calculateDiscountedAmount(fee, discountPercent);
      double discountedFee = fee - discountAmount;
  
      System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);

      input.close();
    }
  
  
}
