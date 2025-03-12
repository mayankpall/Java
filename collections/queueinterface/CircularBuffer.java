package com.bridgelabz.collections.queueinterface;

class CircularBuffer {
    private int[] buffer;
    private int head, tail, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void enqueue(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
        if (size < capacity) {
            size++;
        } else {
            head = (head + 1) % capacity;
        }
    }

    public int dequeue() {
        if (size == 0) throw new RuntimeException("Buffer is empty");
        int value = buffer[head];
        head = (head + 1) % capacity;
        size--;
        return value;
    }

    public int peek() {
        if (size == 0) throw new RuntimeException("Buffer is empty");
        return buffer[head];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(head + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.enqueue(1);
        cb.enqueue(2);
        cb.enqueue(3);
        cb.display();
        cb.enqueue(4);
        cb.display();
        cb.dequeue();
        cb.display();
    }
}
