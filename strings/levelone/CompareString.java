package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class CompareString {
    static boolean compareUsingCharAt(String stringOne , String stringTwo){
        if(stringTwo.length() != stringOne.length()) return false;

        for(int index = 0; index < stringOne.length(); index++){
            if(stringOne.charAt(index) != stringTwo.charAt(index)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String 1 : ");
        String stringOne = input.next();

        System.out.print("Enter String 2 : ");
        String stringTwo = input.next();

        boolean checkUsingEquals = stringTwo.equals(stringOne);

        System.out.println("Are two string "+ stringOne+" and " + stringTwo + " are equal ? ");
        System.out.printf("Output using charAt : %b \n", compareUsingCharAt(stringOne,stringTwo));
        System.out.printf("Output using built in equals : %b \n", checkUsingEquals);

        input.close();
    }
}
