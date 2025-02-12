package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class DisplayCalendar {

    static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int noOfDays(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            return checkLeapYear(year) ? 29 : 28;
        }
        return 30;
    }

    static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = noOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("\n " + monthName + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");


        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }


        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            //move to a new line after every Saturday or days end
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input. Please enter a valid month (1-12) and a valid year.");
        } else {
            printCalendar(month, year);
        }

        input.close();
    }
}
