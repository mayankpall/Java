package com.bridgelabz.dsa.linkedlist.practice;

class Node{
    int data;
    DllNode next;

    Node(int data){
       this.next = null;
       this.data = data;
    }


}

class LinkedList{
    DllNode head;

    //append
    public void append(int data){
        //if no nodes present
        if(head == null){
            head = new DllNode(data);
            return;
        }

        DllNode newDllNode = head;

        while (newDllNode.next != null){
            newDllNode = newDllNode.next;
        }

        newDllNode.next = new DllNode(data);
    }

    //printList
    public void printList(){
        DllNode tempDllNode = head;

        while (tempDllNode != null){
            System.out.println("Node -> "+ tempDllNode.data);
            tempDllNode = tempDllNode.next;
        }
    }


    public void insertAtBeginning(int data){

        DllNode newDllNode = new DllNode(data);
        newDllNode.next = head;
        head = newDllNode;
    }




        // Insert at a specific position (0-based index)
        public void insertAt(int position, int data) {
            if (position < 0) {
                System.out.println("Invalid position");
                return;
            }

            // Insert at beginning if position is 0
            if (position == 0) {
                insertAtBeginning(data);
                return;
            }

            DllNode newDllNode = new DllNode(data);
            DllNode current = head;

            // Move to the node just before the desired position
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }

            // Check if position is valid
            if (current == null) {
                System.out.println("Position out of bounds");
                return;
            }

            // Insert the new node
            newDllNode.next = current.next;
            current.next = newDllNode;
        }


        // Delete node at specific position
        public void deleteAt(int position) {
            if (head == null || position < 0) {
                return;
            }

            // Delete first node if position is 0
            if (position == 0) {
                head = head.next;
                return;
            }

            DllNode current = head;
            for (int i = 0; i < position - 1 && current.next != null; i++) {
                current = current.next;
            }

            // Check if position is valid
            if (current.next == null) {
                System.out.println("Position out of bounds");
                return;
            }

            // Delete the node
            current.next = current.next.next;
        }

        // Delete node with specific value (first occurrence)
        public void deleteValue(int value) {
            if (head == null) {
                return;
            }

            // If head node holds the value
            if (head.data == value) {
                head = head.next;
                return;
            }

            DllNode current = head;
            while (current.next != null && current.next.data != value) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            }
        }







}

public class basics {
    public static void main(String[] args) {


//        LinkedList linkedList = new LinkedList();
//        linkedList.append(10);
//        linkedList.append(9);
//        linkedList.printList();

        DllNode first = new DllNode(10);
        DllNode second = new DllNode(20);
        DllNode third = new DllNode(30);

        first.next = second;
        second.next = third;

    }
}
