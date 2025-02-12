package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    static void generateException(String[] names, int index) {
        System.out.println("Accessing index: " + index);
        System.out.println("Name: " + names[index]);
    }

    static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessing index: " + index);
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Generic Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma"};

        System.out.print("Enter index to access (0 to " + (names.length - 1) + "): ");
        int index = input.nextInt();


        // generateException(names, index);

        handleException(names, index);

        input.close();
    }
}
