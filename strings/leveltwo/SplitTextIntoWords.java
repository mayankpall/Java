package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class SplitTextIntoWords {

        static int countWords(String text) {
            int count = text.isEmpty() ? 0 : 1;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') count++;
            }
            return count;
        }

        static String[] splitUsingCharAt(String text) {
            int wordCount = countWords(text);
            String[] words = new String[wordCount];

            int start = 0, index = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    words[index++] = text.substring(start, i);
                    start = i + 1;
                }
            }
            words[index] = text.substring(start);
            return words;
        }

        static boolean compareArrays(String[] array1, String[] array2) {
            if (array1.length != array2.length) return false;
            for (int i = 0; i < array1.length; i++) {
                if (!array1[i].equals(array2[i])) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter text: ");
            String text = input.nextLine();

            String[] wordsCustom = splitUsingCharAt(text);
            String[] wordsBuiltIn = text.split(" ");

            System.out.println("\nWords using custom method:");
            for (String word : wordsCustom) System.out.println(word);

            System.out.println("\nWords using built-in split():");
            for (String word : wordsBuiltIn) System.out.println(word);

            System.out.println("\nAre both results identical? " + compareArrays(wordsCustom, wordsBuiltIn));

            input.close();
        }
    }


