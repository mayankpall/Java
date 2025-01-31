import java.util.Scanner;

public class DayOfWeek {
    static String getDayOfWeek(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[d0];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month : ");
        int month = input.nextInt();

        System.out.print("Enter the day: ");
        int day = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        String dayOfWeek = getDayOfWeek(day, month, year);

        System.out.println("The day of the week is " + dayOfWeek);

        input.close();
    }
}
