package com.bridgelabz.strings.levelthree;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {


        static char findFirstNonRepeatingChar(String text) {
            int[] frequency = new int[256];

            for (int i = 0; i < text.length(); i++) {
                frequency[text.charAt(i)]++;
            }

            for (int i = 0; i < text.length(); i++) {
                if (frequency[text.charAt(i)] == 1) {
                    return text.charAt(i);
                }
            }

            return '\0';
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = scanner.nextLine();

            char result = findFirstNonRepeatingChar(text);

            if (result != '\0') {
                System.out.println("First non-repeating character: " + result);
            } else {
                System.out.println("No non-repeating character found.");
            }

            scanner.close();
        }
    }


