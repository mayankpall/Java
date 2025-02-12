package com.bridgelabz.thisstaticfinalandinstanceofoperator.levelone;

class Student {
    private static String universityName = "SRM University";
    private static int totalStudents = 0;

    private String name;
    private final String rollNumber;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment count
    }

    public static void displayTotalStudents() {
        System.out.println("\nTotal Students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) { // Type check
            System.out.println("\nStudent Details:");
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid Student");
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student mayank = new Student("Mayank", "SRM214", "O");
        Student arnav = new Student("Arnav", "SRM108", "O");

        mayank.displayDetails();
        arnav.displayDetails();

        Student.displayTotalStudents(); // Class method

        System.out.println("\nIs Mayank a Student? " + (mayank instanceof Student));
        System.out.println("Is Arnav a Student? " + (arnav instanceof Student));
    }
}
