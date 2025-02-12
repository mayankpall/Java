package com.bridgelabz.classandobject.leveltwo;

import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;


    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;

    }

    //  book a ticket
    public boolean bookTicket() {

        System.out.println("Ticket booked successfully!");
        return true;
    }

    //  display ticket details
    public void displayTicket() {
        System.out.println("\nTicket Details:");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);

    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTicket ticket = getTicketDetails(scanner);

        ticket.displayTicket();



        scanner.close();
    }

    private static MovieTicket getTicketDetails(Scanner scanner) {
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter Seat Number: ");
        int seatNumber = scanner.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = scanner.nextDouble();

        return new MovieTicket(movieName, seatNumber, price);
    }
}
