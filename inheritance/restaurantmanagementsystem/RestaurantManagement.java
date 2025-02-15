package com.bridgelabz.inheritance.restaurantmanagementsystem;

// Superclass Person
class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Worker Interface
interface Worker {

    void performDuties();
}

// Subclass Chef
class Chef extends Person implements Worker {
    private String restaurantName;

    public Chef(String name, int id, String restaurantName) {
        super(name, id);
        this.restaurantName = restaurantName;
    }

    @Override
    public void performDuties() {
        System.out.println("Prepares delicious dishes.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Works at: " + restaurantName);
    }
}

// Subclass Waiter (Inherits Person, Implements Worker)
class Waiter extends Person implements Worker {
    private String restaurantName;

    public Waiter(String name, int id, String restaurantName) {
        super(name, id);
        this.restaurantName = restaurantName;
    }

    @Override
    public void performDuties() {
        System.out.println(" Attends guests and serves food.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Waiter Works at: " + restaurantName);
    }
}

// Main class
public class RestaurantManagement {
    public static void main(String[] args) {
        // Creating Chef and Waiter objects
        Worker chef = new Chef("John", 101, "Srm");
        Worker waiter = new Waiter("Sam", 202, "Bits");


        ((Person) chef).displayDetails();
        chef.performDuties();

        ((Person) waiter).displayDetails();
        waiter.performDuties();

        Chef ch1 = new Chef("joo", 223, "Tata");
        ch1.displayDetails();
    }
}
