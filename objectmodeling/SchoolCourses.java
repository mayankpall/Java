package com.bridgelabz.objectmodeling;

import java.util.ArrayList;
import java.util.List;

// School class (Aggregation - HAS Students)
class School {
    private String schoolName;
    private List<Student> students; // Aggregation (School HAS Students)

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("\nStudents in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getStudentName());
        }
    }
}

// Student class (Association - HAS Courses)
class Student {
    private String studentName;
    private List<Course> courses; // Association (Student HAS Courses)

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Ensuring Many-to-Many relationship
    }

    public void showCourses() {
        System.out.println("\nCourses enrolled by " + studentName + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public String getStudentName() {
        return studentName;
    }
}

// Course class (Association - HAS Students)
class Course {
    private String courseName;
    private List<Student> students; // Association (Course HAS Students)

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getStudentName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

public class SchoolCourses {
    public static void main(String[] args) {
        // Creating School
        School srmSchool = new School("SRM School");

        // Creating Students
        Student mayank = new Student("Mayank");
        Student arnav = new Student("Arnav");

        // Creating Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enrolling Students in Courses
        mayank.enrollCourse(math);
        mayank.enrollCourse(science);
        arnav.enrollCourse(science);

        // Adding Students to School
        srmSchool.addStudent(mayank);
        srmSchool.addStudent(arnav);

        // Displaying Data
        srmSchool.showStudents();
        mayank.showCourses();
        arnav.showCourses();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
