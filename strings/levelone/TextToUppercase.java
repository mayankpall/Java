package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class TextToUppercase {

    static String convertUsingCharAt(String text) {
        StringBuilder upperText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            upperText.append(ch);
        }
        return upperText.toString();
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String manualUpperCase = convertUsingCharAt(text);
        String builtInUpperCase = text.toUpperCase();

        System.out.println("\nConverted using charAt(): " + manualUpperCase);
        System.out.println("Converted using toUpperCase(): " + builtInUpperCase);

        boolean isEqual = compareStrings(manualUpperCase, builtInUpperCase);
        System.out.println("Are both results identical? " + isEqual);

        input.close();
    }

}
