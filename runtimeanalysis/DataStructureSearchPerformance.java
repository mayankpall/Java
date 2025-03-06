package com.bridgelabz.runtimeanalysis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class DataStructureSearchPerformance {

    public static void main(String[] args) {
        int[] dataSizes = {1000, 10000, 100000, 1000000};

        for (int size : dataSizes) {
            System.out.println("Dataset Size: " + size);


            Random random = new Random();
            List<Integer> data = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                data.add(random.nextInt(size * 10));
            }


            List<Integer> arrayList = new ArrayList<>(data);
            HashSet<Integer> hashSet = new HashSet<>(data);
            TreeSet<Integer> treeSet = new TreeSet<>(data);


            int numSearches = 1000;
            List<Integer> searchElements = new ArrayList<>(numSearches);
            for (int i = 0; i < numSearches; i++) {
                if (i % 2 == 0) {

                    searchElements.add(data.get(random.nextInt(data.size())));
                } else {

                    searchElements.add(size * 10 + random.nextInt(size));
                }
            }


            long startTime = System.nanoTime();
            int arrayListFound = 0;
            for (int element : searchElements) {
                if (arrayList.contains(element)) {
                    arrayListFound++;
                }
            }
            long arrayListTime = System.nanoTime() - startTime;


            startTime = System.nanoTime();
            int hashSetFound = 0;
            for (int element : searchElements) {
                if (hashSet.contains(element)) {
                    hashSetFound++;
                }
            }
            long hashSetTime = System.nanoTime() - startTime;


            startTime = System.nanoTime();
            int treeSetFound = 0;
            for (int element : searchElements) {
                if (treeSet.contains(element)) {
                    treeSetFound++;
                }
            }
            long treeSetTime = System.nanoTime() - startTime;


            double arrayListTimeMs = arrayListTime / 1_000_000.0;
            double hashSetTimeMs = hashSetTime / 1_000_000.0;
            double treeSetTimeMs = treeSetTime / 1_000_000.0;


            System.out.println("ArrayList search time: " + arrayListTimeMs + " ms, found: " + arrayListFound);
            System.out.println("HashSet search time: " + hashSetTimeMs + " ms, found: " + hashSetFound);
            System.out.println("TreeSet search time: " + treeSetTimeMs + " ms, found: " + treeSetFound);


            System.out.println("HashSet is " + (arrayListTimeMs / hashSetTimeMs) + "x faster than ArrayList");
            System.out.println("TreeSet is " + (arrayListTimeMs / treeSetTimeMs) + "x faster than ArrayList");
            System.out.println("HashSet is " + (treeSetTimeMs / hashSetTimeMs) + "x faster than TreeSet");

            System.out.println("------------------------------");
        }

    }
}