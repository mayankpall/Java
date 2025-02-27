package com.bridgelabz.dsa.sorting;

import java.util.Arrays;

public class ExamScores {
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minimumElement = i;
            for(int j = i+1; j < n; j++){
                if(arr[minimumElement] > arr[j]){
                    minimumElement = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimumElement];
            arr[minimumElement] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, -2, 31, 24, 2, 1, 9};

        System.out.println("Before sorting:" + Arrays.toString(array));


        selectionSort(array);

        System.out.println("After sorting:"+ Arrays.toString(array));

    }
}
