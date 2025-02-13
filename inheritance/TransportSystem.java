package com.bridgelabz.inheritance;

// Superclass Vehicle
class Vehicle {
    private int maxSpeed;
    private String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("\nVehicle Info:");
        System.out.println("Max Speed: " + maxSpeed );
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class
public class TransportSystem {
    public static void main(String[] args) {

        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10.5);
        Vehicle motorcycle = new Motorcycle(140, "Petrol", false);


        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
    }
}
