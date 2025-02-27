package com.bridgelabz.dsa.sorting;


import java.util.Arrays;

public class JobApplicants {


    static void heapify(int[] arr, int current, int size){

        int l = 2 * current + 1;
        int r = 2* current + 2;

        int largest = current;

        if(l < size && arr[l] > arr[largest] ){
           largest = l;
        }
        if(r < size && arr[r] > arr[largest]){
            largest = r;
        }

        if(largest != current){
            int temp = arr[current];
            arr[current] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, size);
        }



    }

    static void heapSort(int[] arr, int N){

        for(int i = N/2 - 1; i >= 0 ; i-- ){
            heapify(arr, i, N);
        }

        for(int i = N -1 ; i > 0 ; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }

    }




    public static void main(String[] args) {
        int[] array = {0, -2, 31, 24, 2, 1, 9};

        System.out.println("Before sorting:" + Arrays.toString(array));


        heapSort(array, array.length);

        System.out.println("After sorting:"+ Arrays.toString(array));

    }
}
