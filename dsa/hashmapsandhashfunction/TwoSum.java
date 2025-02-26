package com.bridgelabz.dsa.hashmapsandhashfunction;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] getPair(int[] arr, int target) {

        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];


            if (hm.containsKey(complement)) {

                return new int[]{hm.get(complement), i};
            }


            hm.put(arr[i], i);
        }


        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = getPair(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}