package com.bridgelabz.objectmodeling;

import java.util.ArrayList;
import java.util.List;

// University class (Composition: Owns Departments, Aggregation: Has Faculties)
class University {
    private String universityName;
    private List<Departments> departments; // Composition (University HAS Departments)
    private List<Faculty> faculties;       // Aggregation (University HAS Faculties)

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: University OWNS Departments
    public void addDepartment(String departmentName) {
        departments.add(new Departments(departmentName));
    }

    // Aggregation: University ASSOCIATES WITH Faculties (They exist independently)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showUniversityDetails() {
        System.out.println("\nUniversity: " + universityName);

        System.out.println("Departments:");
        for (Departments dept : departments) {
            dept.displayDetails();
        }

        System.out.println("\nFaculties:");
        for (Faculty faculty : faculties) {
            faculty.displayDetails();
        }
    }
}

// Departments class (Composition: Exists only within a University)
class Departments {
    private String departmentName;

    public Departments(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDetails() {
        System.out.println("Department: " + departmentName);
    }
}

// Faculty class (Aggregation: Exists Independently)
class Faculty {
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void displayDetails() {
        System.out.println("Faculty: " + facultyName);
    }
}

// Main class to run the system
public class UniversitySystem {
    public static void main(String[] args) {
        // Creating University
        University srmUniversity = new University("SRM University");

        // Adding Departments (Composition: They belong to University)
        srmUniversity.addDepartment("Computer Science");
        srmUniversity.addDepartment("Mechanical Engineering");

        // Creating Faculty (Aggregation: Faculties exist independently)
        Faculty mayank = new Faculty("Prof. Mayank");
        Faculty arnav = new Faculty("Dr. Arnav");

        // Adding Faculty to University
        srmUniversity.addFaculty(mayank);
        srmUniversity.addFaculty(arnav);

        // Display University Details
        srmUniversity.showUniversityDetails();
    }
}
