package com.bridgelabz.inheritance.vehiclemanagementsystem;

// Superclass Vehicle
class Vehicle {
    private double maxSpeed;
    private String model;

    public Vehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("\nVehicle Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface for refueling vehicles
interface Refuelable {
    void refuel();
}

// Subclass ElectricVehicle (Inherits Vehicle)
class ElectricVehicle extends Vehicle {
    private double batteryCapacity;

    public ElectricVehicle(double maxSpeed, String model, double batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging electric vehicle...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass PetrolVehicle (Inherits Vehicle, Implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelCapacity;

    public PetrolVehicle(double maxSpeed, String model, double fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

// Main class to demonstrate hybrid inheritance
public class VehicleManagementSystem {
    public static void main(String[] args) {

        ElectricVehicle tesla = new ElectricVehicle(250, "Tesla ", 100);
        tesla.displayInfo();
        tesla.charge();


        PetrolVehicle ford = new PetrolVehicle(220, "Ford ", 60);
        ford.displayInfo();
        ford.refuel();
    }
}
