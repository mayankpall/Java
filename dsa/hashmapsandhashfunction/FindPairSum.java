package com.bridgelabz.dsa.hashmapsandhashfunction;

import java.util.HashMap;

public class FindPairSum {

    static boolean hasPair(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(target - i)){
                System.out.println("Pair found: (" + i + ", " + (target - i) + ")");
                return true;
            }
            map.put(i, 1);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        if (!hasPair(nums, target)) {
            System.out.println("No pair found.");
        }
    }
}
