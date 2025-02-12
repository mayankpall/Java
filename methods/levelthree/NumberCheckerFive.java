package com.bridgelabz.methods.levelthree;

import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckerFive {

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

    static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 2]; // Last but one factor
    }

    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    static boolean isPerfectNumber(int number, int[] factors) {
        return sumOfFactors(factors) - number == number;
    }

    static boolean isAbundantNumber(int number, int[] factors) {
        return sumOfFactors(factors) - number > number;
    }

    static boolean isDeficientNumber(int number, int[] factors) {
        return sumOfFactors(factors) - number < number;
    }

    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        System.out.println("Perfect Number: " + isPerfectNumber(number, factors));
        System.out.println("Abundant Number: " + isAbundantNumber(number, factors));
        System.out.println("Deficient Number: " + isDeficientNumber(number, factors));
        System.out.println("Strong Number: " + isStrongNumber(number));

        input.close();
    }
}
