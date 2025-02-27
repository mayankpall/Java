package com.bridgelabz.dsa.sorting;

import java.util.Arrays;

public class StudentAges {

    public static void countingSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int min = 10;
        int max = 18;
        int range = max - min + 1;


        int[] count = new int[range];
        Arrays.fill(count, 0);


        for (int age : arr) {
            count[age - min]++;
        }


        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }


        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }


        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] array = {15, 12, 18, 10, 14, 11, 10, 16, 13, 14};

        System.out.println("Before sorting:" + Arrays.toString(array));

        countingSort(array);

        System.out.println("After sorting:" + Arrays.toString(array));
    }
}
