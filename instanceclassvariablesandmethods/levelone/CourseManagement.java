package com.bridgelabz.instanceclassvariablesandmethods.levelone;


class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Bridgelabz Institute"; // Common for all courses


    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("\nCourse Details:");
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("\nInstitute name updated to: " + instituteName);
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Full Stack", 6, 79999);
        Course course2 = new Course("Data Science", 8, 99999);

        // Displaying initial course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Updating the institute name for all courses
        Course.updateInstituteName("SRM Academy");

        // Displaying course details after updating institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
