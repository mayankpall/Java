package com.bridgelabz.dsa.linkedlist.problems;

class Student {
    // Roll Number, Name, Age, and Grade
    public int rollNumber;
    public String name;
    public int age;
    public String grade;

    Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayDetailsOfStudent() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

class StudentNode {
    Student data;
    StudentNode next;

    StudentNode(Student data) {
        this.data = data;
        this.next = null;
    }
}

public class StudentRecordManagement {
    private StudentNode head;

    public void addAtBeginning(Student data) {
        StudentNode newNode = new StudentNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(Student data) {
        StudentNode newNode = new StudentNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addAtSpecific(int position, Student data) {
        if (position < 1) {
            System.out.println("Invalid Index");
            return;
        }
        if (position == 1) {
            addAtBeginning(data);
            return;
        }
        StudentNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid Index, Enter under limit");
            return;
        }
        StudentNode newNode = new StudentNode(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        // If the head node is to be deleted
        if (head.data.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Successfully deleted....");
            return;
        }
        StudentNode current = head;
        while (current.next != null) {
            if (current.next.data.rollNumber == rollNumber) {
                current.next = current.next.next;
                System.out.println("Successfully deleted....");
                return;
            }
            current = current.next;
        }
        System.out.println("Invalid Roll Number");
    }

    public void displayStudentRecord(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        StudentNode current = head;
        while (current != null) {
            if (current.data.rollNumber == rollNumber) {
                current.data.displayDetailsOfStudent();
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    public void displayAllRecords() {
        StudentNode current = head;
        while (current != null) {
            current.data.displayDetailsOfStudent();
            current = current.next;
        }
    }

    public void updateGradeByRollNumber(int rollNumber, String newGrade) {
        StudentNode current = head;
        while (current != null) {
            if (current.data.rollNumber == rollNumber) {
                current.data.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            current = current.next;
        }
        System.out.println("Invalid Roll Number");
    }

    public static void main(String[] args) {
        Student s1 = new Student(214, "Mayank", 22, "A");
        Student s2 = new Student(003, "Arnav", 22, "A");
        Student s3 = new Student(004, "Vibhor", 22, "A");

        StudentRecordManagement studentNode = new StudentRecordManagement();

        studentNode.addAtBeginning(s1);
        studentNode.addAtEnd(s2);
        studentNode.addAtEnd(s3);

        studentNode.displayAllRecords();


        studentNode.deleteByRollNumber(003);
        studentNode.updateGradeByRollNumber(214, "A+");
        studentNode.displayAllRecords();
    }
}