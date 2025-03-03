package com.bridgelabz.runtimeanalysis;

public class StringConcatenationPerformance {

    public static void main(String[] args) {
        int[] operations = {1000, 10000, 100000};

        for (int n : operations) {
            System.out.println("Operations Count: " + n);


            if (n <= 10000) {
                long startTime = System.nanoTime();
                stringConcatenation(n);
                long stringTime = System.nanoTime() - startTime;
                System.out.println("String Concatenation time: " + stringTime / 1_000_000.0 + " ms");
            } else {
                System.out.println("String Concatenation time: Skipped (would take too long)");
            }


            long startTime = System.nanoTime();
            stringBuilderConcatenation(n);
            long stringBuilderTime = System.nanoTime() - startTime;
            System.out.println("StringBuilder Concatenation time: " + stringBuilderTime / 1_000_000.0 + " ms");


            startTime = System.nanoTime();
            stringBufferConcatenation(n);
            long stringBufferTime = System.nanoTime() - startTime;
            System.out.println("StringBuffer Concatenation time: " + stringBufferTime / 1_000_000.0 + " ms");

            System.out.println("------------------------------");
        }


        System.out.println("Large-Scale Test (1,000,000 operations):");

        long startTime = System.nanoTime();
        stringBuilderConcatenation(1000000);
        long stringBuilderTime = System.nanoTime() - startTime;
        System.out.println("StringBuilder (1,000,000): " + stringBuilderTime / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        stringBufferConcatenation(1000000);
        long stringBufferTime = System.nanoTime() - startTime;
        System.out.println("StringBuffer (1,000,000): " + stringBufferTime / 1_000_000.0 + " ms");
    }

    private static String stringConcatenation(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "a";
        }
        return result;
    }

    private static String stringBuilderConcatenation(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    private static String stringBufferConcatenation(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return sb.toString();
    }
}