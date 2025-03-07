package com.bridgelabz.generics;


import java.util.ArrayList;
import java.util.List;


abstract class CourseType {
    private String courseName;
    private String department;

    public CourseType(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    public abstract String getEvaluationMethod();
}


class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public String getEvaluationMethod() {
        return "Exam-Based Evaluation";
    }
}


class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based Evaluation";
    }
}


class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public String getEvaluationMethod() {
        return "Research-Based Evaluation";
    }
}


class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (T course : courses) {
            System.out.println(course.getDepartment() + " - " + course.getCourseName() + " (" + course.getEvaluationMethod() + ")");
        }
    }
}


class University {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getDepartment() + " - " + course.getCourseName() + " (" + course.getEvaluationMethod() + ")");
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Course<ExamCourse> examCourseCatalog = new Course<>();
        Course<AssignmentCourse> assignmentCourseCatalog = new Course<>();
        Course<ResearchCourse> researchCourseCatalog = new Course<>();


        ExamCourse examCourse1 = new ExamCourse("Data Structures", "Computer Science");
        AssignmentCourse assignmentCourse1 = new AssignmentCourse("Software Engineering", "Information Technology");
        ResearchCourse researchCourse1 = new ResearchCourse("Artificial Intelligence", "Computer Science");

        examCourseCatalog.addCourse(examCourse1);
        assignmentCourseCatalog.addCourse(assignmentCourse1);
        researchCourseCatalog.addCourse(researchCourse1);


        System.out.println("Exam Courses:");
        examCourseCatalog.displayCourses();

        System.out.println("\nAssignment Courses:");
        assignmentCourseCatalog.displayCourses();

        System.out.println("\nResearch Courses:");
        researchCourseCatalog.displayCourses();


        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(examCourse1);
        allCourses.add(assignmentCourse1);
        allCourses.add(researchCourse1);

        System.out.println("\nAll Courses:");
        University.displayAllCourses(allCourses);
    }
}
