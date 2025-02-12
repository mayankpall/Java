package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class NumberCheckerOne {

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

    static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0, power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
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

        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(number, digits));

        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);

        input.close();
    }
}
