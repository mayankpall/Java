package com.bridgelabz.dsa.sorting;

public class BookPrices {
    static void merge(int[] arr, int left , int mid , int right){
        int sizeOne = mid - left + 1;
        int sizeTwo = right - mid ;

        int[] leftArr = new int[sizeOne];
        int[] rightArr = new int[sizeTwo];

        for(int i = 0; i < sizeOne; i++){
            leftArr[i] = arr[left + i];
        }

        for(int i = 0; i < sizeTwo; i++){
            rightArr[i] = arr[mid + i + 1];
        }

        int i =0; int j = 0; int k = left;

        while(i < sizeOne && j < sizeTwo){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }

            k++;
        }

        while (i < sizeOne){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < sizeTwo){
            arr[k] = rightArr[j];
            j++;
            k++;
        }



    }




    static void mergeSort(int[] arr, int left, int right){
       if(left >= right){
           return;
       }

       int mid = left + (right - left)/2;
       mergeSort(arr, left, mid);
       mergeSort(arr, mid+1, right);
       merge(arr, left, mid, right);

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

        mergeSort(array, 0, array.length -1);

        System.out.println("After sorting : " );
        printArray(array);


    }
}
