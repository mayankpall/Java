package com.bridgelabz.classandobject.levelone;


import java.util.Scanner;

class Circle {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

    public double calculateCircumference (double radius){
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea(radius));
        System.out.println("Circumference: " + calculateCircumference(radius));
    }

}


public class AreaAndCircumferenceOfCircle {

    private static Circle getCircleRadius(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radi = input.nextDouble();
        Circle circle = new Circle(radi);

        input.close();

        return new Circle(radi);


    }

    public static void main(String[] args){

        Circle circle = getCircleRadius();
        circle.displayDetails();




    }

}
