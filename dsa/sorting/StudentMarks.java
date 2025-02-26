package com.bridgelabz.dsa.sorting;


public class StudentMarks {
   static public void bubbleSort(int[] arr){
        int size = arr.length;
        boolean swapped ;

        for(int i = 0; i < size - 1; i++){
            swapped = false;
            for(int j = 0; j < size - i - 1; j++){
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] array = {0,31,24,2, 1, 9};

        System.out.println("Before sorting : " );
        printArray(array);

        bubbleSort(array);

        System.out.println("After sorting : " );
        printArray(array);


    }
}
