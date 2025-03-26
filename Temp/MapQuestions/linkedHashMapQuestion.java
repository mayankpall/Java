package com.bridgelabz.Temp.MapQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMapQuestion {
    public static void main(String[] args) {
        Map<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("A", 1);
        lhm.put("B", 2);
        lhm.put("C", 3);
        lhm.put("D", 4);

        Map<String, Integer> lhm2 = new LinkedHashMap<>();
        lhm2.putAll(lhm);
        lhm2.put("E", 5);
        lhm2.put("F", 6);

        for(Map.Entry<String, Integer> entry: lhm2.entrySet()){
            System.out.println("Key is : " + entry.getKey());
        }

    }
}
