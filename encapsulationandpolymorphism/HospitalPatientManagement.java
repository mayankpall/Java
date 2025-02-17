package com.bridgelabz.encapsulationandpolymorphism;

import java.util.ArrayList;
import java.util.List;

// Abstract Class: Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;

    Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println("\n Patient Details:");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    protected void getMedicalHistory() {
        System.out.println("Diagnosis: " + diagnosis);
    }
}

// Interface: MedicalRecord
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Subclass: InPatient
class InPatient extends Patient implements MedicalRecord {
    private static final double DAILY_CHARGE = 5000;
    private int daysAdmitted;
    private List<String> records = new ArrayList<>();

    InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    double calculateBill() {
        return daysAdmitted * DAILY_CHARGE;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String record : records) {
            System.out.println("- " + record);
        }
    }

    @Override
    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Type: In-Patient");
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Total Bill: " + calculateBill());
    }
}

// Subclass: OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private static final double CONSULTATION_FEE = 800;
    private List<String> records = new ArrayList<>();

    OutPatient(int patientId, String name, int age, String diagnosis) {
        super(patientId, name, age, diagnosis);
    }

    @Override
    double calculateBill() {
        return CONSULTATION_FEE;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String record : records) {
            System.out.println("- " + record);
        }
    }

    @Override
    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Type: Out-Patient");
        System.out.println("Consultation Fee: " + calculateBill());
    }
}

// Main Class: HospitalPatientManagement
public class HospitalPatientManagement {
    public static void main(String[] args) {

        Patient patientOne = new InPatient(101, "Arnav", 25, "Fever", 5);
        Patient patientTwo = new OutPatient(102, "Mayank", 30, "Cold");


        List<Patient> patients = new ArrayList<>();
        patients.add(patientOne);
        patients.add(patientTwo);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            if (patient instanceof MedicalRecord) {
                System.out.println(" Adding and Viewing Medical Records...");
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Blood Test Report: Normal");
                record.viewRecords();
            }
        }
    }
}
