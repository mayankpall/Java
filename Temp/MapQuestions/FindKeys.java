package com.bridgelabz.Temp.MapQuestions;

import java.util.HashMap;
import java.util.Map;


public class FindKeys {
    public static void main(String[] args) {
        HashMap <String , Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("D", 4);

        String findKey = "C";

        if(hashMap.containsKey(findKey)){
            System.out.println("Found the value : "+hashMap.get(findKey) + " of key "+findKey);
        }
        else {
            System.out.println("Not found!!");
        }

        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println("key is "+ entry.getKey() );
        }

    }
}
