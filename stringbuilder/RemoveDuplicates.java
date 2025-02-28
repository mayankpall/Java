package com.bridgelabz.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    static String removeDuplicate(String string){
        HashSet<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for( char character : string.toCharArray()){
            if(!set.contains(character)){
                stringBuilder.append(character);
                set.add(character);
            }
        }

        return  stringBuilder.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string : ");
        String string = input.next();

        System.out.println("Original String: " + string);

        String result = removeDuplicate(string);
        System.out.println("String without Duplicates: " + result);

        input.close();

    }
}
