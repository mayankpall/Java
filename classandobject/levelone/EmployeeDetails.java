package com.bridgelabz.classandobject.levelone;

import java.util.Scanner;

class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}



public class EmployeeDetails {

    private static Employee getEmployeeDetails(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = input.nextDouble();

        input.close();

        return new Employee(name, id, salary);
    }

    public static void main(String[] args){
        Employee employee = getEmployeeDetails();
        employee.displayDetails();
    }
}
