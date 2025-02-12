package com.bridgelabz.thisstaticfinalandinstanceofoperator.levelone;

class Vehicle {
    private static double registrationFee = 90.00;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) { // Type check
            System.out.println("\nVehicle Registration Details:");
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle person1 = new Vehicle("Mayank", "Car", "MH1234");
        Vehicle person2 = new Vehicle("Arnav", "Bike", "DL5678");

        person1.displayDetails();
        person2.displayDetails();

        Vehicle.updateRegistrationFee(120.00); // New fee

        System.out.println("\nAfter Fee Update:");
        person1.displayDetails();
        person2.displayDetails();
    }
}
