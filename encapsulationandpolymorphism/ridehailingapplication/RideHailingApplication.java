package com.bridgelabz.encapsulationandpolymorphism.ridehailingapplication;


interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract Class: Vehicle
abstract class Vehicle implements GPS {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    Vehicle(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    abstract double calculateFare(double distance);
    void getVehicleDetails() {
        System.out.println("\n Vehicle Details:");
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println(" Location updated to: " + newLocation);
    }
}

// Subclass: Car
class Car extends Vehicle {
    private static final double CAR_RATE = 12;

    Car(int vehicleId, String driverName, String currentLocation) {
        super(vehicleId, driverName, CAR_RATE, currentLocation);
    }

    @Override
    double calculateFare(double distance) {
        return distance * CAR_RATE;
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    private static final double BIKE_RATE = 6;

    Bike(int vehicleId, String driverName, String currentLocation) {
        super(vehicleId, driverName, BIKE_RATE, currentLocation);
    }

    @Override
    double calculateFare(double distance) {
        return distance * BIKE_RATE;
    }
}

// Subclass: Auto
class Auto extends Vehicle {
    private static final double AUTO_RATE = 8;

    Auto(int vehicleId, String driverName, String currentLocation) {
        super(vehicleId, driverName, AUTO_RATE, currentLocation);
    }

    @Override
    double calculateFare(double distance) {
        return distance * AUTO_RATE;
    }
}

// Main Class: RideHailingApplication
public class RideHailingApplication {
    public static void main(String[] args) {

        Vehicle car = new Car(101, "Arnav", "Sector 18");
        Vehicle bike = new Bike(102, "Mayank", "MG Road");
        Vehicle auto = new Auto(103, "Rohit", "Rajiv Chowk");


        Vehicle[] vehicles = {car, bike, auto};


        double rideDistance = 10;
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + rideDistance + " km: " + vehicle.calculateFare(rideDistance));
            vehicle.updateLocation("Drop Location chennai ");
        }
    }
}
