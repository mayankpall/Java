package com.bridgelabz.classandobject.leveltwo;

import java.util.Scanner;

class Student {
    private String name;
    private String rollNumber;
    private double marks;

    public Student(String name, String rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = getStudentDetails(input);
        student.displayDetails();
        input.close();
    }

    private static Student getStudentDetails(Scanner input) {
        System.out.println("Enter Student Details");

        System.out.print("Enter Student Name: ");
        String name = input.next();

        System.out.print("Enter Student Roll Number: ");
        String rollNumber = input.next();

        System.out.print("Enter Student Marks: ");
        double marks = input.nextDouble();

        return new Student(name, rollNumber, marks);
    }
}
