package com.bridgelabz.accessmodifiers.levelone;

class Employee {
    public String employeeID;
    protected String department;
    private double salary;


    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }


    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }


    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass demonstrating protected and public access
class Manager extends Employee {
    private String team;


    public Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team: " + team);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {

        Employee emp1 = new Employee("101", "IT", 50000);
        emp1.displayDetails();

        // Modifying salary
        emp1.setSalary(55000);
        System.out.println("\nUpdated Salary: " + emp1.getSalary());

        // Creating a Manager
        Manager mgr = new Manager("M202", "HR", 70000, "Recruitment Team");
        mgr.displayDetails();
    }
}
