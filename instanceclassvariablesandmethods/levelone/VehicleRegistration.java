package com.bridgelabz.instanceclassvariablesandmethods.levelone;

class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.00; // Common for all vehicles


    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }


    public void displayVehicleDetails() {
        System.out.println("\nVehicle Details:");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    //  update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("\nRegistration fee updated to: $" + registrationFee);
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice Johnson", "Car");
        Vehicle vehicle2 = new Vehicle("Bob Smith", "Motorcycle");


        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Updating registration fee
        Vehicle.updateRegistrationFee(150.00);


        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}

