package com.bridgelabz.Temp;

public class Temp {
    public static int LastDigit(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }

    public static void zeroAtfirst(int[] arr){
        int low = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
                low++;
            }
        }

    }


    public static void zeroAtFirst (int[] arr){
        // 1 0 2 0 3 4 5  <- from right
        // _ _ 1 2 3 4 5
        // 0 0 1 2 3 4 5


        // int lastPoistion = arr.length;
        //for i = n-1 -> 0
        //  if arr[i] != 0 then insert with last poistion and lastpoistion--

        //make zero other from lastpoition to 0

    }

    public static void main(String[] args) {

    }
}
