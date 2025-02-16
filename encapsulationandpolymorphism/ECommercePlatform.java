package com.bridgelabz.encapsulationandpolymorphism;

import java.util.ArrayList;
import java.util.List;

// Abstract Class: Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount(); // Abstract method to calculate discount

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("\nProduct ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
    }
}

// Interface: Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Concrete Class: Electronics (Implements Taxable)
class Electronics extends Product implements Taxable {
    private static final double ELECTRONICS_DISCOUNT = 0.10; // 10% Discount
    private static final double TAX_RATE = 0.18; // 18% GST

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * ELECTRONICS_DISCOUNT;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax : " + calculateTax();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getTaxDetails());
    }
}

// Concrete Class: Clothing (Implements Taxable)
class Clothing extends Product implements Taxable {
    private static final double CLOTHING_DISCOUNT = 0.15; // 15% Discount
    private static final double TAX_RATE = 0.05; // 5% VAT

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * CLOTHING_DISCOUNT;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Tax : " + calculateTax();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getTaxDetails());
    }
}

// Concrete Class: Groceries (No Tax)
class Groceries extends Product {
    private static final double GROCERY_DISCOUNT = 0.05; // 5% Discount

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * GROCERY_DISCOUNT;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tax: No tax on groceries.");
    }
}

// Main class to demonstrate polymorphism
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();


        Product laptop = new Electronics(101, "Laptop", 1000);
        Product tshirt = new Clothing(102, "T-Shirt", 50);
        Product apple = new Groceries(103, "Apple ", 5);


        products.add(laptop);
        products.add(tshirt);
        products.add(apple);


        System.out.println("\nProduct Details");
        for (Product product : products) {
            product.displayDetails();

            double tax = 0;

            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product; // Explicit cast to Taxable
                tax = taxableProduct.calculateTax();
            }

            double finalPrice = product.getPrice() + tax - product.calculateDiscount();

            System.out.println("Final Price: " + finalPrice);

        }

    }
}
