package com.bridgelabz.constructors.levelone;

import java.util.Scanner;

class Circle{
    double radius;

    Circle(){
        this(0.0);
        System.out.println("Default constructor");
    }

    Circle(double radius){
        this.radius = radius;
        System.out.println("parameterize constructor");
    }

    public void displayRadius(){
        System.out.println("\nRadius is : "+radius);
    }

}


public class CircleDetails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        double radius = input.nextDouble();

        input.close();

        Circle circleOne = new Circle();
        circleOne.displayRadius();

        Circle circleTwo = new Circle(radius);
        circleTwo.displayRadius();
    }

}
