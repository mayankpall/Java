package com.bridgelabz.inheritance;

class Employee{
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("\nEmployee details  ");
        System.out.println("Name of employee : " + name);
        System.out.println("Id of employee : "+ id);
        System.out.println("Salary of employee : "+ salary);
    }

}

class Manager extends Employee{
    private int teamSize;

    Manager(String name, int id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team size of Manager is : " + teamSize);
    }

}

class Developer extends Employee {
    private String programmingLanguage ;

    Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language of Developer is : "+programmingLanguage);
    }
}


class Intern extends Employee {
    private String internTeam;

    Intern(String name, int id, double salary, String internTeam){
        super(name, id, salary);
        this.internTeam = internTeam;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Intern's team is in : " +internTeam);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employeeOne = new Manager("Mayank",01,100000,32);
        Employee employeeTwo = new Developer("Arnav", 02,10000,"Java");
        Employee employeeThree = new Intern("Vibhor",03, 10000,"developerTeam");


        employeeOne.displayDetails();
        employeeTwo.displayDetails();
        employeeThree.displayDetails();
    }
}
