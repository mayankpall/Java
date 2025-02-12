package com.bridgelabz.methods.levelthree;

import jdk.jshell.execution.Util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenerateSixDigitOTP {

    static int[] getOTP(int noOfOTP){
        int[] OTP = new int[noOfOTP];

        for(int index = 0; index < noOfOTP; index++){
            OTP[index] = (int)(Math.random()*(999999 - 100000+ 1)) + 100000 ;
        }
        return  OTP;
    }

    static  boolean checkIfUnique(int[] OTP){
        Arrays.sort(OTP);

        for(int index = 1; index < OTP.length; index++){
            if(OTP[index] == OTP[index-1]) return  false;
        }
        return true;
    }

    public  static  void main(String[] args){
        int noOfOTP = 10;

        int[] generatedOTPs = getOTP(noOfOTP);

        System.out.println("Generated OTPs:");
        for (int otp : generatedOTPs) {
            System.out.println(otp);
        }

        System.out.println("Are all OTPs unique? " + checkIfUnique(generatedOTPs));


    }

}
