package com.bridgelabz.dsa.linkedlist.practice;

class DllNode {
    int data;
    DllNode next;
    DllNode prev;  // Additional pointer to previous node

    DllNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    DllNode head;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        DllNode newDllNode = new DllNode(data);

        if (head == null) {
            head = newDllNode;
            return;
        }

        newDllNode.next = head;
        head.prev = newDllNode;
        head = newDllNode;
    }

    // Insert at end
    public void append(int data) {
        DllNode newDllNode = new DllNode(data);

        if (head == null) {
            head = newDllNode;
            return;
        }

        DllNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newDllNode;
        newDllNode.prev = current;
    }

    // Delete a node
    public void delete(int data) {
        DllNode current = head;

        // If head node itself holds the data
        if (current != null && current.data == data) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        while (current != null && current.data != data) {
            current = current.next;
        }

        // If data wasn't present
        if (current == null) {
            return;
        }

        // Unlink the node
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        current.prev.next = current.next;
    }
}

class Dll{
    public static void main(String[] args) {

    }
}