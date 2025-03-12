package com.bridgelabz.collections.setinterface;
import java.util.*;


public class FindSubsets {
    public static <T> boolean isSubset(Set<T> set1, Set<T> set2) {
        return set1.containsAll(set2);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 5));

        System.out.println("Set2 a subset of set1? " + isSubset(set1, set2));
    }
}
