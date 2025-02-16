package com.bridgelabz.encapsulationandpolymorphism;

abstract class Vehicle{
    //vehicleNumber, type, and rentalRate.
    private int vehicleNumber;
    private String type;
    private int rentalRate;

    Vehicle(int vehicleNumber, String type, int rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    void displayDetails(){
        System.out.println("Vehicle Details :");
        System.out.println("Vehicle number : "+ vehicleNumber);
        System.out.println("Vehicle type: " + type);
        System.out.println("Rental Rate : "+ rentalRate);
    }

    abstract double calculateRentalCost(int days);

}




public class VehicleRentalSystem {
}
