package com.bridgelabz.encapsulationandpolymorphism;

import java.util.ArrayList;
import java.util.List;

// Abstract Class: LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("\n Item Details:");
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Interface: Reservable
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Subclass: Book
class Book extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 14;
    private boolean isAvailable = true;

    Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return LOAN_DURATION;
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(" Book reserved successfully.");
        } else {
            System.out.println(" Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Subclass: Magazine
class Magazine extends LibraryItem {
    private static final int LOAN_DURATION = 7;

    Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return LOAN_DURATION;
    }
}

// Subclass: DVD
class DVD extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 5;
    private boolean isAvailable = true;

    DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return LOAN_DURATION;
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(" DVD reserved successfully.");
        } else {
            System.out.println(" DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryItem book = new Book("B001", "Java Programming", "James Gosling");
        LibraryItem magazine = new Magazine("M001", "Tech Monthly", "John Doe");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");


        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);


        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }




        if (dvd instanceof Reservable) {
            Reservable reservableDVD = (Reservable) dvd;
            reservableDVD.reserveItem();
            System.out.println("DVD Available? " + reservableDVD.checkAvailability());
        }
    }
}
