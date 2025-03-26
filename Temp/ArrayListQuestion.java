package com.bridgelabz.Temp;

import java.util.*;

//Create a Java Application where we need to create an ArrayList Object by using Integer as its Generic type.
// add a few elements to it, and print all the elements using the ForEach loop.
public class ArrayListQuestion {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(12);
        arrayList.add(14);

        Collections.sort(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

        System.out.println("---------------------------------");

        for(int i : arrayList){
            System.out.println(i + " ");
        }

        System.out.println("---------------------------------");

        for(int i = 0; i < arrayList.toArray().length; i ++){
            System.out.println(i + " ");
        }

        System.out.println("---------------------------------");

        arrayList.forEach(num -> System.out.println(num));

        System.out.println("---------------------------------");

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------------------------------");
        ListIterator<Integer> listIterator = arrayList.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }




    }
}
