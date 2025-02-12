package com.bridgelabz.strings.levelthree;

import java.util.Scanner;

public class PalindromeCheck {

    static boolean checkPalindromeUsingIndex(String text) {
        int startIndex = 0;
        int endIndex = text.length() - 1;

        while (startIndex < endIndex) {
            if (text.charAt(startIndex) != text.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    static boolean checkPalindromeUsingRecursion(String text, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return true;
        if (text.charAt(startIndex) != text.charAt(endIndex)) return false;
        return checkPalindromeUsingRecursion(text, startIndex + 1, endIndex - 1);
    }

    static char[] reverseString(String text) {
        int length = text.length();
        char[] reversedString = new char[length];

        for (int i = 0; i < length; i++) {
            reversedString[i] = text.charAt(length - 1 - i);
        }

        return reversedString;
    }

    static boolean checkPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseString(text);

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("Palindrome check using index comparison: " + checkPalindromeUsingIndex(text));
        System.out.println("Palindrome check using recursion: " + checkPalindromeUsingRecursion(text, 0, text.length() - 1));
        System.out.println("Palindrome check using character array: " + checkPalindromeUsingArray(text));

        scanner.close();
    }
}
