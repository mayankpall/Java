package com.bridgelabz.objectmodeling;

import java.util.ArrayList;

// Book class (Independent Entity)
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class (Aggregates multiple books)
class Library {
    private String libraryName;
    private ArrayList<Book> books; // Aggregation

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        // Creating Books (Independent of Library)
        Book book1 = new Book("the Boys", "mayank");
        Book book2 = new Book("azylum", "jin");
        Book book3 = new Book("birds ", "Lee");

        // Creating Libraries
        Library library1 = new Library("SRM Library");
        Library library2 = new Library("University Library");

        // Adding Books to Libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);
        library2.addBook(book1); // Same book in another library


        library1.showBooks();
        library2.showBooks();
    }
}
