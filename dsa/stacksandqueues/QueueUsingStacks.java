package com.bridgelabz.dsa.stacksandqueues;

import java.util.Stack;

class Stacks {
    Stack<Integer> stackInput;
    Stack<Integer> stackOutput;

    Stacks() {
        this.stackInput = new Stack<>();
        this.stackOutput = new Stack<>();
    }

    public void pushElement(int element) {
        stackInput.push(element);
    }

    public int popElement() {
        if (stackInput.empty() && stackOutput.empty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (stackOutput.empty()) {
            while (!stackInput.empty()) {
                stackOutput.push(stackInput.pop());
            }
        }

        return stackOutput.pop();
    }

    public int peekElement() {
        if (stackInput.empty() && stackOutput.empty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (stackOutput.empty()) {
            while (!stackInput.empty()) {
                stackOutput.push(stackInput.pop());
            }
        }

        return stackOutput.peek();
    }

    public boolean isEmpty() {
        return stackInput.empty() && stackOutput.empty();
    }
}

public class QueueUsingStacks {
    public static void main(String[] args) {
        Stacks queue = new Stacks();
        queue.pushElement(1);
        queue.pushElement(2);
        queue.pushElement(3);

        System.out.println("First element: " + queue.peekElement());
        System.out.println("Removed element: " + queue.popElement());
        System.out.println("New first element: " + queue.peekElement());

        queue.pushElement(4);
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.popElement());
        }
    }
}


//package com.bridgelabz.dsa.stacksandqueues;
//
//import java.util.Stack;
//
//class Queue {
//    // Two stacks: one for enqueue operations, one for dequeue operations
//    private Stack<Integer> enqStack;    // For pushing new elements
//    private Stack<Integer> deqStack;    // For popping/peeking elements
//
//    public Queue() {
//        enqStack = new Stack<>();
//        deqStack = new Stack<>();
//    }
//
//    /**
//     * Adds an element to the queue (O(1) time complexity)
//     * Simply push to the enqueue stack
//     */
//    public void enqueue(int element) {
//        enqStack.push(element);
//    }
//
//    /**
//     * Removes and returns the first element from the queue
//     * Amortized O(1) time complexity
//     */
//    public int dequeue() {
//        // If both stacks are empty, queue is empty
//        if (enqStack.empty() && deqStack.empty()) {
//            throw new IllegalStateException("Queue is empty");
//        }
//
//        // If dequeue stack is empty, transfer all elements from enqueue stack
//        if (deqStack.empty()) {
//            transferElements();
//        }
//
//        return deqStack.pop();
//    }
//
//    /**
//     * Returns the first element without removing it
//     * Amortized O(1) time complexity
//     */
//    public int peek() {
//        if (enqStack.empty() && deqStack.empty()) {
//            throw new IllegalStateException("Queue is empty");
//        }
//
//        if (deqStack.empty()) {
//            transferElements();
//        }
//
//        return deqStack.peek();
//    }
//
//    /**
//     * Transfers elements from enqueue stack to dequeue stack
//     * This reverses their order, making the first-in element accessible
//     */
//    private void transferElements() {
//        while (!enqStack.empty()) {
//            deqStack.push(enqStack.pop());
//        }
//    }
//
//    /**
//     * Returns whether the queue is empty
//     */
//    public boolean isEmpty() {
//        return enqStack.empty() && deqStack.empty();
//    }
//}
//
//public class QueueUsingStacks {
//    public static void main(String[] args) {
//        Queue queue = new Queue();
//
//        // Test the queue operations
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//
//        System.out.println("First element: " + queue.peek());  // Should print 1
//        System.out.println("Dequeued: " + queue.dequeue());   // Should print 1
//        System.out.println("Dequeued: " + queue.dequeue());   // Should print 2
//
//        queue.enqueue(4);
//        System.out.println("First element: " + queue.peek());  // Should print 3
//    }
//}

