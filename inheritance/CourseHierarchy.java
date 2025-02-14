package com.bridgelabz.inheritance;

// Base class Course
class Course {
    private String courseName;
    private double duration;

    public Course(String courseName, double duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("\nCourse Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}


class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, double duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private int fee;
    private double discount;

    public PaidOnlineCourse(String courseName, double duration, String platform, boolean isRecorded, int fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price:" + calculateFinalPrice());
    }

    private double calculateFinalPrice() {
        return fee - (fee * (discount / 100));
    }
}


public class CourseHierarchy {
    public static void main(String[] args) {

        Course basicCourse = new Course("Introduction to Java", 20);
        basicCourse.displayDetails();

        OnlineCourse onlineCourse = new OnlineCourse("Java Web Development", 30, "Udemy", true);
        onlineCourse.displayDetails();


        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 40, "Coursera", true, 500, 10);
        paidCourse.displayDetails();
    }
}
