package com.bridgelabz.accessmodifiers.levelone;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor to initialize Student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }


    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String thesisTopic;

    // Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);  // Calls Student constructor
        this.thesisTopic = thesisTopic;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();  // Calls parent class method
        System.out.println("Thesis Topic: " + thesisTopic);
        System.out.println("Name (from subclass): " + name);  // Accessing 'name' protected member
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        // Creating an instance of Student
        Student student = new Student(101, "mayank", 8.5);
        student.displayDetails();

        // Modifying CGPA using public methods
        student.setCGPA(9.0);
        System.out.println("\nAfter updating CGPA:");
        student.displayDetails();


        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "mayank", 9.5, "AI");
        pgStudent.displayDetails();
    }
}
