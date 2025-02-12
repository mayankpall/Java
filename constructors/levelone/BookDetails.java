package com.bridgelabz.constructors.levelone;

class BookOne {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public BookOne() {

    }

    // Parameterized constructor (Takes user-defined values)
    public BookOne(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("\nBookOne Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        //  using default constructor
        BookOne defaultBook = new BookOne();
        defaultBook.displayDetails();

        //  using parameterized constructor
        BookOne customBook = new BookOne("Game of life", "Mayank ", 100.00);
        customBook.displayDetails();
    }
}
