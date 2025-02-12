package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class LeadingAndTrailingSpaces {


        static int[] findTrimIndices(String text) {
            int start = 0, end = text.length() - 1;

            while (start < text.length() && text.charAt(start) == ' ') {
                start++;
            }

            while (end > start && text.charAt(end) == ' ') {
                end--;
            }

            return new int[]{start, end};
        }

        static String substringUsingCharAt(String text, int start, int end) {
            StringBuilder trimmedText = new StringBuilder();
            for (int i = start; i <= end; i++) {
                trimmedText.append(text.charAt(i));
            }
            return trimmedText.toString();
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

            System.out.print("Enter a string with leading and trailing spaces: ");
            String text = input.nextLine();

            int[] indices = findTrimIndices(text);
            String trimmedCustom = substringUsingCharAt(text, indices[0], indices[1]);
            String trimmedBuiltIn = text.trim();

            System.out.println("\nTrimmed using charAt() method: \"" + trimmedCustom + "\"");
            System.out.println("Trimmed using built-in trim(): \"" + trimmedBuiltIn + "\"");
            System.out.println("Are both trimmed texts equal? " + compareStrings(trimmedCustom, trimmedBuiltIn));

            input.close();
        }
    }

