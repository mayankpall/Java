package com.bridgelabz.collections.listinterface;

import java.util.*;

public class RemoveDuplicates {

    static <T>  List<T> removeDuplicates(List<T> list){

        Set<T> seen = new HashSet<>();
        List<T> answer = new ArrayList<>();

        for (T element : list) {
            if (!seen.contains(element)) {
                seen.add(element);
                answer.add(element);
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,5));
        List<Integer> answer = removeDuplicates(list);
        System.out.println(answer);
    }
}
