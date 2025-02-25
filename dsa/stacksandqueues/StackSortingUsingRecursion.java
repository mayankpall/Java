package com.bridgelabz.dsa.stacksandqueues;

import java.util.Stack;

//public class StackSortingUsingRecursion {
//    // Main method to sort the stack
//    public static void sortStack(Stack<Integer> stack) {
//        // Base case: if stack is empty or has only one element, it's already sorted
//        if (!stack.isEmpty()) {
//            // Remove the top element
//            int temp = stack.pop();
//
//            // Recursively sort the remaining stack
//            sortStack(stack);
//
//            // Insert the removed element at its correct position
//            insertInSortedOrder(stack, temp);
//        }
//    }
//
//    // Helper method to insert an element in the correct position
//    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
//        // Base case: if stack is empty or current element is greater than top
//        if (stack.isEmpty() || element > stack.peek()) {
//            stack.push(element);
//            return;
//        }
//
//        // Remove the top element
//        int temp = stack.pop();
//
//        // Recursively insert the element
//        insertInSortedOrder(stack, element);
//
//        // Put back the removed element
//        stack.push(temp);
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        // Test with unsorted numbers
//        stack.push(34);
//        stack.push(3);
//        stack.push(31);
//        stack.push(98);
//        stack.push(92);
//        stack.push(23);
//
//        System.out.println("Original Stack: " + stack);
//
//        sortStack(stack);
//
//        System.out.println("Sorted Stack: " + stack);
//
//        // Print the elements in sorted order (top to bottom)
//        System.out.println("Elements from top to bottom:");
//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop() + " ");
//        }
//    }
//}
//


public class StackSortingUsingRecursion {
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty() || stack.size() == 1) {
            return;  // Base case: empty stack or single element is already sorted
        }

        int temp = stack.pop();
        sortStack(stack);
        insertInSortedOrder(stack, temp);
    }

    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, element);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}


