package com.bridgelabz.generics;

import java.util.ArrayList;
import java.util.List;


abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getCategory();
}


class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Books";
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }
}

class Gadget extends Product {
    public Gadget(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Gadgets";
    }
}


class ProductCatalog<T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public void showCatalog() {
        for (T product : products) {
            System.out.println(product.getCategory() + " - " + product.getName() + ": " + product.getPrice());
        }
    }


    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}

public class OnlineMarketplace {
    public static void main(String[] args) {

        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();


        Book book1 = new Book("Java Programming", 50);
        Clothing clothing1 = new Clothing("T-Shirt", 20);
        Gadget gadget1 = new Gadget("Smartwatch", 100);

        bookCatalog.addProduct(book1);
        clothingCatalog.addProduct(clothing1);
        gadgetCatalog.addProduct(gadget1);


        ProductCatalog.applyDiscount(book1, 10);
        ProductCatalog.applyDiscount(clothing1, 5);
        ProductCatalog.applyDiscount(gadget1, 15);


        System.out.println("Book Catalog:");
        bookCatalog.showCatalog();

        System.out.println("\nClothing Catalog:");
        clothingCatalog.showCatalog();

        System.out.println("\nGadget Catalog:");
        gadgetCatalog.showCatalog();
    }
}
