package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class TextToLowercase {


        static String convertUsingCharAt(String text) {
            StringBuilder lowerText = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }
                lowerText.append(ch);
            }
            return lowerText.toString();
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

            String manualLowerCase = convertUsingCharAt(text);
            String builtInLowerCase = text.toLowerCase();

            System.out.println("\nConverted using charAt(): " + manualLowerCase);
            System.out.println("Converted using toLowerCase(): " + builtInLowerCase);

            boolean isEqual = compareStrings(manualLowerCase, builtInLowerCase);
            System.out.println("Are both results identical? " + isEqual);

            input.close();
        }
    }

