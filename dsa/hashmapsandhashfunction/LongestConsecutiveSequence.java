package com.bridgelabz.dsa.hashmapsandhashfunction;

import java.util.HashSet;

class longestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num); // Store all elements in HashSet

        int maxLen = 0;

        for (int num : nums) {

            if (!set.contains(num - 1)) {
                int currNum = num;
                int currLen = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }

                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        longestConsecutiveSequence sol = new longestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + sol.longestConsecutive(nums));
    }
}
