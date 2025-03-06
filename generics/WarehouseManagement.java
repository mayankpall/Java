package com.bridgelabz.generics;

import java.util.ArrayList;
import java.util.List;


abstract class WarehouseItem {
    String name;
    String category;
    int itemId;

    WarehouseItem(String category, String name, int itemId) {
        this.category = category;
        this.name = name;
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [Category: " + category + ", Name: " + name + ", Item ID: " + itemId + "]";
    }
}


class Electronics extends WarehouseItem {
    Electronics(String category, String name, int itemId) {
        super(category, name, itemId);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String category, String name, int itemId) {
        super(category, name, itemId);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String category, String name, int itemId) {
        super(category, name, itemId);
    }
}


class Storage<T extends WarehouseItem> {
    private List<T> list = new ArrayList<>();

    public void addItem(T item) {
        list.add(item);
    }

    public void removeItem(T item) {
        list.remove(item);
    }

    public List<T> getItems() {
        return list;
    }

    public void displayItems() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}


class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

// Main Class for Testing
public class WarehouseManagement {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Electronics", "Laptop", 101));
        electronicsStorage.addItem(new Electronics("Electronics", "Smartphone", 102));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Groceries", "Apple", 201));
        groceriesStorage.addItem(new Groceries("Groceries", "Milk", 202));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Furniture", "Sofa", 301));
        furnitureStorage.addItem(new Furniture("Furniture", "Table", 302));


        System.out.println("Electronics Storage:");
        electronicsStorage.displayItems();

        System.out.println("\n Groceries Storage:");
        groceriesStorage.displayItems();

        System.out.println("\n Furniture Storage:");
        furnitureStorage.displayItems();


        System.out.println("\n Displaying All Items Using Wildcard Method:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());
        WarehouseUtils.displayItems(groceriesStorage.getItems());
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
