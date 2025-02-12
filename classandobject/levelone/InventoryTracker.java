package com.bridgelabz.classandobject.levelone;

import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("\nItem Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Item item = getItemDetails();
        item.displayDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity to calculate total cost: ");
        int quantity = scanner.nextInt();
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));

        scanner.close();
    }

    private static Item getItemDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item code: ");
        int itemCode = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        return new Item(itemCode, itemName, price);
    }
}
