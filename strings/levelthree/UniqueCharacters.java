package com.bridgelabz.strings.levelthree;

import java.util.Scanner;

public class UniqueCharacters {

    static int calculateLength(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
            return len;
        }
    }

    static char[] uniqueCharacters(String text) {
        int lengthOfText = calculateLength(text);
        char[] uniqueChar = new char[lengthOfText];
        int uniqueCount = 0;

        for (int i = 0; i < lengthOfText; i++) {
            char currChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChar[j] == currChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChar[uniqueCount] = currChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChar[i];
        }

        return result;
    }

    static void displayUniqueChar(char[] chars) {
        System.out.println("Unique characters in the string are:");
        for (char character : chars) {
            System.out.print(character + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text to find the unique characters: ");
        String text = input.nextLine();

        char[] uniqueChars = uniqueCharacters(text);
        displayUniqueChar(uniqueChars);

        input.close();
    }
}
