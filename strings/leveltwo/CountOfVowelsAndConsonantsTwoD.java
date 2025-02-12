package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class CountOfVowelsAndConsonantsTwoD {

    static String checkCharacterType(char ch) {
        ch = (ch >= 65 && ch <= 90) ? (char) (ch + 32) : ch;

        if (ch >= 97 && ch <= 122) { //  a-z: 97-122
            return (ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117) ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }


    static String[][] getInTwoDArray(String text) {
        int len = text.length();
        String[][] ans = new String[len][2];
        int indexs = 0;

        for (int index = 0; index < len; index++) {
            if (text.charAt(index) != ' ') {
                ans[indexs][0] = String.valueOf(text.charAt(index));
                ans[indexs][1] = checkCharacterType(text.charAt(index));
                indexs++;
            }
        }
        return ans;
    }

    static void displayResults(String[][] result) {
        System.out.printf("%-10s %-15s\n", "Character", "Type");


        for (String[] row : result) {
            if (row[0] != null) {//after removing space we have empty spaces also so to remove it
                System.out.printf("%-10s %-15s\n", row[0], row[1]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[][] result = getInTwoDArray(text);
        displayResults(result);

        input.close();
    }
}
