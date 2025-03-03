package com.bridgelabz.runtimeanalysis;

import java.math.BigInteger;

public class FibonacciPerformance {

    public static void main(String[] args) {
        int[] fibNumbers = {10, 20, 30, 40, 45};

        for (int n : fibNumbers) {
            System.out.println("Fibonacci Number: " + n);


            if (n <= 40) {
                long startTime = System.nanoTime();
                long recursiveResult = fibonacciRecursive(n);
                long recursiveTime = System.nanoTime() - startTime;
                System.out.println("Recursive time: " + recursiveTime / 1_000_000.0 + " ms");
                System.out.println("Recursive result: " + recursiveResult);
            } else {
                System.out.println("Recursive time: Skipped (would take too long)");
            }


            long startTime = System.nanoTime();
            long iterativeResult = fibonacciIterative(n);
            long iterativeTime = System.nanoTime() - startTime;
            System.out.println("Iterative time: " + iterativeTime / 1_000_000.0 + " ms");
            System.out.println("Iterative result: " + iterativeResult);


            startTime = System.nanoTime();
            long dpResult = fibonacciDP(n);
            long dpTime = System.nanoTime() - startTime;
            System.out.println("Dynamic Programming time: " + dpTime / 1_000_000.0 + " ms");
            System.out.println("DP result: " + dpResult);


            startTime = System.nanoTime();
            BigInteger bigIntResult = fibonacciBigInteger(n);
            long bigIntTime = System.nanoTime() - startTime;
            System.out.println("BigInteger time: " + bigIntTime / 1_000_000.0 + " ms");
            System.out.println("BigInteger result: " + bigIntResult);

            System.out.println("------------------------------");
        }


        int largeN = 100;
        System.out.println("Large Fibonacci Number: " + largeN);
        System.out.println("(Only using BigInteger for this large value)");

        long startTime = System.nanoTime();
        BigInteger result = fibonacciBigInteger(largeN);
        long time = System.nanoTime() - startTime;

        System.out.println("BigInteger time: " + time / 1_000_000.0 + " ms");
        System.out.println("BigInteger result length: " + result.toString().length() + " digits");
        System.out.println("First 50 digits: " + result.toString().substring(0, Math.min(50, result.toString().length())));
    }

    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciIterative(int n) {
        if (n <= 1) return n;

        long a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static long fibonacciDP(int n) {
        if (n <= 1) return n;

        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static BigInteger fibonacciBigInteger(int n) {
        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger sum;

        for (int i = 2; i <= n; i++) {
            sum = a.add(b);
            a = b;
            b = sum;
        }

        return b;
    }
}