package com.bridgelabz.accessmodifiers.levelone;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter
    public String getAuthor() {
        return author;
    }


    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass demonstrating protected and public access
class Ebook extends Book {
    public String platform;

    // Constructor for Ebook
    public Ebook(String ISBN, String title, String author, String platform) {
        super(ISBN, title, author);
        this.platform = platform;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book bookOne = new Book("123B", "Story of My Life", "Mayank Pal");
        bookOne.displayDetails();


        bookOne.setAuthor("Mayank Kumar pal");
        System.out.println("\nUpdated Author: " + bookOne.getAuthor());


        Ebook bookTwo = new Ebook("111", "Think Different", "Elon Musk", "Kindle");
        bookTwo.displayDetails();
    }
}
