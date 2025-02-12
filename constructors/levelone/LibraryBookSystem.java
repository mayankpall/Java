package com.bridgelabz.constructors.levelone;


class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized Constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    //  borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed " + title );
        } else {
            System.out.println("Sorry, " + title + " is not available.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("\nBookOne Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 299, true);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 199, false);

        // Displaying details
        book1.displayDetails();
        book2.displayDetails();

        // Borrowing books
        book1.borrowBook();
        book2.borrowBook();

        // Displaying details after borrowing
        book1.displayDetails();
        book2.displayDetails();
    }
}
