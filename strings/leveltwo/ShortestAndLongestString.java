package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class ShortestAndLongestString {

    static int countWords(String text) {
        int count = text.isEmpty() ? 0 : 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        return count;
    }

    static String[] splitWords(String text) {
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

    static int getLength(String word) {
        int length = 0;
        try {
            while (true) {
                word.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }

    static String[][] getWordsAndLengths(String[] words) {
        String[][] wordData = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(getLength(words[i]));
        }
        return wordData;
    }

    static String[] findShortestAndLongest(String[][] wordData) {
        String shortest = wordData[0][0], longest = wordData[0][0];

        for (int i = 1; i < wordData.length; i++) {
            if (getLength(wordData[i][0]) < getLength(shortest)) {
                shortest = wordData[i][0];
            }
            if (getLength(wordData[i][0]) > getLength(longest)) {
                longest = wordData[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] words = splitWords(text);
        String[][] wordData = getWordsAndLengths(words);
        String[] shortestAndLongest = findShortestAndLongest(wordData);

        System.out.printf("%-15s %-10s\n", "Word", "Length");
        for (String[] data : wordData) {
            System.out.printf("%-15s %-10s\n", data[0], data[1]);
        }

        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        input.close();
    }
}
