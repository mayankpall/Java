package com.bridgelabz.collections.listinterface;

import java.util.*;

public class FrequencyOfElements {

    static <T> Map<T, Integer> getNumberOfElements(List<T> list){
        Map<T, Integer> map = new HashMap<>();

        for(T element : list){
            map.put(element, map.getOrDefault(element, 0)+1);
        }

        return map;
    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));

        Map<String, Integer> frequencyMap = getNumberOfElements(fruits);


        System.out.println("Input: " + fruits);
        System.out.println("Output: " + frequencyMap);


        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 1, 5, 1));
        Map<Integer, Integer> numberFrequency = getNumberOfElements(numbers);
        System.out.println("\nInput: " + numbers);
        System.out.println("Output: " + numberFrequency);
    }
}