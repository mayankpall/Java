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
        this.students.add(student);
    }

    public void showStudents() {
        System.out.println("\nStudents in " + schoolName + ":");
        for (Student student : this.students) {
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
        this.courses.add(course);
        course.addStudent(this); // Ensuring Many-to-Many relationship
    }

    public void showCourses() {
        System.out.println("\nCourses enrolled by " + studentName + ":");
        for (Course course : this.courses) {
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
        this.students.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : this.students) {
            System.out.println("- " + student.getStudentName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Main class to run the system
public class SchoolCourses {
    public static void main(String[] args) {
        // Creating School
        School srmSchool = new School("SRM School");

        // Creating Students
        Student student1 = new Student("Student A");
        Student student2 = new Student("Student B");

        // Creating Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enrolling Students in Courses
        student1.enrollCourse(math);
        student1.enrollCourse(science);
        student2.enrollCourse(science);

        // Adding Students to School
        srmSchool.addStudent(student1);
        srmSchool.addStudent(student2);

        // Displaying Data
        srmSchool.showStudents();
        student1.showCourses();
        student2.showCourses();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
