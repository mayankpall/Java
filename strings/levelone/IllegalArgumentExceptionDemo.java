package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    static void generateException(String text, int start, int end) {
        System.out.println(text.substring(start, end));
    }

    static void handleException(String text, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        System.out.println(text.substring(start, end));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        try {
            handleException(text, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        input.close();
    }
}
