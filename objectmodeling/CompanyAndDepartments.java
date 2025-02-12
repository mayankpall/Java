package com.bridgelabz.objectmodeling;

import java.util.ArrayList;

import java.util.List;

// Employee class (Exists only within a Department)
class Employee {
    private String name;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + ", Designation: " + designation);
    }
}

// Department class (Exists only within a Company)
class Department {
    private String departmentName;
    private List<Employee> employees; // Composition (Department HAS Employees)

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String designation) {
        employees.add(new Employee(name, designation)); // Creating Employee inside Department
    }

    public void showEmployees() {
        System.out.println("\nEmployees in " + departmentName + " Department:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}

// Company class (Owns Departments and Employees - Composition)
class Company {
    private String companyName;
    private List<Department> departments; // Composition (Company HAS Departments)

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showCompanyDetails() {
        System.out.println("\nCompany: " + companyName);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Creating a Company
        Company techCorp = new Company("TechCorp");

        // Creating Departments
        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        // Adding Employees to Departments
        itDept.addEmployee("Mayank", "Software Engineer");
        itDept.addEmployee("Arnav", "System Analyst");

        hrDept.addEmployee("Sonia", "HR Manager");
        hrDept.addEmployee("Ravi", "Recruiter");


        techCorp.addDepartment(itDept);
        techCorp.addDepartment(hrDept);


        techCorp.showCompanyDetails();


    }
}
