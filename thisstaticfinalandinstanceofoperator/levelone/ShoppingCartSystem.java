package com.bridgelabz.thisstaticfinalandinstanceofoperator.levelone;

class Product {
    private static double discount = 15.00; // Shared discount

    private String productName;
    private double price;
    private int quantity;
    private final int productId; // Immutable ID

    public Product(String productName, double price, int quantity, int productId) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double discount) {
        Product.discount = discount;
    }

    public void displayDetails() {
        if (this instanceof Product) { // Type check
            System.out.println("\nProduct Details:");
            System.out.println("ID: " + productId);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid Product");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product iteam1 = new Product("Laptop", 1200.00, 2, 101);
        Product iteam2 = new Product("Smartphone", 800.00, 1, 102);

        iteam1.displayDetails();
        iteam2.displayDetails();

        Product.updateDiscount(20.00); // New discount

        System.out.println("\nAfter Discount Update:");
        iteam1.displayDetails();
        iteam2.displayDetails();
    }
}
