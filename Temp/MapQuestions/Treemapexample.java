package com.bridgelabz.Temp.MapQuestions;

import java.util.Map;

public class Treemapexample {
    public static void main(String[] args) {

        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>();
        treeMap.put("A", 10);
        treeMap.put("B", 20);
        treeMap.put("C", 30);
        treeMap.put("D", 40);
        treeMap.put("E", 50);



        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        String givenKey = "C";

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (entry.getKey().compareTo(givenKey) < 0) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }



        boolean found = false;
        for (String key : treeMap.keySet()) {
            if (found) {
                System.out.println("Higher Key: " + key);
                break;
            }
            if (key.equals(givenKey)) {
                found = true;
            }
        }
    }
}
