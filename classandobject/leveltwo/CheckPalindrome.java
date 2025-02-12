package com.bridgelabz.classandobject.leveltwo;

import java.util.Scanner;

class PalindromeChecker {
    private String text; // Stores the input text

    public PalindromeChecker(String text) {
        this.text = text;
    }

    // check if the given text is a palindrome
    public boolean isPalindrome() {
        int startIndex = 0;
        int endIndex = text.length() - 1;

        while (startIndex < endIndex) {
            if (text.charAt(startIndex) != text.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    //  display the result
    public void displayResult() {
        System.out.println("String " + text +  " is " + (isPalindrome() ? "a Palindrome." : "not a Palindrome."));
    }
}

public class CheckPalindrome {
    //  user input and return a PalindromeChecker object
    private static PalindromeChecker getText(Scanner input) {
        System.out.print("Enter a string to check palindrome: ");
        String text = input.nextLine();
        return new PalindromeChecker(text);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PalindromeChecker checkPalindrome = getText(input);
        checkPalindrome.displayResult();

        input.close();
    }
}
