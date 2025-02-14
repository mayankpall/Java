package com.bridgelabz.inheritance;

// Superclass Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
    }

    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

// Subclass Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        super.displayDetails();
        System.out.println("Role: Teacher");
        System.out.println("Teaches: " + subject);
    }
}

// Subclass Student
class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass Staff
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        super.displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}


public class SchoolRoles {
    public static void main(String[] args) {
        // Creating Teacher object
        Person teacher = new Teacher("Mr. Mayank", 22, "Mathematics");
        teacher.displayRole();

        // Creating Student object
        Person student = new Student("Arnav", 22, "10th Grade");
        student.displayRole();

        // Creating Staff object
        Person staff = new Staff("Vibhor", 22, "Administration");
        staff.displayRole();
    }
}
