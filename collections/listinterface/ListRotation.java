package com.bridgelabz.collections.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRotation {

    public static <T> void rotateList(List<T> list, int positions) {
        if (list == null || list.size() <= 1) {
            return;
        }

        int size = list.size();
        positions = positions % size; // Handle cases where positions > size

        if (positions < 0) {
            positions = size + positions;
        }

        if (positions == 0) {
            return;
        }

        reverse(list, 0, size - 1);
        reverse(list, 0, positions - 1);
        reverse(list, positions, size - 1);
    }

    private static <T> void reverse(List<T> list, int start, int end) {
        while (start < end) {
            T temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }



    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original list: " + numbers);

        rotateList(numbers, 2);

        System.out.println("After Rotation: " + numbers);

    }
}