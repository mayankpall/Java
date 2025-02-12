package com.bridgelabz.strings.levelone;

public class NullPointerExceptionDemo {

    static void generateException() {
        String text = null;
        System.out.println(text.length()); // Throws NullPointerException
    }

    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage() );
        }
    }

    public static void main(String[] args) {
//         generateException();

        handleException();
    }
}
