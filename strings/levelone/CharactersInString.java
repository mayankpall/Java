package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class CharactersInString {

    static char[] getChar(String string) {
        char[] characters = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            characters[i] = string.charAt(i);
        }
        return characters;
    }

    static boolean compareArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) return false;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String to get its characters: ");
        String string = input.next();

        char[] characters = getChar(string);
        char[] charUsingBuiltIn = string.toCharArray();

        System.out.println("\nCharacters using user-defined method:");
        for (char c : characters) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray():");
        for (char c : charUsingBuiltIn) {
            System.out.print(c + " ");
        }

        boolean areEqual = compareArrays(characters, charUsingBuiltIn);
        System.out.println("\nAre both arrays equal? " + areEqual);

        input.close();
    }
}
