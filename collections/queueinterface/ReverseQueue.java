package com.bridgelabz.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    static <T> void reverseQueue(Queue<T> queue){
        if(queue.isEmpty()) return;

        T temp = queue.remove();
        reverseQueue(queue);
        queue.add(temp);


    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
