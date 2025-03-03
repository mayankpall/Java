package com.bridgelabz.search.binarysearch;

public class FirstAndLastOccurrence {


        static int findFirstOccurrence(int[] arr, int target) {
            int low = 0, high = arr.length - 1;
            int firstOccurrence = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    firstOccurrence = mid;
                    high = mid - 1;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return firstOccurrence;
        }


        static int findLastOccurrence(int[] arr, int target) {
            int low = 0, high = arr.length - 1;
            int lastOccurrence = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    lastOccurrence = mid;
                    low = mid + 1;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return lastOccurrence;
        }


        static int[] findFirstAndLastOccurrence(int[] arr, int target) {
            int first = findFirstOccurrence(arr, target);
            int last = findLastOccurrence(arr, target);
            return new int[]{first, last};
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 2, 3, 4, 5, 5, 5, 6};
            int target = 2;

            int[] result = findFirstAndLastOccurrence(nums, target);
            System.out.println("First Occurrence: " + result[0]);
            System.out.println("Last Occurrence: " + result[1]);
        }
    }


