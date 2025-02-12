package com.bridgelabz.classandobject.levelone;

import java.util.Scanner;

class Book{

    private String title ;
    private String author;
    private int price;

    Book(String title, String author, int price){
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public void displayDetails(){
        System.out.println("Book Details");
        System.out.println("Title of book : "+ title);
        System.out.println("Author of book : "+ author);
        System.out.println("Price of book : "+ price);
    }
}


public class BookDetails {
    public static Book getBookDetails() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = input.nextLine();

        System.out.print("Enter author name: ");
        String author = input.nextLine();

        System.out.print("Enter book price: ");
        int price = input.nextInt();

        input.close();

        return new Book(title, author, price);
    }

    public static void main(String[] args) {
        Book newBook = getBookDetails();
        newBook.displayDetails();
    }
}
