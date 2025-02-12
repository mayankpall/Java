package com.bridgelabz.classandobject.levelone;

import java.util.Scanner;

class Mobile{
    String brand;
    String model;
    int price;

    Mobile(String brand , String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayMobileDetails (){
        System.out.println("\nMobile Details  ");
        System.out.println("Mobile brand : " + brand);
        System.out.println("Mobile model : " + model);
        System.out.println("Mobile price : " + price);
    }

}


public class MobilePhoneDetails {

    private static Mobile getMobileDetails(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Mobile Details ");

        System.out.print("Mobile Brand : ");
        String brand = input.next();

        System.out.print("Mobile Model : ");
        String model = input.next();

        System.out.print("Mobile Price : ");
        int price = input.nextInt();

        input.close();

        return new Mobile(brand, model, price);
    }

    public static void main(String[] args){
        Mobile newMobile = getMobileDetails();
        newMobile.displayMobileDetails();
    }


}
