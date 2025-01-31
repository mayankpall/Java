import java.util.Scanner;

public class AbundantNumber {
  static boolean isAbundantNumber(int number) {
    if (number <= 0) return false; 

    int totalSum = 1; 

    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            totalSum += i;
            if (i != number / i) { 
                totalSum += number / i;
            }
        }
    }

    return totalSum > number;
}

  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number to check if the number is Abundant or not ? ");
    int number = input.nextInt();

    boolean abundantNumber = isAbundantNumber(number);

    if(abundantNumber){
      System.out.println(number + " is a Abundant Number.");
    }
    else{
      System.out.println(number + " is not a Abundant Number.");
    }

    input.close();
  }
}
