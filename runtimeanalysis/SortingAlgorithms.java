package com.bridgelabz.runtimeanalysis;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] dataSizes = {1000, 10000, 100000};

        for (int size : dataSizes) {
            System.out.println("Dataset Size: " + size);

            int[] originalArray = generateRandomArray(size);


            int[] bubbleSortArray = Arrays.copyOf(originalArray, originalArray.length);
            long startTime = System.nanoTime();
            if (size <= 10000) {
                bubbleSort(bubbleSortArray);
                long bubbleSortTime = System.nanoTime() - startTime;
                System.out.println("Bubble Sort time: " + bubbleSortTime / 1_000_000.0 + " ms");
            } else {
                System.out.println("Bubble Sort time: Skipped (would take too long)");
            }


            int[] mergeSortArray = Arrays.copyOf(originalArray, originalArray.length);
            startTime = System.nanoTime();
            mergeSort(mergeSortArray, 0, mergeSortArray.length - 1);
            long mergeSortTime = System.nanoTime() - startTime;
            System.out.println("Merge Sort time: " + mergeSortTime / 1_000_000.0 + " ms");


            int[] quickSortArray = Arrays.copyOf(originalArray, originalArray.length);
            startTime = System.nanoTime();
            quickSort(quickSortArray, 0, quickSortArray.length - 1);
            long quickSortTime = System.nanoTime() - startTime;
            System.out.println("Quick Sort time: " + quickSortTime / 1_000_000.0 + " ms");


            int[] javaBuiltinSortArray = Arrays.copyOf(originalArray, originalArray.length);
            startTime = System.nanoTime();
            Arrays.sort(javaBuiltinSortArray);
            long javaBuiltinSortTime = System.nanoTime() - startTime;
            System.out.println("Java's Built-in Sort time: " + javaBuiltinSortTime / 1_000_000.0 + " ms");


            boolean allSortsCorrect = true;
            if (size <= 10000) {
                allSortsCorrect &= isSorted(bubbleSortArray);
            }
            allSortsCorrect &= isSorted(mergeSortArray);
            allSortsCorrect &= isSorted(quickSortArray);
            allSortsCorrect &= isSorted(javaBuiltinSortArray);

            System.out.println("All sorts correct: " + allSortsCorrect);
            System.out.println("------------------------------");
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size * 10);
        }

        return arr;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}