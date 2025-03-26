package com.bridgelabz.Temp.MapQuestions;

import java.util.HashMap;


public class AddAndDisplay {
    public static void main(String[] args) {
        HashMap <String , Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("D", 4);

        hashMap.forEach((key, val) -> System.out.println("Key is "+key +" Value is "+ val));

    }
}
