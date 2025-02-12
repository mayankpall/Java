package com.bridgelabz.constructors.levelone;


class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;


    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard Car";
        this.rentalDays = 1;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }


    public double calculateTotalCost() {
        return rentalDays * 50;
    }

    // display rental details
    public void displayDetails() {
        System.out.println("\nCar Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {

        CarRental defaultRental = new CarRental();
        defaultRental.displayDetails();


        CarRental customRental = new CarRental("mayank", "cullinan", 15);
        customRental.displayDetails();
    }
}
