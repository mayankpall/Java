package com.bridgelabz.runtimeanalysis;

import java.util.Arrays;
import java.util.Random;

public class SearchTarget {

    public static void main(String[] args) {
        int[] dataSizes = {1000, 10000, 1000000};

        for (int size : dataSizes) {
            int[] data = generateRandomArray(size);

            int[] sortedData = Arrays.copyOf(data, data.length);
            Arrays.sort(sortedData);

            int targetIndex = new Random().nextInt(size);
            int target = data[targetIndex];

            long startTime = System.nanoTime();
            int linearResult = linearSearch(data, target);
            long linearSearchTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            Arrays.sort(data);
            int binaryResult = binarySearch(data, target);
            long binarySearchWithSortTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            int binaryResultSorted = binarySearch(sortedData, target);
            long binarySearchTime = System.nanoTime() - startTime;

            double linearTimeMs = linearSearchTime / 1_000_000.0;
            double binaryWithSortTimeMs = binarySearchWithSortTime / 1_000_000.0;
            double binaryTimeMs = binarySearchTime / 1_000_000.0;

            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search time: " + linearTimeMs + " ms");
            System.out.println("Binary Search time : " + binaryWithSortTimeMs + " ms");
            System.out.println("Binary Search time : " + binaryTimeMs + " ms");
            System.out.println("Linear Search found at index: " + linearResult);
            System.out.println("Binary Search found at index: " + binaryResult);
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

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}