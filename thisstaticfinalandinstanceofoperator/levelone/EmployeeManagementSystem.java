package com.bridgelabz.thisstaticfinalandinstanceofoperator.levelone;

class Employee {
    private static String companyName = "SRM Tech"; // Shared variable
    private static int numberOfEmployees = 0;

    private String name;
    private final String id;
    private String designation;

    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        numberOfEmployees++; // Increment count
    }

    public static void displayTotalEmployees() {
        System.out.println("\nTotal Employees: " + numberOfEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) { // Type check
            System.out.println("\nEmployee Details:");
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid Object");
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee mayank = new Employee("Mayank", "101", "Founding Engineer");
        Employee arnav = new Employee("Arnav", "E102", "Project Manager");

        mayank.displayDetails();
        arnav.displayDetails();

        Employee.displayTotalEmployees(); // Class method

        System.out.println("\nIs Mayank an Employee? " + (mayank instanceof Employee));
        System.out.println("Is Arnav an Employee? " + (arnav instanceof Employee));
    }
}
