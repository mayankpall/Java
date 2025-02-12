package com.bridgelabz.thisstaticfinalandinstanceofoperator.levelone;


class Patient {
    private static String hospitalName = "SRM Hospital"; // Shared hospital name
    private static int totalPatients = 0; // Patient count

    private String name;
    private int age;
    private String ailment;
    private final String patientID;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increment count
    }

    public static void getTotalPatients() {
        System.out.println("\nTotal Patients: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) { // Type check
            System.out.println("\nPatient Details:");
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("Invalid Patient");
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient person1 = new Patient("Mayank", 22, "Fever", "P101");
        Patient person2 = new Patient("Arnav", 22, "Flu", "P102");

        person1.displayDetails();
        person2.displayDetails();

        Patient.getTotalPatients(); // Class method

        System.out.println("\nIs Mayank a Patient? " + (person1 instanceof Patient));
        System.out.println("Is Arnav a Patient? " + (person2 instanceof Patient));
    }
}
