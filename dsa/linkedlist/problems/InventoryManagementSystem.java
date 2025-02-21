package com.bridgelabz.dsa.linkedlist.problems;

class Item {
    String name;
    int id;
    int quantity;
    int price;

    Item(int itemId, String name, int quantity, int price) {
        this.name = name;
        this.id = itemId;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayItem() {
        System.out.println("\nItem details:");
        System.out.println("Name : " + name);
        System.out.println("Item ID : " + id);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
    }
}

class ItemNode {
    Item item;
    ItemNode next;

    ItemNode(Item item) {
        this.item = item;
        this.next = null;
    }
}

public class InventoryManagementSystem {
    private ItemNode head = null;

    public void addAtBeginning(Item item) {
        ItemNode newNode = new ItemNode(item);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(Item item) {
        ItemNode newNode = new ItemNode(item);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode current = head;
        while (current.next != null) current = current.next;
        current.next = newNode;
    }

    public void addAtPosition(Item item, int position) {
        if (position == 0) {
            addAtBeginning(item);
            return;
        }

        ItemNode newNode = new ItemNode(item);
        ItemNode current = head;
        for (int i = 0; current != null && i < position - 1; i++) current = current.next;
        if (current == null) {
            System.out.println("Invalid position!");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeItemById(int id) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.item.id == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }
        ItemNode current = head;
        while (current.next != null && current.next.item.id != id) current = current.next;
        if (current.next == null) System.out.println("Item not found.");
        else {
            current.next = current.next.next;
            System.out.println("Item removed.");
        }
    }

    public void updateQuantity(int id, int newQuantity) {
        ItemNode current = head;
        while (current != null) {
            if (current.item.id == id) {
                current.item.quantity = newQuantity;
                System.out.println("Quantity updated.");
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found.");
    }

    public void searchItemById(int id) {
        ItemNode current = head;
        while (current != null) {
            if (current.item.id == id) {
                current.item.displayItem();
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found.");
    }

    public void searchItemByName(String name) {
        ItemNode current = head;
        while (current != null) {
            if (current.item.name.equalsIgnoreCase(name)) {
                current.item.displayItem();
                return;
            }
            current = current.next;
        }
        System.out.println("Item not found.");
    }

    public void totalInventoryValue() {
        double total = 0;
        ItemNode current = head;
        while (current != null) {
            total += current.item.price * current.item.quantity;
            current = current.next;
        }
        System.out.println("\nTotal Inventory Value: " + total);
    }

    public void displayInventory() {
        ItemNode current = head;
        if (current == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        while (current != null) {
            current.item.displayItem();
            current = current.next;
        }
    }

    // Sorting using Merge Sort
    public void sortInventoryByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
        System.out.println("Inventory sorted by Name.");
    }

    public void sortInventoryByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
        System.out.println("Inventory sorted by Price.");
    }

    private ItemNode mergeSort(ItemNode head, boolean ascending, boolean sortByName) {
        if (head == null || head.next == null) return head;

        ItemNode middle = getMiddle(head);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(head, ascending, sortByName);
        ItemNode right = mergeSort(nextOfMiddle, ascending, sortByName);

        return merge(left, right, ascending, sortByName);
    }

    private ItemNode merge(ItemNode left, ItemNode right, boolean ascending, boolean sortByName) {
        if (left == null) return right;
        if (right == null) return left;

        int compare;
        if (sortByName) compare = left.item.name.compareTo(right.item.name);
        else compare = Integer.compare(left.item.price, right.item.price);

        if ((ascending && compare <= 0) || (!ascending && compare > 0)) {
            left.next = merge(left.next, right, ascending, sortByName);
            return left;
        } else {
            right.next = merge(left, right.next, ascending, sortByName);
            return right;
        }
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        InventoryManagementSystem inventory = new InventoryManagementSystem();

        // Adding items
        inventory.addAtEnd(new Item(1, "Laptop", 5, 70000));
        inventory.addAtEnd(new Item(2, "Phone", 10, 30000));
        inventory.addAtEnd(new Item(3, "Tablet", 7, 40000));
        inventory.addAtEnd(new Item(4, "Monitor", 8, 20000));
        inventory.addAtEnd(new Item(5, "Mouse", 15, 500));

        // Display inventory
        inventory.displayInventory();

        // Total inventory value
        inventory.totalInventoryValue();

        // Search operations
        inventory.searchItemById(3);
        inventory.searchItemByName("Mouse");

        // Update quantity
        inventory.updateQuantity(2, 20);
        inventory.displayInventory();

        // Remove item
        inventory.removeItemById(4);
        inventory.displayInventory();

        // Sorting
        inventory.sortInventoryByName(true);
        inventory.displayInventory();

        inventory.sortInventoryByPrice(false);
        inventory.displayInventory();
    }
}
