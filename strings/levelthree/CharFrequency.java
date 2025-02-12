package com.bridgelabz.strings.levelthree;

import java.util.Scanner;


public class CharFrequency {

    static int[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }

        return result;
    }

    static void displayCharacterFrequency(int[][] data) {
        System.out.println("Character Frequency:");
        for (int[] row : data) {
            System.out.println((char) row[0] + " - " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int[][] frequencyData = findCharacterFrequency(text);
        displayCharacterFrequency(frequencyData);

        scanner.close();
    }
}
