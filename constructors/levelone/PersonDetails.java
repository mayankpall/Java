package com.bridgelabz.constructors.levelone;

class Person{
    String name ;
    int age;
    boolean isMale;

    Person(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    Person(Person p){
        this.name = p.name;
        this.age = p.age;
        this.isMale = p.isMale;
    }

    public void displayDetails() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (isMale ? "Male" : "Female"));
    }

}

public class PersonDetails {

    public static void main(String[] args){

        Person mayank = new Person("mayank", 22, true);
        mayank.displayDetails();

        Person arnav = new Person(mayank);
        arnav.displayDetails();
    }

}
