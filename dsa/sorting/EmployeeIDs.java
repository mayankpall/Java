package com.bridgelabz.dsa.sorting;

public class EmployeeIDs {
    static public void insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] array = {0, -2, 31,24,2, 1, 9};

        System.out.println("Before sorting : " );
        printArray(array);

        insertionSort(array);

        System.out.println("After sorting : " );
        printArray(array);


    }
}
