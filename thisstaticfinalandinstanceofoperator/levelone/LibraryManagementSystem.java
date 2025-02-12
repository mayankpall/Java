package com.bridgelabz.thisstaticfinalandinstanceofoperator.levelone;

class Book {
    public static String libraryName = "SRM Library";
    private final int isbn;
    private String title;
    private String author;


    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }


    public static void displayLibraryName() {
        System.out.println("\nLibrary Name: " + libraryName);
    }

    // Method to display book details (only if it's an instance of Book)
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("\nBook Details:");
            System.out.println("Library Name: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        } else {
            System.out.println("Invalid Book Object.");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book.displayLibraryName();


        Book book1 = new Book(1001, "The Alchemist", "Paulo Coelho");
        Book book2 = new Book(1002, "Atomic Habits", "James Clear");


        book1.displayDetails();
        book2.displayDetails();

        // Checking instanceof before displaying details
        System.out.println("book1 an instance of Book? " + (book1 instanceof Book));
        System.out.println("book2 an instance of Book? " + (book2 instanceof Book));
    }
}
