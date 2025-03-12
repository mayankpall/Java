package com.bridgelabz.collections.setinterface;

import java.util.*;

public class SymmetricDifference {

    public static <T> Set<T> getSymmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);

        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Common elements

        symmetricDiff.removeAll(intersection); // Remove common elements

        return symmetricDiff;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        System.out.println("Symmetric Difference: " + getSymmetricDifference(set1, set2));
    }
}
