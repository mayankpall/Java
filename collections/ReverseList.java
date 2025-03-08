package com.bridgelabz.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ReverseList {


    static <T> void reverseArrayList(List<T> arr){
        int low = 0;
        int high = arr.size() - 1;

        while(high > low){
            T temp = arr.get(high);
            arr.set(high, arr.get(low));
           arr.set(low, temp);

            high--;
            low++;
        }
    }


    public static <T> void reverseLinkedList(LinkedList<T> list) {
        if (list.size() <= 1) {
            return;
        }

        for (int i = 0; i < list.size() - 1; i++) {

            T last = list.removeLast();

            list.add(i, last);
        }
    }



    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("Original ArrayList: " + arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);


        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("\nOriginal LinkedList: " + linkedList);
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);


    }
}
