package com.bridgelabz.search.binarysearch;

public class PeakElement {

    static int getPeakElement(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;


            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {

                low = mid + 1;
            }
        }


        return arr[low];
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1, 0};
        int peak = getPeakElement(nums);
        System.out.println("Peak element: " + peak);
    }
}
