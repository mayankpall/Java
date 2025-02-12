package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class SplitTextIntoWordsInTwoD {

    static int countWords(String text) {
        int count = text.isEmpty() ? 0 : 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        return count;
    }

    static String[] splitWord(String text) {
        int wordCount = countWords(text);
        String[] word = new String[wordCount];

        int start = 0, index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                word[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        word[index] = text.substring(start);  // Store last word
        return word;
    }

    static int lengthCount(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }

    static String[][] getWordAndLength(String[] words) {
        String[][] wordAndLength = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordAndLength[i][0] = words[i];
            wordAndLength[i][1] = String.valueOf(lengthCount(words[i]));
        }
        return wordAndLength;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] words = splitWord(text);
        String[][] wordAndLength = getWordAndLength(words);

        System.out.printf("%-15s %-10s\n", "Word", "Length");

        for (int i = 0; i < wordAndLength.length; i++) {
            String word = wordAndLength[i][0];
            int wordLength = Integer.parseInt(wordAndLength[i][1]);
            System.out.printf("%-15s %-10d\n", word, wordLength);
        }

        input.close();
    }
}
