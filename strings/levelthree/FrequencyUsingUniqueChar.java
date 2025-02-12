package com.bridgelabz.strings.levelthree;

import java.util.Scanner;

public class FrequencyUsingUniqueChar {


        static char[] findUniqueCharacters(String text) {
            int length = text.length();
            char[] uniqueChars = new char[length];
            int uniqueCount = 0;

            for (int i = 0; i < length; i++) {
                char currChar = text.charAt(i);
                boolean isUnique = true;

                for (int j = 0; j < uniqueCount; j++) {
                    if (uniqueChars[j] == currChar) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    uniqueChars[uniqueCount] = currChar;
                    uniqueCount++;
                }
            }

            char[] result = new char[uniqueCount];
            System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
            return result;
        }

        static String[][] findCharacterFrequency(String text) {
            char[] uniqueChars = findUniqueCharacters(text);
            String[][] frequencyData = new String[uniqueChars.length][2];

            for (int i = 0; i < uniqueChars.length; i++) {
                char uniqueChar = uniqueChars[i];
                int count = 0;

                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(j) == uniqueChar) {
                        count++;
                    }
                }

                frequencyData[i][0] = String.valueOf(uniqueChar);
                frequencyData[i][1] = String.valueOf(count);
            }

            return frequencyData;
        }

        static void displayCharacterFrequency(String[][] data) {
            System.out.println("Character Frequency:");
            for (String[] row : data) {
                System.out.println(row[0] + " - " + row[1]);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = scanner.nextLine();

            String[][] frequencyData = findCharacterFrequency(text);
            displayCharacterFrequency(frequencyData);

            scanner.close();
        }
    }

