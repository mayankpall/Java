package com.bridgelabz.collections.listinterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ElementFromEnd {

    public static <T>  T getNFromLast (LinkedList<T> linkedList, int n){
        Iterator<T> fast = linkedList.iterator();
        Iterator<T> slow = linkedList.iterator();

        for(int i = 0; i < n; i++){
            fast.next();
        }

        while(fast.hasNext() ){
            fast.next();
            slow.next();
        }

        return slow.next();


    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,23,4,56,3,5));
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 2;
        System.out.println("Nth element from the end: " + getNFromLast(linkedList, N));


    }
}
