package com.bridgelabz.constructors.levelone;

import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    // Method to display booking details
    public void displayDetails() {
        System.out.println("\nHotel Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
}

public class HotelBookingSystem {
    private static HotelBooking getDetails(Scanner input) {
        System.out.print("Enter Guest Name: ");
        String guestName = input.nextLine();

        System.out.print("Enter Room Type: ");
        String roomType = input.nextLine();

        System.out.print("Enter Number of Nights: ");
        int nights = input.nextInt();

        return new HotelBooking(guestName, roomType, nights);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        HotelBooking mayank = getDetails(input);

        // Copying the details
        HotelBooking arnav = new HotelBooking(mayank);

        // Default booking
        HotelBooking arpit = new HotelBooking();

        // Displaying all details
        mayank.displayDetails();
        arnav.displayDetails();
        arpit.displayDetails();

        input.close();
    }
}
