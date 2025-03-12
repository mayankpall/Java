package com.bridgelabz.collections.setinterface;

import java.util.*;

public class UnionAndIntersection {

    static <T> Set<T> getUnion(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }


    static <T> Set<T> getIntersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter number of elements for Set 1:");
        int n = scanner.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            set1.add(scanner.nextInt());
        }

        System.out.println("Enter number of elements for Set 2:");
        int m = scanner.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            set2.add(scanner.nextInt());
        }

        scanner.close();


        System.out.println("Union: " + getUnion(set1, set2));
        System.out.println("Intersection: " + getIntersection(set1, set2));
    }
}
