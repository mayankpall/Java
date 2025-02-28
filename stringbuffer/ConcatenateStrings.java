package com.bridgelabz.stringbuffer;

import java.util.Arrays;

public class ConcatenateStrings {
    public static void main(String[] args) {

        String[] string = {"Mayank", "Arnav","Vibhor", "Kanika"};
        System.out.println("Current Array :");
        System.out.println(Arrays.toString(string));


        StringBuffer stringBuffer = new StringBuffer();
        for(String words: string){
            stringBuffer.append(words);
        }

        System.out.println("After Concatenate Strings :");
        System.out.println(stringBuffer.toString());

    }
}
