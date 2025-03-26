package com.bridgelabz.Temp.MapQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AscendingAndDecending {
    public static void main(String[] args) {
        TreeMap<String, Integer> lhm = new TreeMap<>();
        lhm.put("A", 1);
        lhm.put("B", 2);
        lhm.put("C", 3);
        lhm.put("D", 4);

        for(Map.Entry<String, Integer> entry: lhm.entrySet()){
            System.out.println("Key is : " + entry.getKey());
        }
        System.out.println("--------");
        for(Map.Entry<String, Integer> entry: lhm.descendingMap().entrySet()){
            System.out.println("Key is : " + entry.getKey());
        }
    }
}
