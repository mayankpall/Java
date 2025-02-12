package com.bridgelabz.strings.leveltwo;

import java.util.Scanner;

public class LengthOfString {

    public static int lengthUsingCharAt(String text){
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

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = input.next();

        int computedLength = lengthUsingCharAt(text);
        int builtInLength = text.length();

        System.out.println("\nLength using charAt(): " + computedLength);
        System.out.println("Length using length(): " + builtInLength);
        System.out.println("Are both results identical? " + (computedLength == builtInLength));

        input.close();
    }
}

