import java.util.Scanner;

class LeapYearCheckUsingIfElse {

  static void checkLeapYear(int year) {
    if (year % 400 == 0) {
      System.out.println(year + " is a Leap Year.");
    } else if (year % 100 == 0) {
      System.out.println(year + " is not a Leap Year.");
    } else if (year % 4 == 0) {
      System.out.println(year + " is a Leap Year.");
    } else {
      System.out.println(year + " is not a Leap Year.");
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter year to check if it is a leap year or not : ");
    int year = input.nextInt();

    if (year < 1582) {
      System.out.println("Invalid input! The Leap Year program works only for years >= 1582.");
    }
    else{
    checkLeapYear(year);
    }

    input.close();
  }
}