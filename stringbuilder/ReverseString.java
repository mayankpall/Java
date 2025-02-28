package com.bridgelabz.stringbuilder;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String : ");
        String string =  input.next();

        StringBuilder stringBuilder = new StringBuilder(string);

        input.close();

        stringBuilder.reverse();

        System.out.println(stringBuilder.toString());

    }
}
