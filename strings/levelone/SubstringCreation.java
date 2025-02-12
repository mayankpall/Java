package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class SubstringCreation {

    static String substringUsingCharAt(String string, int startingIndex, int endingIndex) {
        StringBuilder newString = new StringBuilder();
        for (int index = startingIndex; index < endingIndex; index++) {
            newString.append(string.charAt(index));
        }
        return newString.toString();
    }

    static boolean compareStringsUsingCharAt(String stringOne, String stringTwo) {
        if (stringOne.length() != stringTwo.length()) return false;

        for (int index = 0; index < stringOne.length(); index++) {
            if (stringOne.charAt(index) != stringTwo.charAt(index)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String: ");
        String string = input.next();

        System.out.print("Enter Starting index for substring: ");
        int startingIndex = input.nextInt();

        System.out.print("Enter Ending index for substring: ");
        int endingIndex = input.nextInt();

        String substringCharAt = substringUsingCharAt(string, startingIndex, endingIndex);
        String substringMethod = string.substring(startingIndex, endingIndex);

        System.out.printf("Substring using charAt: %s%n", substringCharAt);
        System.out.printf("Substring using built-in method: %s%n", substringMethod);

        boolean areEqual = compareStringsUsingCharAt(substringCharAt, substringMethod);
        System.out.println("Are both substrings equal? " + areEqual);

        input.close();
    }
}
