//package com.bridgelabz.objectmodeling;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//// Patient class (Association: Patient HAS multiple Doctors)
//class Patient {
//    private String patientName;
//    private List<Doctor> doctors; // Many-to-Many Association
//
//    public Patient(String patientName) {
//        this.patientName = patientName;
//        this.doctors = new ArrayList<>();
//    }
//
//    public void addDoctor(Doctor doctor) {
//        doctors.add(doctor);
//        doctor.addPatient(this); // Ensuring Many-to-Many Relationship
//    }
//
//    public void showDoctors() {
//        System.out.println("\nDoctors treating " + patientName + ":");
//        for (Doctor doctor : doctors) {
//            System.out.println("- " + doctor.getDoctorName());
//        }
//    }
//
//    public String getPatientName() {
//        return patientName;
//    }
//}
//
//// Doctor class (Association: Doctor HAS multiple Patients)
//class Doctor {
//    private String doctorName;
//    private List<Patient> patients; // Many-to-Many Association
//
//    public Doctor(String doctorName) {
//        this.doctorName = doctorName;
//        this.patients = new ArrayList<>();
//    }
//
//    public void addPatient(Patient patient) {
//        patients.add(patient);
//    }
//
//    // Communication: Doctor interacts with Patient
//    public void consult(Patient patient) {
//        System.out.println("Dr. " + doctorName + " is consulting " + patient.getPatientName());
//    }
//
//    public void showPatients() {
//        System.out.println("\nPatients under Dr. " + doctorName + ":");
//        for (Patient patient : patients) {
//            System.out.println("- " + patient.getPatientName());
//        }
//    }
//
//    public String getDoctorName() {
//        return doctorName;
//    }
//}
//
//// Hospital class (Managing Doctors & Patients)
//class Hospital {
//    private String hospitalName;
//    private List<Doctor> doctors;
//    private List<Patient> patients;
//
//    public Hospital(String hospitalName) {
//        this.hospitalName = hospitalName;
//        this.doctors = new ArrayList<>();
//        this.patients = new ArrayList<>();
//    }
//
//    public void addDoctor(Doctor doctor) {
//        doctors.add(doctor);
//    }
//
//    public void addPatient(Patient patient) {
//        patients.add(patient);
//    }
//
//    public void showHospitalDetails() {
//        System.out.println("\nHospital: " + hospitalName);
//
//        System.out.println("\nDoctors Available:");
//        for (Doctor doctor : doctors) {
//            System.out.println("- " + doctor.getDoctorName());
//        }
//
//        System.out.println("\nPatients Registered:");
//        for (Patient patient : patients) {
//            System.out.println("- " + patient.getPatientName());
//        }
//    }
//}
//
//// Main class to run the system
//public class HospitalSystem {
//    public static void main(String[] args) {
//        // Creating Hospital
//        Hospital cityHospital = new Hospital("City Hospital");
//
//        // Creating Doctors
//        Doctor drMayank = new Doctor("Mayank");
//        Doctor drArnav = new Doctor("Arnav");
//
//        // Creating Patients
//        Patient p1 = new Patient("John");
//        Patient p2 = new Patient("Alice");
//
//        // Doctors & Patients Relationship (Many-to-Many)
//        p1.addDoctor(drMayank);
//        p1.addDoctor(drArnav);
//        p2.addDoctor(drArnav);
//
//        // Adding Doctors & Patients to Hospital
//        cityHospital.addDoctor(drMayank);
//        cityHospital.addDoctor(drArnav);
//        cityHospital.addPatient(p1);
//        cityHospital.addPatient(p2);
//
//        // Display Hospital, Doctors, and Patients
//        cityHospital.showHospitalDetails();
//        drMayank.showPatients();
//        drArnav.showPatients();
//        p1.showDoctors();
//        p2.showDoctors();
//
//        // Communication: Doctors Consulting Patients
//        drMayank.consult(p1);
//        drArnav.consult(p1);
//        drArnav.consult(p2);
//    }
//}
