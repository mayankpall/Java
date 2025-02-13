package com.bridgelabz.objectmodeling.UniversityMangementSystem;



import java.util.ArrayList;
import java.util.List;



// Student class (Association: Students enroll in multiple Courses)
class Students {
    private String studentName;
    private List<Courses> enrolledCours; // Many-to-Many Association

    public Students(String studentName) {
        this.studentName = studentName;
        this.enrolledCours = new ArrayList<>();
    }

    public void enrollCourse(Courses courses) {
        enrolledCours.add(courses);
        courses.addStudent(this); // Ensuring bidirectional relationship
    }

    public void showEnrolledCourses() {
        System.out.println("\nCourses enrolled by " + studentName + ":");
        for (Courses courses : enrolledCours) {
            System.out.println("- " + courses.getCourseName());
        }
    }

    public String getStudentName() {
        return studentName;
    }
}

// Professor class (Association: Professors teach multiple Courses)
class Professor {
    private String professorName;
    private List<Courses> assignedCours; // Many-to-Many Association

    public Professor(String professorName) {
        this.professorName = professorName;
        this.assignedCours = new ArrayList<>();
    }

    public void assignCourse(Courses courses) {
        assignedCours.add(courses);
        courses.assignProfessor(this); // Ensuring bidirectional relationship
    }

    public void showAssignedCourses() {
        System.out.println("\nCourses taught by " + professorName + ":");
        for (Courses courses : assignedCours) {
            System.out.println("- " + courses.getCourseName());
        }
    }

    public String getProfessorName() {
        return professorName;
    }
}

// Course class (Aggregation: A Course has Students and Professors)
class Courses {
    private String courseName;
    private List<Students> students;
    private List<Professor> professors;

    public Courses(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addStudent(Students students) {
        this.students.add(students);
    }

    public void assignProfessor(Professor professor) {
        professors.add(professor);
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);

        System.out.println("Enrolled Students:");
        for (Students students : this.students) {
            System.out.println("- " + students.getStudentName());
        }

        System.out.println("Assigned Professors:");
        for (Professor professor : professors) {
            System.out.println("- " + professor.getProfessorName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Main class to test the system
public class UniversityMangementSystem {
    public static void main(String[] args) {
        // Creating Students
        Students students1 = new Students("Student A");
        Students students2 = new Students("Student B");

        // Creating Professors
        Professor professor1 = new Professor("Prof. X");
        Professor professor2 = new Professor("Prof. Y");

        // Creating Courses
        Courses courses1 = new Courses("Computer Science");
        Courses courses2 = new Courses("Mathematics");

        // Enrolling Students in Courses
        students1.enrollCourse(courses1);
        students1.enrollCourse(courses2);
        students2.enrollCourse(courses1);

        // Assigning Professors to Courses
        professor1.assignCourse(courses1);
        professor2.assignCourse(courses2);

        // Display Course Details
        courses1.showCourseDetails();
        courses2.showCourseDetails();

        // Display Student and Professor Associations
        students1.showEnrolledCourses();
        students2.showEnrolledCourses();
        professor1.showAssignedCourses();
        professor2.showAssignedCourses();
    }
}
