package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class NumberCheckerTwo {

    static int countDigits(int number) {
        return (int) Math.log10(number) + 1;
    }

    static int[] storeDigits(int number, int noOfDigits) {
        int[] digits = new int[noOfDigits];
        for (int index = noOfDigits - 1; index >= 0; index--) {
            digits[index] = number % 10;
            number /= 10;
        }
        return digits;
    }

    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += (int)Math.pow(digit, 2);
        }
        return sum;
    }

    static boolean isHarshadNumber(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    static void printDigitFrequency(int[][] frequency) {
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
            }
        }
    }

    static void printDigits(int[] digits) {
        for (int index = 0; index < digits.length; index++) {
            System.out.println("Array " + index + " index digit : " + digits[index]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        int numberOfDigits = countDigits(number);
        int[] digits = storeDigits(number, numberOfDigits);
        printDigits(digits);

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Harshad Number: " + isHarshadNumber(number, digits));

        int[][] frequency = digitFrequency(digits);
        printDigitFrequency(frequency);

        input.close();
    }
}
