public class CalculateProfitLoss {
  static double calculateProfitOrLoss(int costPrice, int sellingPrice) {
    return sellingPrice - costPrice;
  }

  static double calculateProfitOrLossPercentage(double profitOrLoss, int costPrice) {
    return (profitOrLoss / costPrice) * 100;
  }

  public static void main(String[] args) {
    int costPrice = 129;
    int sellingPrice = 191;
    double profit = calculateProfitOrLoss(costPrice, sellingPrice);
    double profitPercentage = calculateProfitOrLossPercentage(profit, costPrice);
    System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
  }
}
