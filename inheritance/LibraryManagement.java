package com.bridgelabz.inheritance;

import java.time.Year;

// Superclass Book
class Book {
    private String title;
    private Year publicationYear;

    public Book(String title, Year publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, Year publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}


public class LibraryManagement {
    public static void main(String[] args) {
        // Book instance
        Book book = new Book("Story of My Life", Year.of(2029));
        book.displayInfo();

        // Author instance
        Book authorBook = new Author("Story of My Life", Year.of(2029), "Mayank", "Bestselling Author");
        authorBook.displayInfo();
    }
}
