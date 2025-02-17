package com.bridgelabz.encapsulationandpolymorphism;

import java.util.ArrayList;
import java.util.List;

// Abstract Class: Vehicle
abstract class Vehicle {
    private int vehicleNumber;
    private String type;
    private int rentalRate;

    Vehicle(int vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    void displayDetails() {
        System.out.println("\nVehicle Details:");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate + " per day");
    }

    abstract double calculateRentalCost(int days);
}

// Interface: Insurable
interface Insurable {
    void calculateInsurance();
    void getInsuranceDetails();
}

// Subclass: Car
class Car extends Vehicle implements Insurable {
    private final double DISCOUNT = 0.1;
    private int insurancePolicyNumber;

    Car(int vehicleNumber, int rentalRate, int insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        double totalCost = getRentalRate() * days;
        if (days > 5) {
            totalCost -= totalCost * DISCOUNT; // Apply discount
        }
        return totalCost;
    }

    @Override
    public void calculateInsurance() {
        System.out.println("Car Insurance Cost: " + (getRentalRate() * 0.05));
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
    }
}

// Subclass: Bike no insurance
class Bike extends Vehicle {
    Bike(int vehicleNumber, int rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}

// Subclass: Truck
class Truck extends Vehicle implements Insurable {
    private final double EXTRA_FEE = 50;
    private int insurancePolicyNumber;

    Truck(int vehicleNumber, int rentalRate, int insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return (getRentalRate() * days) + EXTRA_FEE;
    }

    @Override
    public void calculateInsurance() {
        System.out.println("Truck Insurance Cost: " + (getRentalRate() * 0.07));
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
    }
}

// Main Class: VehicleRentalSystem
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(101, 100, 5001));
        vehicles.add(new Bike(102, 50));
        vehicles.add(new Truck(103, 200, 7002));

        int rentalDays = 3;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle; // Explicit casting
                insurableVehicle.calculateInsurance();
                insurableVehicle.getInsuranceDetails();
            }

        }
    }
}
