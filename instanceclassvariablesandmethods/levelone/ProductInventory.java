package com.bridgelabz.instanceclassvariablesandmethods.levelone;


class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; // Shared among all instances

    // Constructor to initialize product details and increment total count
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }


    public static void displayTotalProducts() {
        System.out.println("\nTotal Products Created: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 89999);
        Product product2 = new Product("Smartphone", 49999);
        Product product3 = new Product("Tablet", 29999);


        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();


        Product.displayTotalProducts();
    }
}
