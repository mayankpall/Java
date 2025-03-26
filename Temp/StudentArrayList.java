package com.bridgelabz.Temp;

import java.security.PrivateKey;
import java.util.ArrayList;

class Student {
    private int studentId;
    private String studentName;
    private int marks ;

    Student(int studentId, String studentName, int marks){
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



}

public class StudentArrayList {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Mayank",12);
        Student s2 = new Student(1, "Vibhor",12);
        Student s3 = new Student(1, "Arnav",12);
        Student s4 = new Student(1, "Kanika",12);
        Student s5 = new Student(1, "Shreyas",12);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);



        arrayList.forEach(student -> System.out.println(student.getStudentName() +" "+ student.getStudentId()+" " + student.getMarks()) );

    }
}
