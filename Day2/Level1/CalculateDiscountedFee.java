public class CalculateDiscountedFee {
  static double calculateDiscountedAmount(int fee, int discountPercent){

    double discountedPrice = fee * (discountPercent/100.0);
    
    return discountedPrice;
  }
  public static void main(String[] args){
    int fee = 125000;
    int discountPercent = 10;

    double discountAmount = calculateDiscountedAmount(fee, discountPercent);
    double discountedFee = fee - discountAmount;

    System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
  }
}
