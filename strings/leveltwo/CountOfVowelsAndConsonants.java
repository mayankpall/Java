package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class CountOfVowelsAndConsonants {

    static String checkCharacterType(char ch) {
        ch = (ch >= 65 && ch <= 90) ? (char) (ch + 32) : ch;

        if (ch >= 97 && ch <= 122) { //  a-z: 97-122
            return (ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117) ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

        static int[] countVowelsAndConsonants(String text) {
            int vowels = 0, consonants = 0;

            for (int i = 0; i < text.length(); i++) {
                String type = checkCharacterType(text.charAt(i));
                if (type.equals("Vowel")) vowels++;
                else if (type.equals("Consonant")) consonants++;
            }
            return new int[]{vowels, consonants};
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = input.nextLine();

            int[] counts = countVowelsAndConsonants(text);

            System.out.println("Total Vowels: " + counts[0]);
            System.out.println("Total Consonants: " + counts[1]);

            input.close();
        }
    }


