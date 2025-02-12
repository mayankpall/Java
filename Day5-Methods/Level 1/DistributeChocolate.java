import java.util.Scanner;

public class DistributeChocolate {
  static int getChocolatesPerChild(int numberOfChocolates, int numberOfChildren){
      return numberOfChocolates / numberOfChildren;
  }

  static int getRemainingChocolates(int numberOfChocolates, int numberOfChildren ){
    return numberOfChocolates % numberOfChildren;
  }
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        int chocolatesPerChild = getChocolatesPerChild(numberOfChocolates, numberOfChildren);
        int remainingChocolates = getRemainingChocolates(numberOfChocolates, numberOfChildren);

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                           " and the number of remaining chocolates are " + remainingChocolates);

        input.close();
    }
}
