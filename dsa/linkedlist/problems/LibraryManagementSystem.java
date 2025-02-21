package com.bridgelabz.dsa.linkedlist.problems;


class Book{
    // Book Title, Author, Genre, Book ID, and Availability Status.
    String title;
    String author;
    int id;
    boolean status;

    Book(String title, String author, int id, boolean status){
        this.title = title;
        this.author = author;
        this.id = id;
        this.status = status;
    }

    public void displayDetails(){
        System.out.println("\n--Book details--");
        System.out.println("Title of book : "+ title);
        System.out.println("Author of the book :" + author);
        System.out.println("Status : " + ((status) ? "available": "Not available"));
    }

}

class BookNode{
    Book book;
    BookNode next;
    BookNode prev;

    BookNode(Book book){
        this.book = book;
        this.next = null;
        this.prev = null;
    }
}




public class LibraryManagementSystem {
    private BookNode head;
    private BookNode tail;



    public void addAtBeginning(Book book){

        BookNode newBook = new BookNode(book);

        if(head == null){
            head = tail = newBook;
            return;
        }
        else{
            head.prev = newBook;
            newBook.next = head;
            head = newBook;
        }
    }

    public void addAtEnd(Book book){

        BookNode newBook = new BookNode(book);

        if(head == null){
            head = tail = newBook;
            return;
        }
        else{
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }

    }

    public void addAtSpecific(int position , Book book){
        BookNode newBook = new BookNode(book);

        if(position <= 0){
            System.out.println("Invalid position");
            return;
        }

        if(position == 1){
            addAtBeginning(book);
            return;
        }

        BookNode current = head;

        for(int i = 1; i < position - 1 && current != null ; i++){
            current = current.next;
        }

        if(current == null){
            System.out.println("Plz enter correct position");
            return;
        }

        if(current == tail){
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
            tail.next = null;
        }
        else {
             newBook.next = current.next;
             current.next.prev = newBook;
             newBook.prev = current;
             current.next = newBook;

        }

    }

    public void removeBook(int id){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if (head.book.id == id) {
            head = head.next;
            if (head != null) head.prev = null;
            System.out.println("Book with ID " + id + " removed.");
            return;
        }

        BookNode current = head;


        while (current != null){
            if(current.next.book.id == id){
                break;
            }
            current = current.next;
        }

        if(current == null){
            System.out.println("No id was found");
            return;
        }

        if(current.next == tail){
            current.next.prev = null;
            current.next = null;
            tail = current;
        }
        else {
            current.next.next.prev =  current;
            current.next = current.next.next;

        }

    }

    public void updateAvailability(int id, boolean status) {
        BookNode current = head;
        while (current != null) {
            if (current.book.id == id) {
                current.book.status = status;
                System.out.println("Book ID " + id + " status updated to: " + (status ? "Available" : "Not Available"));
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("\nBooks in Library (Forward Order):");
        BookNode current = head;
        while (current != null) {
            current.book.displayDetails();
            current = current.next;
        }
    }


    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("\nBooks in Library (Reverse Order):");
        BookNode current = tail;
        while (current != null) {
            current.book.displayDetails();
            current = current.prev;
        }
    }
    public void searchBook(String query) {
        BookNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.book.title.equalsIgnoreCase(query) || current.book.author.equalsIgnoreCase(query)) {
                current.book.displayDetails();
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No book found with title/author: " + query);
    }


    public int countBooks() {
        int count = 0;
        BookNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("\nTotal Books in Library: " + count);
        return count;
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();


        library.addAtEnd(new Book("Harry Potter", "J.K", 101, true));
        library.addAtEnd(new Book("The Hobbit", "Tolkien", 102, true));
        library.addAtBeginning(new Book("1984", " Orwell", 103, true));


        library.displayForward();
        library.displayReverse();


        library.searchBook("Harry Potter");
        library.searchBook("J.K.");


        library.updateAvailability(101, false);


        library.removeBook(102);


        library.displayForward();


        library.countBooks();
    }






}
