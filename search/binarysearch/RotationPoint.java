package com.bridgelabz.search.binarysearch;

public class RotationPoint {

    static int getSmallestIndex(int[] array){
        int high = array.length - 1;
        int low = 0;


        while (high > low){
            int mid = low + (high - low)/2;

            if(array[mid] > array[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }

        }

        return low;

    }

    public static void main(String[] args) {

        int[] nums = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int rotationIndex = getSmallestIndex(nums);
        System.out.println("Rotation point index: " + rotationIndex);


    }
}
